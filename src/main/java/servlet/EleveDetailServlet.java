
  package servlet;
  
  
  
  import java.io.IOException; 
  import java.util.List;
  

  import jakarta.servlet.ServletException; 
  import jakarta.servlet.annotation.WebServlet; 
  import jakarta.servlet.http.HttpServlet; 
  import jakarta.servlet.http.HttpServletRequest;
  import  jakarta.servlet.http.HttpServletResponse; 
  import jakarta.servlet.http.HttpSession;
  import model.Eleve;
  
  @WebServlet (urlPatterns= {"/eleve-details"} )
  
  
  public class EleveDetailServlet extends HttpServlet{
  
  
  @Override protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException ,IOException{ 
  
  
  
    String UID = req.getParameter("id");
  
  
  
  
  HttpSession session = req.getSession(); // recupére objet qui a UID :
  
  List<Eleve> elevesList = (List<Eleve>) session.getAttribute("elevesSession") ;

  
  Eleve eleveDetail =null;
  
  for (int i = 0; i < elevesList.size(); i++) {
	  
	  if(elevesList.get(i).getUID().equals(UID) ) {
  
	  	eleveDetail = elevesList.get(i);
	  	break; 
  		}
  }
  
  
  
  
	
	  if(eleveDetail==null) {
	  
	  res.sendRedirect(this.getServletContext().getContextPath() + "/");
	  
	  return ; }
	 
  
  req.setAttribute("name", eleveDetail.getName());
  req.setAttribute("surname", eleveDetail.getSurname());
  req.setAttribute("age", eleveDetail.getAge());
  req.setAttribute("note", eleveDetail.getNote());
  req.setAttribute("formation", eleveDetail.getFormation().getTitle());
 


  
  // forward à la vue objet en question .
  
  req.getServletContext().getRequestDispatcher("/WEB-INF/eleveDetail.jsp").forward(req,res);
  
  }
  
  
  }
 