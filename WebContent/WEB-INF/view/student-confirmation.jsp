<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Required for JSTL for loop -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student details</h2>
	<hr>
	<br>First name: ${student.firstName}
	<br>Last name: ${student.lastName }
	<br>Country: ${student.country }
	<br>Favourite Language: ${student.favouriteLanguage }
	<br>operating Ststem:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>