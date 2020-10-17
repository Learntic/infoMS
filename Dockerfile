FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY target/infoMS-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/infoMS-0.0.1-SNAPSHOT.jar"]