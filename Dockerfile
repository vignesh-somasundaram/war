FROM tomcat:8.0.20-jre8
COPY /target/docker-spring-boot.war /usr/local/tomcat/webapps/