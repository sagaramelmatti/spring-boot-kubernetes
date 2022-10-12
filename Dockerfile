From openjdk:8
COPY target/*.jar spring-boot-kubernetes.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-kubernetes.jar"]
