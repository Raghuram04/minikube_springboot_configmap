FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} weblearnerrestful.jar
ENTRYPOINT ["java","-jar","/weblearnerrestful.jar"]