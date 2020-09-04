FROM openjdk:14.0.2-jdk-slim
COPY target/github-actions-java-app-*-SNAPSHOT.jar /usr/local/bin/app.jar
RUN chmod +x /usr/local/bin/app.jar
CMD ["java", "-jar", "/usr/local/bin/app.jar"]