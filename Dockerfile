FROM openjdk:8

ADD target/demo-0.0.1-SNAPSHOT.jar demoservice.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","demoservice.jar"]
