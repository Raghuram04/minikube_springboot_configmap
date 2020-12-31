package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weblearner.springboot.model.Employee;
import com.weblearner.springboot.service.EmployeeService;

@RestController
@RequestMapping("/weblearner")
public class EmployeeController {

	@Autowired
	private EmployeeService dummyService;
	
	@Value("${env}")
	private String env;

	// Get the employee detail based on employee id

	@GetMapping("/employee/{empid}")
	public Employee getEmployee(@PathVariable("empid") String empId) {
		Employee emp = dummyService.getEmployee(empId);	
		System.out.println("Environment"+ env);
		emp.setRoleDesc(env);
		return emp;
	}

}
