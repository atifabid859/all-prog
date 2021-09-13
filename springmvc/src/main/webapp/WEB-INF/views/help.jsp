<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %> 
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help home page</title>
</head>
<body>
<h1> this is my name AtifAbid</h1>
<h1>where do you live</h1>
 <% 
/* String name=(String)request.getAttribute("name");
Integer integer=(Integer)request.getAttribute("roolNumber");
String string=(String)request.getAttribute("City");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");
 */
%> 
<h1>this is my name ${name} 
<%-- <%=name %> --%></h1>
<h1>this is my roolNumber${integer}
<%-- <%=integer %> --%></h1>
<h1>this is my city ${City}
<%-- <%=string %> --%></h1>
<h1>how much time ${time}
<%-- <%=time %> --%></h1>
<hr>
<c:forEach var="item" items="${marks}">
<%-- <h1>${item}</h1> --%>
<h1><c:out value="${item}"></c:out></h1>

</c:forEach>
</body>
</html>