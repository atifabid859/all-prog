<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Success Details</title>
</head>
<body>
<h1></h1>
 <h1>${user.fName}</h1>
<h1>${user.lName}</h1>
<h1>${user.address}</h1>
<h1>${user.email}</h1>
<h1>${user.password}</h1>
<h1>${user.mobile}</h1>
<h1>${user.date}</h1>
<h1>${user.gender}</h1>
<hr>
<h1>${user.address1.street}</h1>
<h1>${user.address1.city}</h1>
</body>
</html>