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
		String myname =(String) request.getAttribute("name_key");
	%>
	<h1 >Welcome : <%= myname %></h1>
</body>
</html>