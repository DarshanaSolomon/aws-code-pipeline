FROM openjdk:8
EXPOSE 5000
ADD target/aws-code-pipeline.jar aws-code-pipeline.jar
ENTRYPOINT ["java","-jar","/aws-code-pipeline.jar" ]