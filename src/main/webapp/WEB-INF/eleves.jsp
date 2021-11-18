<%@page import="java.util.List"%>
<%@page import="model.Eleve"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/formations.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
	
			<div class="container_formation flex">	
			<% for (Eleve eleve : (List<Eleve>) request.getAttribute("eleves")) { %>
			
			<a href="eleve-details?id=<%= eleve.getUID() %>"><%= eleve.getName() %></a>
		
	<% } %>
		</div>
	</body>
</html>


