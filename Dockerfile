
# Base image with JDK
FROM openjdk:17-jdk-slim

# set working directory in container
WORKDIR /app

# copy jar file from the target folder
COPY target/employee-management-system-0.0.1-SNAPSHOT.jar ems-app.jar

# run the application
ENTRYPOINT ["java", "-jar", "ems-app.jar"]
