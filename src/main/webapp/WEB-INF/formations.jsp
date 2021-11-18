<%@page import="java.util.List"%>
<%@page import="model.Formation"%>
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
	
				<h1>List des formations</h1>
	
				<div class="container_formation flex">	
		
		<% for (Formation formation : (List<Formation>) request.getAttribute("formations")) { %>
			<a href="formation-details?title=<%= formation.getTitle() %>"><%= formation.getTitle() %></a>
	
	<% } %>
			</div>
	</body>
</html>


		