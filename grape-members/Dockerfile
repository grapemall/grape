FROM openjdk:8-jre

EXPOSE 9030
ENTRYPOINT [ "java", "-D java.security.egd=file:/dev/./urandom", "-jar", "/opt/grape/members/app.jar" ]

ARG JAR_FILE
COPY target/${JAR_FILE} /opt/grape/members/app.jar






