package Es5;

public class Main {

	public static void main(String[] args) {
		Prodotto prod1= new Prodotto(10, 10.0);
		Prodotto prod2= new Prodotto(11, 1010);
		
		
		Negozio n1= new Negozio("Foot Locker");
		Negozio n2= new Negozio();
		
		Cliente cl1= new Cliente("Marco", "Vinciguerra");
		Cliente cl2= new Cliente("Marco,Vinciguerra");
		//System.out.println(cl2.toString());
		
		n1.aggiungiProdotto(prod1);
		
		cl1.aggiungialCarrello(n1, 5, 100, 1561);
		//cl1.aggiungialCarrello(n1, 1, 1010101, 150);
		
	}

}
