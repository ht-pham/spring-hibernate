<%-- 
    Document   : student-form
    Created on : Jul 30, 2022, 4:27:12 PM
    Author     : huongpham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration Form</title>
        <link rel="stylesheet" type="text/css" 
              href="${pageContext.request.contextPath}/resources/css/my-test.css">
        <style>
            .error { color:red}
        </style>
    </head>
    <body>
        <h2>Student Registration Form</h2>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName" />
            <br><br>
            Last name: <form:input path="lastName" />
            <br><br>
            Country: 
                <form:select path="country">
                    <%--
                    <form:option value="Argentina" label="Argentina" />
                    <form:option value="Australia" label="Australia" />
                    <form:option value="Bangladesh" label="Bangladesh" />
                    <form:option value="Brazil" label="Brazil" />
                    <form:option value="China" label="China" />
                    <form:option value="Costa Rica" label="Costa Rica" />
                    <form:option value="Czech Republic" label="Czech Republic" />
                    <form:option value="Finland" label="Finland" />
                    <form:option value="France" label="France" />
                    <form:option value="Germany" label="Germany" />
                    <form:option value="Greece" label="Greece" />
                    <form:option value="Hungary" label="Hungary" />
                    <form:option value="Iceland" label="Iceland" />
                    <form:option value="India" label="India" />
                    <form:option value="Ireland" label="Ireland" />
                    <form:option value="Israel" label="Israel" />
                    <form:option value="Italy" label="Italy" />
                    <form:option value="Jamaica" label="Jamaica" />
                    <form:option value="Japan" label="Japan" />
                    <form:option value="Laos" label="Laos" />
                    <form:option value="Malaysia" label="Malaysia" />
                    <form:option value="Mexico" label="Mexico" />
                    <form:option value="Morocco" label="Morocco" />
                    <form:option value="New Zealand" label="New Zealand" />
                    <form:option value="Netherlands" label="Netherlands" />
                    <form:option value="Nigeria" label="Nigeria" />
                    <form:option value="Portugal" label="Portugal" />
                    <form:option value="Singapore" label="Singapore" />
                    <form:option value="South Korea" label="South Korea" />
                    <form:option value="Sri Lanka" label="Sri Lanka" />
                    <form:option value="United Arab Emirates" label="United Arab Emirates" />
                    <form:option value="United Kingdom" label="United Kingdom" />
                    <form:option value="United States of America" label="United States of America" />
                    <form:option value="Venezuela" label="Venezuela" />
                    <form:option value="Vietnam" label="Vietnam" />
                    --%>
                    <%-- OR --%>
                    <%-- Use form:options instead --%>
                    <%-- <form:options items="${student.countryOptions}"/> --%>
                    <%-- OR --%>
                    <%-- Use .properties file--%>
                    <form:options items="${theCountryOptions}" />
                </form:select>
            <br><br>
            Major: <form:input path="majorCode" />
            <form:errors path="majorCode" cssClass="error" />
            <br><br>
            School year:
                <%-- Option 1: form:radiobutton --%>
                <%--
                <form:radiobutton path="schoolYear" value="Freshman" /> Freshman
                <form:radiobutton path="schoolYear" value="Sophomore" /> Sophomore
                <form:radiobutton path="schoolYear" value="Junior" /> Junior
                <form:radiobutton path="schoolYear" value="Senior" /> Senior
                --%>
                <%-- Option 2: form:radiobuttons --%>
                <form:radiobuttons path="schoolYear" items="${student.schoolYearChoice}" />
            <br><br>
            Main Courses to register:
            <br><br>
                <%-- Option 1: Single choices form:checkbox --%>
                <form:checkbox path="courseList" value="Operating System" /> Operating System
                <form:checkbox path="courseList" value="Intro to programming" /> Intro to Programming
                <form:checkbox path="courseList" value="Discrete Math" /> Discrete Math
                <form:checkbox path="courseList" value="Software Engineering" /> Software Engineering
                <form:checkbox path="courseList" value="Computer Architecture" /> Computer Architecture
                <form:checkbox path="courseList" value="Network Security" /> Network Security
                <form:checkbox path="courseList" value="Intro to Data Mining" /> Intro to Data Mining
            <br><br>
            Elective courses to register:
                <%-- Option 2: Using form:checkboxes with items in array --%>
                <form:checkboxes path="selectedElective" items="${student.electiveList}" checked=""/>
            <br><br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
