package Fiorista;

public class Main {

	public static void main(String[] args) {

		Fiori f= new Fiori("luppolo", 1, 30.50);
		System.out.println("Pianta: ");
		System.out.println("Prima della modifica:");
		System.out.println(f);
		f.aggiungiFiore(3);
		System.out.println("Dopo la modifica:");
		System.out.println(f);
		
		System.out.println("Cliente: ");
		Clienti c= new Clienti("Gargantino", "Pino", 35);
		System.out.println(c);
		
		System.out.println("Fiorista: ");
		Fiorista fio= new Fiorista("Fiorista del cimitero");
		fio.aggClienti(c);
		fio.aggClienti(c);
		fio.aggiungipianta(f);
		fio.rimuovipianta(f);
		fio.stampatutto();
	}

}
