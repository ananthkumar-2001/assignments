<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="/assignments/afterLogin.html" method="post">
		<p>UserName : <input type="text" name="userName"/></p>
		<p>Password : <input type="text" name="password"/></p>
		<p>Email    : <input type="email" name="email"/></p>
		<input type="submit" value="Login"/> 
	</form>
</body>
</html>