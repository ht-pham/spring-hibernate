<%-- 
    Document   : helloworld-form
    Created on : Jul 27, 2022, 1:26:29 PM
    Author     : huongpham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World - Check-In Form!</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
        <script src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
    </head>
    <body>
        <img src="${pageContext.request.contextPath}/resources/images/spring-logo.png" 
             onmouseover="showAlt()"/>
        <h2>Welcome!</h2>
        
        <form action="welcomePage" method="POST">
            <input type="text" name="guestName"
                   placeholder="Please enter your name!"/>
            <input type="submit"/>
        </form>
        
    </body>
</html>
