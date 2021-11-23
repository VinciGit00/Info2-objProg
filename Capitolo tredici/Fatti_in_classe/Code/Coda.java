package Code;

import javax.management.RuntimeErrorException;

//Struttura dati dinamica FIFO
/*Soluzione ricorsiva*/
public class Coda<E> {

	private class Nodo { //Utilizzo il nodo come struttura dinamica
		E dato;
		Nodo prossimo;
	}
	
	Nodo primo; //LA CLASSE POSSIEDE DUE NODI!!
	Nodo ultimo;
	
	/*Inserimento in coda*/
	public Coda() { //N.B: IL COSTRUTTORE VA LASCIATO VUOTO
		primo=ultimo=null;
	}
	
	void aggiungi(E a) {
		
		Nodo temp=new Nodo();
		temp.dato=a; //Inserisco il dato nel nuovo nodo
		
		/*Accodiamo il nuovo elemento*/
		if(ultimo!=null)
			ultimo.prossimo=temp; //Percorre la lista fino a raggiungere l'ultimo nodo
		else //Quando la coda è vuota
			primo=temp;
		
		/*Aggiorniamo come ultimo*/
		ultimo=temp;
	}
	
	E preleva() {
		E temp= primo.dato;
		
		if(primo.prossimo==null)
			ultimo=null;
		//Se coda è vuota lancia eccezzione
		if(primo==null)
			throw new RuntimeException();
		//Se la coda possiede solo un elemento

		primo=primo.prossimo;
		
		return temp;
	}
	
	@Override
	public String toString() {
		
		String s="";
		for(Nodo i=primo; i!=null; i=i.prossimo)
			s+=i.dato+" ";
		return s;
	}
		
	public static void main(String[] args) { //Unica classe
		
		Coda<String> CodaStringhe= new Coda<String>();
		
		CodaStringhe.aggiungi("ooooo");
		CodaStringhe.aggiungi("aaaaa");		
		CodaStringhe.aggiungi("bbbb");
		
		System.out.println(CodaStringhe.toString());

		System.out.println(CodaStringhe.preleva()); //Stampa l'elemento che preleva
		System.out.println(CodaStringhe);
		System.out.println(CodaStringhe.preleva()); //Stampa l'elemento che preleva
		System.out.println(CodaStringhe);
		System.out.println(CodaStringhe.preleva()); //Stampa l'elemento che preleva
		System.out.println(CodaStringhe);
		System.out.println(CodaStringhe.preleva()); //Lancia un'eccezione perchè non si può prelevare da una coda vuota
	}
	
}
