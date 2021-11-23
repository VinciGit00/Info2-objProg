package Fatti_in_classe;
//nome, cognome, luogo vanno tutti usati in final
class Finestra {
	
	static final int NUMERO_LATI=12; //Lo uso per le variabili
	static final int NUMERO_LATI1;
	
	static { //Altro modo per definire le classi statiche
		int h=90;
		NUMERO_LATI1=5;
		
	}
	
	final int numerodiVetri;
	Finestra(int nv) {
		numerodiVetri= nv; //Ad esempio per nomi e cognomi, serve per non farlo cambiare
	}
	
}

final class FinestraVetri extends Finestra {

	FinestraVetri(int nv) {
		super(nv);
	}
	
}

public class UsoFinal {

	public static void main(String[] args) {
		
		Finestra f1= new Finestra(2);
		Finestra f2= new Finestra(3);
		/*final int x=0;
		x=90;*/ //Non si può fare
		
		final int x;
		x=2;
		
		System.out.println(f1.numerodiVetri+" "+ f2.numerodiVetri);
		System.out.println(f1.NUMERO_LATI+" "+ f2.NUMERO_LATI);
	}

}
