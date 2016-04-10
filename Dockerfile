FROM java:8
EXPOSE 80
ADD gradle /tmp/build/gradle
ADD libs /tmp/build/libs
ADD src /tmp/build/src
ADD gradlew /tmp/build
ADD build.gradle /tmp/build
RUN cd /tmp/build && ./gradlew build && cp ./build/libs/*.jar /app.jar && cd / && rm -rf /tmp/build
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]