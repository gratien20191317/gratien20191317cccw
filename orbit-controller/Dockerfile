FROM openjdk:8

ADD target/orbit-controller-0.0.1-SNAPSHOT.jar orbit-controller.jar
EXPOSE 8082

ENTRYPOINT ["java","-jar","orbit-controller.jar"]
