package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet (urlPatterns= {"/login" }  )

public class  LoginServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
		
		
			/*
			 * // creer un user : HttpSession session = req.getSession(); User user = new
			 * User("ID1234ZE","abdennour",88,1,"user1@test.fr",true) ;
			 * 
			 * // valoriser les champs de la session session.setAttribute("UID",
			 * user.getUID()); session.setAttribute("name", user.getUserName());
			 * session.setAttribute("nbPost", user.getNbPost());
			 * session.setAttribute("email", user.getEmail());
			 * session.setAttribute("isAdmin", user.isAdmin());
			 * 
			 * 
			 * 
			 * res.sendRedirect(req.getContextPath() +"/home");
			 */
		
		req.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req,res);

		
		
	}			
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
		// récupére les données 
		String login = req.getParameter("pseudo");
		String password = req.getParameter("password");
		
		String pseudo = "abdennour" ; 
		String pswd = "GFX123";
		
		// vérifie : 
		
		String msg = "" ; 
		
		if(pseudo.equals(login) && pswd.equals(password)) {
			
			//msg="Valid";  // créer variable pour créer message 
			res.sendRedirect("/formationProject/home");
			return;
		}else {
			
				if(login.equals("") ||password.equals("") ) {
					
					msg="champVide";
					
				}else if (!login.equals(login) || !pswd.equals(password)) {
					
					msg="notValid";
					
				}
			
		}

		
		String fs ="contenu"; 
		
		req.setAttribute("firstConnect", fs);
		req.setAttribute("login" , login);
		req.setAttribute("msg" , msg); 
		req.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(req,res);

		
	}		
	
}