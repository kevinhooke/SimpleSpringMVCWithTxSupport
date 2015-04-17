<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
<form:form modelAttribute="person" action="savePerson" method="POST">

	<p>Name: <form:input path="name"/></p>

	<p><input type="submit" value="Save"/>
	
	<br/>
	
	<p><c:if test="${!empty person.name}">Person <c:out value="${person.name}"/> created.</c:if> </p>
</form:form>
</body>
</html>