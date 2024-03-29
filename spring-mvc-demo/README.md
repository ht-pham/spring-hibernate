## Project 4: The First Java Web App
### Summary
Finally, the first Java web app is built with Spring framework libraries! The web app has 3 hyperlink links for 3 mini projects. The links are used to redirect the users to some simple webapp forms which are built with a basic frontend design using .JSP files with CSS, JavaScript files and a basic backend configuration with Java classes with Spring framework's libraries.
### Directory Explained
Folder 'build': contains built Java classes, websites (.jsp,css,js files), and **libs** which has all .jar files to run the project. 
<br>
Folder 'src': where all Java classes including View Controllers and Model classes locate.
<br>
Folder 'web': where all files for frontend design locates plus two configuration .xml files (one for Spring app, other for web service)
### Tools
1. The best JDK version to run the project: JDK 8 or JDK 11. 
2. The Spring framework version to run project: either version 5.3.9 (as latest when this project is uploaded) or any older version.
3. Other packages/framework/APIs: Hibernate Validator version **6.2.3** (the only latest version that still works with Java EE and Spring 5)
4. Last but not least (i.e. required): Apache Tomcat version 9.0 (Newer version cannot support this application). Make sure Apache Tomcat is added as one of servers on your favorite IDE. (see [instruction #3](https://javapointers.com/how-to/add-tomcat-server-netbeans/) for adding Tomcat to NetBeans)
### How to run the project
You can either download the spring-mvc-demo folder, open and run it in your favorite IDE or export the project as .WAR file to deploy the app on Tomcat. (Note: the .WAR file for this project is 45MB exceeding the allowed max size of a file for upload on Git so you have to export the project yourself via your IDE). After exporting to .WAR, deploy your new WAR file by copying it to <tomcat-install-directory>\webapps. Once deployment is completed, a folder which has the same name as your WAR file will be created. To visit your web app, go to: http://localhost:8080/<web-app-name\>/

