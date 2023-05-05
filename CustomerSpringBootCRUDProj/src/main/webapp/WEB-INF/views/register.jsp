<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Register/Edit Page</title>
</head>
<body>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<h3>Welcome to Customer Edit Page</h3>
		<c:set var="eid"  value="${id}" ></c:set>
	</c:when>
	<c:otherwise>
		<h3>Welcome to Customer Registration Page</h3>
	</c:otherwise>
</c:choose>

<pre>
<form:form action="save" method="post" modelAttribute="employee">

<c:if test="${'edit' eq mode }">
Id     : <form:input path="id"  readOnly="true"/>	
</c:if>

name     : <form:input path="name"/>

phNum   	 : <form:input path="phNum"/>

email   : <form:input path="email"/>

<c:choose>
	<c:when test="${'edit' eq mode }">
		<input type="submit" value="Update Customer">
	</c:when>
	<c:otherwise>
		<input type="submit" value="Register Customer">
	</c:otherwise>
</c:choose>

</form:form>

</pre>

${msg}

<a href="/CustomerSpringBootCRUDProj/all">Show All</a> &nbsp;
<a href="/CustomerSpringBootCRUDProj/">Home</a>



</body>
</html>