FROM openjdk:17-alpine

VOLUME /tmp

ARG JAR_FILE=build/libs/helloworld-1.0.0.jar
ADD ${JAR_FILE} app.jar
ADD .env .env
EXPOSE 6060
ENTRYPOINT ["java","-jar","/app.jar"]
