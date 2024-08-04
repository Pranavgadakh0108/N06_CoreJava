<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
<style>
	h1
	{
		color:blue;
	}
</style>
</head>
<body>
	<%
		String myname =(String) session.getAttribute("name_key");
	%>
	<h1 >Welcome : <%= myname %></h1><br><br>
	
	<a href="home.jsp">Home</a> &nbsp;&nbsp;
	<a href="about-us.jsp">About Us</a>
	<br><br>
	<a href="Logout" style="border: 2px solid black ; padding: 3px; background-color: orange">Logout</a>
</body>
</html>