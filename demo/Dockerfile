FROM openjdk:21-jdk-slim

WORKDIR /app

# Copy the pre-built JAR file
COPY build/libs/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]