<%-- 
    Document   : new-customer-form
    Created on : Aug 2, 2022, 5:03:25 PM
    Author     : huongpham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Customer Sign Up!</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
        <style>
            .error { color:red}
        </style>
    </head>
    <body>
        <h1>Welcome!</h1>
        <p> You're at the sign-up page for the new customer.<br>
            If you are already a registered customer, you can go to Login page to sign in instead. </p>
        <form:form action="processForm" modelAttribute="newCustomer" >
            First name: <form:input path="firstName"/>
            <br><br>
            Last name*: <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error" />
            <br><br>
            Age: <form:input path="age"/>
            <form:errors path="age" cssClass="error" />
            <br><br>
            Postal Code: <form:input path="postalCode"/>
            <form:errors path="postalCode" cssClass="error" />
            <br><br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>
