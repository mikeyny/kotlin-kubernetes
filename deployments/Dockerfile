# Multi-stage build for better caching and smaller final image
FROM gradle:8.5-jdk21 AS builder

# Set working directory
WORKDIR /app

# Copy Gradle files first for better caching
COPY demo/gradle/ gradle/
COPY demo/gradlew demo/settings.gradle.kts ./
COPY demo/build.gradle.kts ./

# Copy source code
COPY demo/src/ src/

# Build the application
RUN ./gradlew build -x test

# Runtime stage
FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the JAR file from builder stage
COPY --from=builder /app/build/libs/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]