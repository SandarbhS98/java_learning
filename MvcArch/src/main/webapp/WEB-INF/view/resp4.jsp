<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>In Resp-4</title>
</head>
<body>
	<h1>This is Header 1 in Resp-4</h1>
	<br>
	<h4 style="color: red">${msg }</h4>
	<br>
	<form action="login" method="post">
		<input type="text" name="username" placeholder="Enter User Name"><br>
		<input type="password" name="password"
			placeholder="Enter Your Password"><br> <input
			type="submit" value="login">
	</form>

</body>
</html>