# Use official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the JAR file from target directory to the container
COPY target/rest-demo.jar app.jar

# Command to run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
