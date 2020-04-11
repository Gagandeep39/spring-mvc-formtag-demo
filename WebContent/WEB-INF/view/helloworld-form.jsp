<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="processFormVersionThree" method="get">
		<input type="text" name="studentName" placeholder="What's your Name?"
			required>
		<button type="submit">Submit Query</button>
	</form>
</body>
</html>