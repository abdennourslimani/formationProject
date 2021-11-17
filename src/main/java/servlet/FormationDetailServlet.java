
  package servlet;
  
  
  
  import java.io.IOException; 
  import java.util.List;
  

  import jakarta.servlet.ServletException; 
  import jakarta.servlet.annotation.WebServlet; 
  import jakarta.servlet.http.HttpServlet; 
  import jakarta.servlet.http.HttpServletRequest;
  import  jakarta.servlet.http.HttpServletResponse; 
  import jakarta.servlet.http.HttpSession;
  import model.Formation;
  
  @WebServlet (urlPatterns= {"/formation-details"} )
  
  
  public class FormationDetailServlet extends HttpServlet{
  
  
  @Override protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{ 
  
  
  
    String UID = req.getParameter("id");
  
  
  
  
  HttpSession session = req.getSession(); // recupére objet qui a UID :
  
  List<Formation> formationList = (List<Formation>) session.getAttribute("formationSession");
  
  Formation formationDetail =null;
  
  for (int i = 0; i < formationList.size(); i++) {
	  
	  if(formationList.get(i).getUID().equals(UID) ) {
  
	  	formationDetail = formationList.get(i);
	  	break; 
  		}
  }
  
  
  
  
	
	  if(formationDetail==null) {
	  
	  res.sendRedirect(this.getServletContext().getContextPath() + "/");
	  
	  return ; }
	 
  
  req.setAttribute("titre", formationDetail.getTitle());
  req.setAttribute("programme", formationDetail.getProgramme());
  req.setAttribute("nbEleve", formationDetail.getNbEleves());
  


  
  // forward à la vue objet en question .
  
  req.getServletContext().getRequestDispatcher("/WEB-INF/formationDetail.jsp").forward(req,res);
  
  }
  
  
  }
 