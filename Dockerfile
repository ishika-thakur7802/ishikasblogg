# Use official Maven image to build the app
FROM maven:3.9.3-eclipse-temurin-17 as build
WORKDIR /app

# Copy source code
COPY . .

# Package the Spring Boot app (skips tests for faster builds)
RUN mvn clean package -DskipTests

# Use a slim JDK image to run the app
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
