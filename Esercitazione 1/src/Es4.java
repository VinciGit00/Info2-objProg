import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es4 {

	public static void main(String[] args) {
		
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Acquisizione prima frazione*/
		int n=in.readInt("Inserisci nominatore della prima frazione");
		int d;
		do {
			d=in.readInt("Inserisci denominatore della prima frazione");
		}while(d==0);
		
		Frazione f1= new Frazione(n,d);
		
		/*Acquisizione seconda frazione*/
		n=in.readInt("Inserisci nominatore della seconda frazione");
		do {
			d=in.readInt("Inserisci denominatore della prima frazione");
		}while(d==0);
		
		Frazione f2= new Frazione(n,d);
		
		/*Esecuzione delle operazioni*/
		out.println("Somma: "+f1.piu(f2).toString());
		out.println("Differenza: "+f1.meno(f2).toString());
		out.println("Prodotto: "+f1.per(f2).toString());
		out.println("Quoziente: "+f1.diviso(f2).toString()); //Nb: non si può fare la somma come con gli interi
		
		
	}

}
