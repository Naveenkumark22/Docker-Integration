FROM openjdk:11
EXPOSE 8080
ADD target/Docker-IntegrationJar.jar Docker-IntegrationJar.jar
ENTRYPOINT ["java","-jar","Docker-IntegrationJar.jar"]