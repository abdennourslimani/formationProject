<%@page import="model.Eleve"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/eleves.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		
			<div class="container_formation flex">	
		
		<% Eleve eleve = (Eleve) request.getAttribute("eleve"); %>
		<h1><%= eleve.getName() %></h1>
		<p>
			<%= eleve.getSurname() %>
		</p>
		
		<p>
			<%= eleve.getAge() %>
		</p>
		
		<p>
			<%= eleve.getNote() %>
		</p>
		<p>
			<%= eleve.getFormation().getTitle() %>
		</p>
		
		</div>
		
		
</body>
</html>