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
		
		<% List<Eleve> elevesList = (List<Eleve>) request.getAttribute("elevesData"); %>
		    	<h1> liste des titres des eleves :</h1>
		    
		<% for(int i = 0; i < elevesList.size(); i++){%>
			<p><strong>titre de eleve  <%=i+1%> :</strong>  <%=elevesList.get(i).getName()%></p>
			<a href="eleve-details?id=<%=elevesList.get(i).getUID()%>"> plus d'infos sur eleve <%=i+1%>  </a>
		<% }%>
		
	</body>
</html>