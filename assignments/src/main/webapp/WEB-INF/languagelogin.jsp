<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="Spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><a href="/assignments/languageLogin.html?siteLanguage=en">Login(English)</a><a href="/assignments/languageLogin.html?siteLanguage=fr">Login(French)</a><a href="/assignments/languageLogin.html?siteLanguage=vi">Login(Vietnamese)</a></p>
	<form:form commandName="label">
		<p><Spring:message code="label.username"/> : <input type="text"/></p>
		<p><Spring:message code="label.password"/> : <input type="text"/></p>
		<input type="submit" <Spring:message code="label.login"/>/>
	</form:form>
</body>
</html>