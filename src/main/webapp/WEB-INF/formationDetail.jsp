<%@page import="model.Formation"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/eleves.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="container_formation flex">	
		
<% Formation formation = (Formation) request.getAttribute("formation"); %>
		<h1><%= formation.getTitle() %></h1>
		<p>
			<%= formation.getProgramme() %>
		</p>
		
		<p>
			<%= formation.getNbEleves() %>
		</p>
		
	</div>

</body>
</html>