FROM openjdk:8-jre

EXPOSE 9020
ENTRYPOINT [ "java", "-D java.security.egd=file:/dev/./urandom", "-jar", "/opt/grape/order/app.jar" ]

ARG JAR_FILE
COPY target/${JAR_FILE} /opt/grape/order/app.jar






