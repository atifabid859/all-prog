<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>called by home controller</h1>
	<h1>url/home</h1>
	<%
	String s = (String) request.getAttribute("name");
	Integer i = (Integer) request.getAttribute("Id");
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Name is<%=s%>
	</h1>
	<h1>
		Id is
		<%=i%></h1>
	<%
	for (String name : friends) {
	%>
	<h1><%=name%></h1>
	<%
	}
	%>



</body>
</html>