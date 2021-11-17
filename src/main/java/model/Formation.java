package model;

import java.util.List;

public class Formation {
	private String 	UID ;  
	private String title ; 
	private String programme ; 
	private int nbEleves ;
	
	
	
	
	
	
	
	public Formation() {
		super();
	}
	
	

	
	public Formation(String uID, String title, String programme, int eleves) {
		this();
		this.setUID(uID);
		this.setTitle(title);
		this.setProgramme(programme);
		this.setNbEleves(eleves);
	}


	public String getUID() {
		return UID;
	}



	public void setUID(String uID) {
		UID = uID;
	}






	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}



	public int getNbEleves() {
		return nbEleves;
	}



	public void setNbEleves(int nbEleves) {
		this.nbEleves = nbEleves;
	}

	
	
	
	
	
	
	
	
	
}
