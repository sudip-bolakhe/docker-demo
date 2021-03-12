FROM java:8
VOLUME /usr/docker-demo
COPY  ./build/libs/greetingapp-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java", "-jar", "greetingapp-0.0.1-SNAPSHOT.jar"]