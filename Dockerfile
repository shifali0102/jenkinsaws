FROM tomcat:8.0
MAINTAINER Shifali Srivastava "shifalisrivastava4343@gmail.com"
ADD target/myweb-0.0.5.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
