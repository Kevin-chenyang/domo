FROM rsnair2/jdk1.8.0_25
ADD ./target/*.jar /
EXPOSE 8111
ENTRYPOINT ["java","-Xms1g","-Xmx2g","-jar","/demo-service.jar"]


