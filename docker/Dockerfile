FROM openjdk:11
ADD target/docker-prime-numbers.jar docker-prime-numbers.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-prime-numbers.jar"]