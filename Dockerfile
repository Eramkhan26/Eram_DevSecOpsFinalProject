#FROM eclipse-temurin:17-jre-alpine
#
#WORKDIR /app
#
#COPY target/sample-java-assignment-app-0.0.1-SNAPSHOT.jar app.jar
#
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","app.jar"]




# Build stage
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]