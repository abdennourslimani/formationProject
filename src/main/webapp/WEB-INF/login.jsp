<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="css/login.css">
<title>Insert title here</title>
</head>
<body>
			
			
		<div class=form_container>
			<h1> Login</h1>
			<form method = "POST"  Action="login">
			<table>
				<tr class="flex_row_form">
				   <td> <input class="input" type="text" name="pseudo" id ="login"  placeholder="entrez votre pseudo "  autofocus/></td>
				</tr>
				<tr class="flex_row_form">
					<td> <input class ="input" type="password"  name="password" id ="password" placeholder="entrez votre mot de passe " /></td>
				</tr>
				
				<tr><td><input class="submit" type="submit"  value="se connecter"  /></td> </tr>
				
			</table>
			<div id="resultat">
			
			<%String firstConnect =(String)request.getAttribute("firstConnect");%>
			<%String msg =(String)request.getAttribute("msg");%>
			
			
			<%if(firstConnect != null){%>
				
				<% 	if(msg.equals("champVide")){%>
					
					<p class="notValid">${login}  merci de remplir tous les champs</p>
					
				
					<%}%>
					
				<% 	if(msg.equals("notValid")){%>
					
					<p class="notValid">  mot de passe ou user invalide</p>
					
				
				<%}%>
			<%-- 	<% 	if(msg.equals("Valid")){%>					
					<p class="Valid"> ${login} vous etes bien connecté !! </p>
					<% response.sendRedirect("/formationProject/home");%>

				<%}%>
			 --%>
			
			<%}%>						
			</div>
			</form>
			
		</div>	
			
		
			
			
			
			
</body>
</html>