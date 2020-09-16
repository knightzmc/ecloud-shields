FROM clojure
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY project.clj /usr/src/app/
RUN lein deps
COPY . /usr/src/app
RUN lein uberjar

COPY target/uberjar/ecloud-shields.jar /ecloud-shields/app.jar

EXPOSE 3000
CMD ["java", "-jar", "app-standalone.jar"]
