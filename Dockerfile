# ---- Build Stage ----
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom and source from subdirectory
COPY music-recommender/pom.xml .
COPY music-recommender/src ./src

# Build the JAR (skip tests for faster build)
RUN mvn clean package -DskipTests

# ---- Run Stage ----
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/target/music-recommender-1.2-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
