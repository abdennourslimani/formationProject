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

@WebServlet (urlPatterns= "/eleves-listes" )


public class  ElevesListServlet extends HttpServlet{
	

	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
		
	Formation formation1 = new Formation("56SDSER","titre formation1","prog formation 1",20);
	Formation formation2 = new Formation("6656DER","titre formation2","prog formation 2",32);
	Formation formation3 = new Formation("223ERTT","titre formation3","prog formation 3",15);
	Formation formation4 = new Formation("3457ERT","titre formation4","prog formation 4",20);

	List<Formation> formation = new ArrayList<>(); 

	
	formation.add(formation1);
	formation.add(formation2);
	formation.add(formation3);
	formation.add(formation4);
	formation.add(formation1);


		
		
		
		Eleve eleve1 = new Eleve("12AZER","name1" ,"surname1",20 , 18,formation1);
		Eleve eleve2 = new Eleve("2356DFR","name2" ,"surname2",15 , 16.5,formation2);
		Eleve eleve3 = new Eleve("SDSD44","name3" ,"surname3",18 , 12,formation2);
		Eleve eleve4 = new Eleve("1234DD","name4" ,"surname4",16, 8,formation4);
		Eleve eleve5 = new Eleve("453FRE","name5" ,"surname5",19, 12,formation4);

		List<Eleve> eleves = new ArrayList<>(); 
		
		eleves.add(eleve1);
		eleves.add(eleve2);
		eleves.add(eleve3);
		eleves.add(eleve4);
		eleves.add(eleve5);

		
			request.setAttribute("elevesData", eleves);

			  HttpSession session = request.getSession(); 
			  session.setAttribute("elevesSession",eleves);
			  session.setAttribute("formationSession",formation);
			  
		
			
			request.getServletContext().getRequestDispatcher("/WEB-INF/eleves.jsp").forward(request,response);		
		
	}
	

	
}