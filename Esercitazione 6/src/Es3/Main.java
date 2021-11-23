package Es3;

public class Main {

	public static void main(String[] args) throws Exception {

		Ristorante r= new Ristorante("Pizzeria");
		
		Tavolo tav= new Tavolo("sala 1",5);
		tav.aggiungiPersona(new Persona("Beppe", "Sala"));
		tav.aggiungiPersona(new Persona("Marco", "Vinciguerra"));
		//tav.aggiungiPersona(new Persona("Marco", "Vinciguerra"));
		tav.aggiungiPersona(new Persona("Andrea", "Sal"));
		tav.aggiungiPiatto(new Piatto("Pasta con tonno",1,11.5));
		tav.aggiungiPiatto(new Piatto("Pasta con cipolle",2,13.5));
		tav.aggiungiPiatto(new Piatto("Pasta e fagioli",3,13.5));
		tav.aggiungiPiatto(new Piatto("Pasta e fagioli",4,13.5));
		tav.rimuoviPersona("Beppe", "Sala");
		tav.rimuoviPiatto(new Piatto("Pasta e fagioli",1,13.5));
		
		tav.stampaTutto();
		System.out.println("---------------------------------------------------");
		System.out.println("Conto totale: "+tav.calcolatotale());
		System.out.println("Conto medio: "+tav.contomedio());
		
		System.out.println("---------------------------------------------------");
		System.out.println("Lista ordinata per ordinata in ordine alfabetico: ");
		tav.ordinaTavoli();
		tav.stampaTutto();
		
		
	}

}
