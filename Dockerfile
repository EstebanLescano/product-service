FROM openjdk:17
COPY target/product-microservice-0.0.1-SNAPSHOT.jar ./product-microservice.jar
EXPOSE 8080
CMD [ "java", "-jar", "product-microservice.jar" ]