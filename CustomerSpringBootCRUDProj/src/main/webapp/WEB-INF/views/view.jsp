<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer View Page</title>
</head>
<body>

<h2>Welcome to Customer View Page</h2>

<table border=2>

<tr>
	<th>Id</th>
	<td>${emp.id}</td>
</tr>
<tr>
	<th>name</th>
	<td>${emp.name}</td>
</tr>
<tr>
	<th>phNum</th>
	<td>${emp.phNum}</td>
</tr>
<tr>
	<th>email</th>
	<td>${emp.email}</td>
</tr>

<tr>
	<th>Delete</th>
	<td>
		<a href="/CustomerSpringBootCRUDProj/delete?id=${emp.id}">Delete</a>
	</td>
</tr>
<tr>
	<th>Update</th>
	<td>
		<a href="/CustomerSpringBootCRUDProj/getUpdate?id=${emp.id}">Update</a>
	</td>
</tr>

</table>

<a href="/CustomerSpringBootCRUDProj/all">View All</a> &nbsp;
<a href="/CustomerSpringBootCRUDProj/reg">Register</a> &nbsp;
<a href="/CustomerSpringBootCRUDProj/">Home</a>

${msg}

</body>
</html>