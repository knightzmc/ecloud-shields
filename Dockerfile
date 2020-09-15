FROM openjdk:8-alpine

COPY target/uberjar/ecloud-shields.jar /ecloud-shields/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/ecloud-shields/app.jar"]
