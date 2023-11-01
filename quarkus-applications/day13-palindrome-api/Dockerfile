#Install JDK 17
FROM openjdk:17-alpine
#Copy the jar file
COPY build/day13-palindrome-api-1.0.0-runner.jar app.jar

ENV GREETINGS="Hello from Dockerfile"

#Run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
