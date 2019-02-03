FROM openjdk:8
ADD target/patient-0.0.1-SNAPSHOT.jar patient-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "patient-0.0.1-SNAPSHOT.jar"]