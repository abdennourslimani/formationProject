package model;

public class Eleve {
	private String UID ; 
	private String name ; 
	private String surname; 
	private int age ; 
	private double note ;
	private Formation formation ; 
	
	
	public String getUID() {
		return UID;
	}



	public void setUID(String uID) {
		UID = uID;
	}

	
	
	
	public Eleve() {
		super();
	}
	
	
	
	
	
	
	public Formation getFormation() {
		return formation;
	}



	public void setFormation(Formation formation) {
		this.formation = formation;
	}


	
	

	public Eleve(String uID, String name, String surname) {
		super();
		this.setUID(uID);
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setNote(note);
		this.setFormation(formation);
	}



	public Eleve(String uID, String name, String surname, int age, double note, Formation formation) {
		super();
		this.setUID(uID);
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setNote(note);
		this.setFormation(formation);
	}



	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	} 
	
	
	
	
	
	
	
}
