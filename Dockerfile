FROM adoptopenjdk/openjdk10:latest
LABEL maintainer="hojat.vaheb@gmail.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/mohajer-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} mohajer.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mohajer.jar"]
