

public class Tagung {
	Teilnehmer teilnehmer;
	Workshop workshop;
	Referent referent;
	Rahmenprogramm rahmenprogramm;
	
	
	public static void main(String[] args) {
		Teilnehmer mikeMusterteilnehmer = new Teilnehmer("Mike Musterteilnehmer", "mike@Muster.de", 0);
		// Mike Musterteilnehmer war eigentlich als Student registriert, ihm gefiel es aber so gut, dass er Mitglied wurde!
		mikeMusterteilnehmer.setStatus(1);

		

	}

}
