<%-- 
    Document   : student-confirmation
    Created on : Jul 30, 2022, 4:40:57 PM
    Author     : huongpham
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.io.*,java.util.Date, javax.servlet.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Confirmation</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
    </head>
    <body>
        <h1>Confirmation on Registration of the fellow student</h1>
        <h2>${student.firstName} ${student.lastName}</h2>
        <p> A ${student.schoolYear} from ${student.country} is successfully registered for:</p>
        <ul>
            <c:forEach var="temp" items="${student.courseList}">
                <li> ${temp} </li>
            </c:forEach>
            <c:forEach var="elecTemp" items="${student.selectedElective}">
                <li> ${elecTemp} </li>
            </c:forEach>
            
        </ul>
        
        <p>Today's date: <%
            Date date = new Date();
            out.print( date.toString());
            %></p>
    </body>
</html>
