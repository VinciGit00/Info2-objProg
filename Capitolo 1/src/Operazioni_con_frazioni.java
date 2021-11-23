
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Operazioni_con_frazioni {
	
	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		out.println("Prima frazione: ");
		int num=in.readInt("Inserisci il numeratore della prima frazione: ");
		
		int den;
		/*Controllo sul denominatore*/
		do {
			 den=in.readInt("Inserisci il denominatore della frazione: ");
			 if(den==0)
				 out.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(den==0);
		
		Frazione f1= new Frazione(num, den);
		
		out.println("Seconda frazione");
		num=in.readInt("Inserisci il numeratore della seconda frazione: ");
		
		/*Controllo sul denominatore*/
		do {
			 den=in.readInt("Inserisci il denominatore della frazione: ");
			 if(den==0)
				 out.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(den==0);
		
		Frazione f2= new Frazione(num, den);
		
		/*Funzione per ottenere il numeratore*/
		int n=f2.getNumeratore(); //Ottengo il numeratore
		
		/*Funzione per ottenere il denominatore*/
		int d= f2.getDenominatore();
		
		if(f1!=f2)
			out.println("Le due frazioni sono diverse");
		else
			out.println("Le due frazioni sono uguali e valgono: "+f2.toString());
		
		/*Somma di due frazioni*/
		Frazione f3= f2.piu(f1);
		
		/*Differenza di due frazioni*/
		f3=f2.meno(f1);
		
		/*Prodotto di due frazioni*/
		f3=f2.per(f1);
		
		/*Quoziente di due frazioni*/
		f3=f2.diviso(f1);
		/*Osservazione importante*/
		f3=f2; //adesso f3 si riferisce allo stesso oggetto di f2
		
		/*Confronto*/
		if(f3.isMaggiore(f2))
			out.println("f3 è maggiore di f2");
		else if(f3.isMinore(f2))
			out.println("f2 è minore di f3");
		else if(f3.equals(f2))
			out.println("Le due frazioni sono uguali");
	}

}
