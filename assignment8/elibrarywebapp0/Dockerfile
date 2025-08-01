FROM openjdk:21-jdk-slim as build

WORKDIR /app

COPY target/elibrarywebapp.jar app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]