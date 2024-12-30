FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/service-two.jar service-two.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service-two.jar"]