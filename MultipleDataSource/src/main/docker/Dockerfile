FROM frolvlad/alpine-openjdk7
VOLUME /tmp
ADD multipledatasource-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
ENTRYPOINT java, -Djava.security.egd=file:/dev/./urandom, -jar, /app.jar