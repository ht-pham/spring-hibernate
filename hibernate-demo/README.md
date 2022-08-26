## Project 5: Basic Database App using Hibernate
### Summary
This is a simple demo app which uses Hibernate framework to communicate with the database and perform basic CRUD operations. 
### Directory Explained
- Folder 'database': (1) The 01-create-user.sql is for setting up a new user account who has full access and authorization to the database, (2) the hb_student_tracker_student.sql file is used for building the database with the 'student' table.
- Folder 'src': all the source codes are located as well as Hibernate configuration file
- Folder 'lib': all libraries/frameworks that are used for this project
- Folder 'dist': .jar file to run the project locally as well as libraries used for this project
### Tools
- JDK 8.0 or JDK 11 
- Hibernate version **5.6**
- MySQL and MySQLWorkBench ( see installation instruction [here](https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/) and MySQL Workbench download [here](https://dev.mysql.com/downloads/workbench/))
### How to run the project
To run the project from the command line, go to the dist folder and type the following:

```java -jar "hibernate-demo.jar" ```

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.
