<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
	.errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
</style>
</head>
<body>
	<form action="/assignments/afterregister" method="post">
	<form:errors path = "*" cssClass = "errorblock" element = "div" />
		<p>Username : <input type="text" name="userName"/></p>
		<p>Password : <input type="text" name="password"/></p>
		<p>Email    : <input type="email" name="email"/></p>
		<p>Contact  : <input type="text" name="contact"/></p>
		<p><label for="city">City :</label>
  			<select name="city" id="city">
    			<option value="Pune">Pune</option>
    			<option value="Delhi">Delhi</option>
    			<option value="Hyderabad">Hyderabad</option>
    			<option value="Banglore">Banglore</option>
  			</select></p>
		<p>Zipcode  : <input type="text" name="zipCode"/></p>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>