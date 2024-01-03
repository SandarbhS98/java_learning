<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>In Resp-6</title>
</head>
<body>
    <h3>List Without Iteration :</h3>
    ${liststs}

    <h3>List With Iteration :</h3>
    <ul>
        <c:forEach var="lists" items="${liststs}">
            <li>${lists}</li>
        </c:forEach>
    </ul>
</body>

</html>