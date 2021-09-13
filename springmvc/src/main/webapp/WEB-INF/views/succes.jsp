<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Success Page</title>
</head>
<body>

<h1>${Header}</h1>
<p>${Desc} </p>
<hr>
<%
String userName=(String)request.getAttribute("uname");
String userEmail=(String)request.getAttribute("email");
String userPassword=(String)request.getAttribute("password");
%>
<h1>my name ${user.uname}</h1>
<h1>my email ${user.email}</h1>
<h1>my password ${user.password}</h1>

<%-- <h1>this is UserName  <%= userName %></h1>
<h1>this is UserEmail  <%= userEmail %></h1>
<h1>this is UserPassword  <%= userPassword %></h1> --%>
</body>
</html>