<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Data Page</title>
</head>
<body>

	<h2>Welcome To Customer Data Page</h2>

	<c:if test="${empty list}">
		<h4>No Data Found</h4>
	</c:if>


	<c:if test="${!empty list}">

		<table border=2>
			<tr>
				<th>Id</th>
				<th>name</th>
				<th>phNum</th>
				<th>email</th>
			</tr>

			<c:forEach items="${list}" var="ob">
				<tr>
					<td>${ob.id}</td>
					<td>${ob.name}</td>
					<td>${ob.phNum}</td>
					<td>${ob.email}</td>
					<td><a href="/CustomerSpringBootCRUDProj/view?id=${ob.id}">View</a></td>
				</tr>
			</c:forEach>

		</table>

	</c:if>

	<a href="/CustomerSpringBootCRUDProj/reg">Register</a> ${msg} &nbsp;
	<a href="/CustomerSpringBootCRUDProj/">Home</a> ${msg}

</body>
</html>