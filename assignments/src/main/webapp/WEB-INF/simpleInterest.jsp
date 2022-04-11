<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Simple Interest Calculator</h1>
	<form action="/assignments/simpleInterestCalculator.html" method="post">
		<p>Principal Amount : <input type="number" name="principalAmount"/></p>
		<p>Time Span : <input type="number" name="timeSpan"/></p>
		<p>Rate of Interest : <input type="number" name="ROI"/></p>
		<input type="submit" value="Calculate SI"/>
	</form>
</body>
</html>