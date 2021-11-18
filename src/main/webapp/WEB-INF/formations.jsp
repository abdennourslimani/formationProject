<%@page import="java.util.List"%>
<%@page import="model.Formation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		
		<% for (Formation formation : (List<Formation>) request.getAttribute("formations")) { %>
		<li>	
			<a href="formation-details?title=<%= formation.getTitle() %>"><%= formation.getTitle() %></a>
		</li>
	<% } %>
		
	</body>
</html>


		