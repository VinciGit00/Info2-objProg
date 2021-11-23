package Es4;
public class DipendenteMain {

	public static void main(String[] args) {
		Azienda az= new Azienda("Tesla");
		az.aggiungidipendente(new Dipendente("Pino","Gargantino", 50.0));
		az.aggiungidipendente(new Dipendente("Salvo","Gentile", 500.0));
		az.aggiungidipendente(new Dipendente("Geppetto","Mastro", 1000.0));

		System.out.println("Ditta prima dell'ordinamento:");
		az.stampaDitta();
		System.out.println("-------------------------------------------------");
		System.out.println("Ditta dopo dell'ordinamento:");
		az.stampaDitta();
	}
}
