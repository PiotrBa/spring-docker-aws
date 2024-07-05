FROM openjdk:21
LABEL author="piotrBa"
EXPOSE 8080
ADD target/spring-docker-aws-0.0.1-SNAPSHOT.jar spring-app.jar
ENTRYPOINT ["java", "-jar", "spring-app.jar"]