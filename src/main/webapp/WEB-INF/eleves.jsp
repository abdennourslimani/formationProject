<%@page import="java.util.List"%>
<%@page import="model.Eleve"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		
			<% for (Eleve eleve : (List<Eleve>) request.getAttribute("eleves")) { %>
		<li>	
			<a href="eleve-details?id=<%= eleve.getUID() %>"><%= eleve.getName() %></a>
		</li>
	<% } %>
		
	</body>
</html>


