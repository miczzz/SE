// Beispielsweise, da es bei den anderen ja doch sehr ähnlich ist

public class Teilnehmer {
	//Instanvariable (Standard auf 0)
	private String name;
	private String email;
	private int status; // 0= Student 1= Mitglied 2= Nicht-Mitglied

	//Konstruktor
	public Rennwagen(String name, String status){
		this.typ = typ;
		this.farbe = farbe;
				
	}
	
	public String getName(){
		return name;
		
	}
	
	public String getEmail(){
		return email;
		
	}

	public int getStatus() {
		return status;
	}

	
	//set 
	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
