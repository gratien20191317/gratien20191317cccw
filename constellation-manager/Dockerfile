FROM openjdk:8

ADD target/constellation-manager-0.0.1-SNAPSHOT.jar constellation-manager.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","constellation-manager.jar"]
