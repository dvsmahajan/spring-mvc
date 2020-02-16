<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="lightpink">
<h1> Thank you for adding ${ key }</h1>
<form action="home.de" method="post">
Item Details:<input type="text" name="item">
Quantity:<input type="text" name="quantity">
price:<input type="number" name="price">
<input type="submit" value="Buy Now">
</form>
</body>
</html>