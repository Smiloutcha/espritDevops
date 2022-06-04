FROM openjdk:11-jdk-alpine
EXPOSE 8090
ADD target/devops-0.0.1-SNAPSHOT.jar devops-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/timesheet-devops-1.0.jar"]
