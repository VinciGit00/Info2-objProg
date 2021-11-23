package Es2;

public class Main {

	public static void main(String[] args) {
	
		Cliente Gianni= new Cliente("Gian", "Franco");
		
		Negozio n= new Negozio();
		n.aggiungiProd(new Prodotto(1, 3, 50.0));
		n.aggiungiProd(new Prodotto(2, 2, 500.0));
		
		Gianni.aggiungiAlCarrello(new Prodotto(1, 1, 50.0), n);
		Gianni.aggiungiAlCarrello(new Prodotto(2, 2, 500.0), n);
		Gianni.stampaCarrello();
		
		System.out.println("Totale della spesa cliente: "+Gianni.stampaScontrino());
		System.out.println();
		System.out.println();

		n.stampaRimanenze();
		
	}
}
