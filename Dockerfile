FROM openjdk
EXPOSE 9000
ADD target/springboot-docker-k8s-0.0.1-SNAPSHOT.jar springboot-docker-k8s.jar
ENTRYPOINT ["java", "-jar", "/springboot-docker-k8s.jar"]