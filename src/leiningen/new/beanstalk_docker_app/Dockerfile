# Dockerfile for clojure apps on AWS Elastic Beanstalk
# v0.0.1

FROM dockerfile/java
MAINTAINER Michael McClintock, mrmcc3@gmail.com
ADD target/production.jar /root/
EXPOSE 8080
CMD ["java", "-jar", "/root/production.jar"]

# SUPPORT JVM OPTS ?
