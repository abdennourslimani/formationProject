<%@page import="model.Formation"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
<% Formation formation = (Formation) request.getAttribute("formation"); %>
		<h1><%= formation.getTitle() %></h1>
		<p>
			<%= formation.getProgramme() %>
		</p>
		
		<p>
			<%= formation.getNbEleves() %>
		</p>
		


</body>
</html>