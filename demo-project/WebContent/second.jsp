<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="demo.pac.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
User user = new User();
user.setFirstname(request.getParameter("fname"));
user.setLastname(request.getParameter("lname"));
session.setAttribute("user", user);
%>
<h2>second form</h2>
<form method="post" action="final.jsp">
Your email: <input type="text" name="email"><br>
Your phone: <input type="text" name="phone"><br>
<button>Submit</button>
</form>
</body>
</html>