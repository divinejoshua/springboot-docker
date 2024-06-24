FROM openjdk:latest
LABEL authors="divine.er"
ARG JAR_FILE=target/*.jar
COPY ./target/docker-java-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]