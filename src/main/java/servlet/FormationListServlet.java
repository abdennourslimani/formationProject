package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Eleve;
import model.Formation;
import services.DataServices;

@WebServlet (urlPatterns= "/formation-list" )


public class  FormationListServlet extends HttpServlet{
			
			// je prépare ma loste articles eleves vides pour la remplir aprés l'appel de mon singleton
	
			private List<Formation> formations = new ArrayList<Formation>();
			// Je crée une vraiable qui contiendra plus tard dans mon code un article
			private DataServices formationsServices = DataServices.getInstance();
			
		
		public FormationListServlet() {
	    	this.formations = formationsServices.getFormations();

			
		}
		

		@Override
		protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
				//1) ServletOutputStream out = response.getOutputStream() ; 
					request.setAttribute("formations", formations);

			
		
	request.getServletContext().getRequestDispatcher("/WEB-INF/formations.jsp").forward(request,response);		
		
	}
}	
