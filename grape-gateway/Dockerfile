FROM openjdk:8-jre

EXPOSE 9010
ENTRYPOINT [ "java", "-D java.security.egd=file:/dev/./urandom", "-jar", "/opt/grape/gateway/app.jar" ]

ARG JAR_FILE
COPY target/${JAR_FILE} /opt/grape/gateway/app.jar






