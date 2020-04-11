<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{color: red;}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		<br>First Name: <form:input path="firstName"/>
		<br>Last Name(*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br>Free Passes: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error" />
		<br>Pincode: <form:input path="pincode"/>
		<form:errors path="pincode" cssClass="error" />
		<br>Course Code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error" />
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>