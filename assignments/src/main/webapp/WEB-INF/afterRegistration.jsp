<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>You have Successfully Registered</h1>
	<table>
		<tr>
			<td>Username : </td>
			<td>${ cust1.userName }</td>
		</tr>
		<tr>
			<td>Password : </td>
			<td>${ cust1.password }</td>
		</tr>
		<tr>
			<td>Email : </td>
			<td>${ cust1.email }</td>
		</tr>
		<tr>
			<td>Contact : </td>
			<td>${ cust1.contact }</td>
		</tr>
		<tr>
			<td>City : </td>
			<td>${ cust1.city }</td>
		</tr>
		<tr>
			<td>Zipcode : </td>
			<td>${ cust1.zipCode }</td>
		</tr>
	</table>
</body>
</html>