FROM openjdk:11
COPY "./target/spring-boot-docker.jar" "micro-proveedores.jar"
EXPOSE 9096
ENTRYPOINT [ "java", "-jar", "micro-proveedores.jar" ]
