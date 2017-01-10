if you want to use embeded H2 db you have to move data.sql and schema.sql in this folder to resource
folder and uncomment the application.properties file and pom.xml
anyway id field will be only displayed due to below setting
run first time using below
spring.jpa.hibernate.ddl-auto=create
then
spring.jpa.hibernate.ddl-auto=update