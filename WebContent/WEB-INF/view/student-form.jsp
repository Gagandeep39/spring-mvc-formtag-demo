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
	<h2>Student form</h2>
	<hr>
	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName" /><br>
	Last Name: <form:input path="lastName"/><br>
	Country: 
	<form:select path="country"><br>
	<form:options items="${student.countryList}"/>
	</form:select>	<br>
	Gender:
	Java<form:radiobutton path="favouriteLanguage" value="Java"/>
	Type Script<form:radiobutton path="favouriteLanguage" value="TypeScipt"/>
	Dart<form:radiobutton path="favouriteLanguage" value="Dart"/>
	Kotlin<form:radiobutton path="favouriteLanguage" value="Kotlin"/><br>
	
	Operating Systems: 
	Linux<form:checkbox path="operatingSystems" value="Linux"/>
	Windows<form:checkbox path="operatingSystems" value="Windows"/>
	Mac OS<form:checkbox path="operatingSystems" value="Maca OSX"/>
	<br>
	<input type="submit" value="Submit">
	</form:form>

	<!-- modelAttribute="student" refers to student object, if a field is usedthat isnt in student then code will crash -->
	<!-- On start, path: will call getter method for that path name eg. getFirstName() -->
	<!-- On submit, path: will call setter method for that path name eg. getFirstName() -->
	<!-- In option, value -> value that will be stored in object, label -> value shown to enduser -->
	<!-- Static reading of data -->
	<%-- <form:select path="country">
		<form:option value="India" label="India" />
		<form:option value="USA" label="USA" />
		<form:option value="Canada" label="Canada" />
		<form:option value="France" label="France" />
	</form:select><br> --%>
	<!-- items="${student.countryList}" Will refer to student opject of modelAttribute -->
	<!-- Program wll crash i there are not gette and setters -->
	<!-- "student" key name specified in controller will be used to refer as modelAttribute name in jsp -->
</body>
</html>