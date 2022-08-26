## Project 6: An Employee Database App

### Summary
For the purpose of practicing Hibernate as well as SQL, this project is an employee management app which uses Hibernate to communicate with the database and perform basic CRUD operations. The database is created by using MySQL.

The Employee table has 4 columns with id being the primary key. For example:
| id  | first_name | last_name |     company       |
|:---:|:----------:|:---------:|:-----------------:|
|1|Jason|Willard|Caritas LLC|
|2|Charlene|Cork|Caritas LLC|
|3|Krystal|Kim|Caritas LLC|
|null|null|null|null|

The Java program have Hibernate configured with login info of the hiring manager 'hrmanager' to have access to database without the need of logging into the account in MySQL Workbench. With the configuration, the program will perform basic CRUD operations (i.e. create, read, update, and delete employee records) directly onto the 'employee' table.

### Directory Explained
- Folder 'sql-scripts': where all sql scripts used for building the database, 'employee' table, and other basic operations (i.e. add & read employees' records) as well as creating hiring manager account to manage the database.
- Folder 'src': where all source codes for Java program are saved.
- Folder 'dist': where the classpath including the hibernate-employee.jar file (for running the program) and Hibernate libraries
- Folder 'lib': where all the libraries needed for this project are located.
### Tools
1. MySQL & MySQLWorkBench ( see installation instruction for MySQL [here](https://dev.mysql.com/doc/mysql-installation-excerpt/5.7/en/) and for downloading MySQL Workbench [here](https://dev.mysql.com/downloads/workbench/))
2. JDK version: 8.0 or 11.0
3. Java IDE: any (i.e. your favorite IDE for Java)
4. Hibernate: version **5.6** (this is the latest version that still support Java EE; the later version 6.2 only support Jarkata EE)
### How to run the project
To run the project from the command line, go to the dist folder and type the following:

```java -jar "hibernate-employee.jar" ```

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.
