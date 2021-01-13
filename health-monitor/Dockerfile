FROM openjdk:8

ADD target/health-monitor-0.0.1-SNAPSHOT.jar health-monitor.jar
EXPOSE 8081

ENTRYPOINT ["java","-jar","health-monitor.jar"]
