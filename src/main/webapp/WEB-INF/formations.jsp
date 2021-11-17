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
		
		<% List<Formation> formationList = (List<Formation>) session.getAttribute("formationSession"); %>
		 
		    	<h1> liste des titres des formations :</h1>
		    
		<% for(int i = 0; i < formationList.size(); i++){%>
			<p><strong>titre de la formation  <%=i+1%> :</strong>  <%=formationList.get(i).getTitle()%></p>
			<a href="formation-details?id=<%=formationList.get(i).getUID()%>"> plus d'infos sur la formation <%=i+1%>  </a>
		<% }%>
		
	</body>
</html>