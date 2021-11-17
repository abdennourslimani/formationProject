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

@WebServlet (urlPatterns= "/formation-list" )


public class  FormationListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException ,IOException{
			//1) ServletOutputStream out = response.getOutputStream() ; 
		
	request.getServletContext().getRequestDispatcher("/WEB-INF/formations.jsp").forward(request,response);		
		
	}
}	
