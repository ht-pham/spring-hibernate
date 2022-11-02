<%-- 
    Document   : customer-confirmation
    Created on : Aug 2, 2022, 5:27:21 PM
    Author     : huongpham
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.io.*,java.util.Date, javax.servlet.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Successfully Registered Customer</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
        <style>
            p { text-align: left;}
        </style>
    </head>
    <body>
        <h1>Welcome!</h1>
        <p>Dear ${newCustomer.firstName} ${newCustomer.lastName},
            <br> 
            You have successfully signed up for the reward membership program. 
            Many valuable rewards and discounts are waiting for you as you're making new purchases online or at the store.</p>
        <p style="font-size:smaller;"> The store has a new ${newCustomer.age}-years-old customer join the store's membership program. Today's date: <%
            Date date = new Date();
            out.print( date.toString());
            %>. </p>
    </body>
</html>
