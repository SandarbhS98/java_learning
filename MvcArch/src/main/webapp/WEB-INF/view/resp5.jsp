<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>In Resp-5</title>
</head>
<body>
	<h1>This is Header 1 in Resp-5</h1>
	<br>
	<h4 style="color: red">${msg }</h4>
	<h5 style="color: red" >${uss }</h5>
	<br>
	<form action="registration" method="post">
		<input type="number" name="id" placeholder="Enter User id"><br>
		<input type="text" name="name" placeholder="Enter Your Full Name"><br>
		<input type="text" name="username" placeholder="Enter User Name"><br>
		<input type="password" name="password" placeholder="Enter Your Pwd"><br> 
		<input type="number" name="age" placeholder="Enter Your Age"> <br>
		<input type="submit" value="Registration">
	</form>
</body>
</html>