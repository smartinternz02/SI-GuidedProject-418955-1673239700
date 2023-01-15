
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /home/app/target/flightaware-0.0.1-SNAPSHOT.jar /usr/local/lib/falcon.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/falcon.jar"]
