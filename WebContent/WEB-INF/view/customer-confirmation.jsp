<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<h2>Customer Confirmation</h2>
	<hr>
	<br>Customer first Name: ${customer.firstName }
	<br>Customer first Name: ${customer.lastName }
	<br>Free Passes: ${customer.freePasses }
	<br>Pincode: ${customer.pincode }
	<br>Coursecode: ${customer.courseCode }
</body>
</html>