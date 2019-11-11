<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="demo.pac.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Results </title>
</head>
<body>
<h1> Result:</h1>
<br><h2>User Details: 
<%
User user = (User)session.getAttribute("user");
user.setEmail(request.getParameter("email"));
user.setPhone(request.getParameter("phone"));
session.setAttribute("user", user);
 %>
 
 <%
User u = (User)session.getAttribute("user");
out.println(u.getFirstname());
out.println(u.getLastname());
out.println(u.getEmail());
out.println(u.getPhone());
%>
</h2>

</body>
</html>