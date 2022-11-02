<%-- 
    Document   : main-menu
    Created on : Jul 27, 2022, 12:35:29 PM
    Author     : huongpham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World!</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Welcome! You are at the main page of my portfolio page!</p>
        <p>My name is Hannah Pham.</p>
        
        <a href="hello/showForm"><h2>Spring MVC Project #1: Process a basic Input Form (Without Data Biding)</h2></a>
        <a href="student/registrationForm"><h2>Spring MVC Project #2: Process a Student Registration Form</h2></a>
    </body>
</html>
