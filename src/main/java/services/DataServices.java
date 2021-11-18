package services;

import java.util.ArrayList;
import java.util.List;

import model.Eleve;
import model.Formation;


/**
 * 
 * @author Abdennour SLIMANI
 * création du singleton pour pouvoir récupérer les données necessaires partout dans l'application
 * sans avoir besoin à les envoyer en req ou en session par exemple 
 *
 */
public class DataServices {
	
	private static DataServices instances = null;  					// objet initialisé
	private List<Formation> formations = new ArrayList<Formation>(); // formation list
	private List<Eleve> eleves = new ArrayList<Eleve>();				// eleve liste initialisé
	
	private DataServices() {
		
		// Je crée une liste d'utilisateurs factice 
		// et je les injecte dans mon tableau d'utilisateurs
		for (int i = 1; i <= 10; i++) {

    formations.add(new Formation("AZE"+i+3+"A" ,"je suis le tittre"+ i +" de la formation", "programe c'est le meme", i+18));
    
    	}
    	
	
	
	// je crée une liste des Eleves : 
 	for (Formation formation : formations) {
		for (int i = 0; i < 2; i++) {
			eleves.add(new Eleve("AZER"+i+1+"B", "name"+i+"-" ,"surname"+i,i+10,i+13,formation));
		
			}	

 	}
}
	
	
	
	
	
	
	// Je crée un méthode static qui va me permettre de récupèrer l'instance de ma classe 
	public static DataServices getInstance() {
		if (DataServices.instances == null) {
			DataServices.instances = new DataServices();
		}
		return instances;
	}
	
	
	public List<Formation> getFormations() {
		return this.formations; 
	}
	
	
	public List<Eleve> getEleves() {
		return this.eleves; 
	}
	
	
	
	
	// Méthode qui permet de récupèrer une formation selon with name 
	public Formation getFormationByName(String title) {
		Formation response = null;
		for (Formation formation : formations) {
			if (formation.getTitle().equals(title)) {
				response = formation;
				break;
			}
		}
		return response;
	}

	
	// Méthode qui permet de récupèrer une formation selon with name 
		public Eleve getEleveByUID(String UID) {
			Eleve response = null;
			for (Eleve eleve : eleves) {
				if (eleve.getUID().equals(UID)) {
					response = eleve;
					break;
				}
			}
			return response;
		}
	
	
	
	
	
	
	
}
