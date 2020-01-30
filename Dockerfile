FROM openjdk:8-jre-alpine

COPY target/poc-apoderados-rest-api-1.0.0-SNAPSHOT.jar /

WORKDIR /

CMD ["java", "-jar", "/poc-apoderados-rest-api-1.0.0-SNAPSHOT.jar"]