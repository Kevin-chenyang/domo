FROM rsnair2/jdk1.8.0_211
ADD ./target/*.jar /
EXPOSE 8111
ENTRYPOINT ["java","-Xms1g","-Xmx2g","-jar","/demo-service.jar"]


