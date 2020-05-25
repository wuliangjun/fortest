FROM openjdk:8-jdk-alpine
ADD target/demo-1.0-SNAPSHOT.jar demo-1.0-SNAPSHOT.jar
ENV TZ Asia/Shanghai
VOLUME /tmp
EXPOSE 8088
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-1.0-SNAPSHOT.jar"]