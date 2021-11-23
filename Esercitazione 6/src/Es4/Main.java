package Es4;

public class Main {
	
	public static void main(String[] args) {
		Volo v= new Volo(1, "Bergamo", "Milano", 0, 0);
		Passeggero p= new Passeggero("Marco", "Vinciguerra", 150.0, "F");
		Passeggero p1= new Passeggero("Marc", "Vinciguerra", 150.0, "F");
		v.aggiungiPasseggero(p); //FUNZIONA!!!
		v.rimuoviPersone(p1); //FUNZIONA!!!
		
	}
}
