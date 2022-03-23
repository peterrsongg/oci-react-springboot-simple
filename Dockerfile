FROM openjdk:11
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]