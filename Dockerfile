FROM openjdk:8-jdk-alpine
EXPOSE 8090
ADD target/devops-0.0.1-SNAPSHOT.jar devops-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/devops-0.0.1-SNAPSHOT.jar"]
