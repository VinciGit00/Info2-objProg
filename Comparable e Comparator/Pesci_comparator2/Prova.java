
public class Prova {

	public static void main(String[] args) {
		Vaschetta vas= new Vaschetta("Acquario");
		vas.add(new Pescetto("Mastro geppetto"));
		vas.add(new Pescetto("Vinciking01"));
		vas.add(new Pescetto("Anselmo D'Aosta"));
		
		System.out.println("Lista non ordinata: ");
		vas.stampa();
		vas.ordina();
		System.out.println("Lista ordinata: ");
		vas.stampa();
	}	

}
