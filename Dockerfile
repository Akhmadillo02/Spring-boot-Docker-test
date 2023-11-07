FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/Docker-cllaswork-2.jar java1.jar
ENTRYPOINT ["java","-jar","java1.jar"]