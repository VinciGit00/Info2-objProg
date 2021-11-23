import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Iterazioni_con_frazioni {

	public static void main(String[] args) {
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Creazione delle frazioni*/
		int n= in.readInt("Inserisci il numeratore della frazione: ");
		
		/*Controllo sul denominatore*/
		int d;
		do {
			 d=in.readInt("Inserisci il denominatore della frazione: ");
			 if(d==0)
					out.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(d==0);
		
		Frazione f= new Frazione(n,d);
		
		/*Creo la frazione incremento*/
		Frazione incremento= new Frazione(1); //Frazione che genera un incremento e serve anche per il confronto
		
		/*Confronto con la frazione incremento*/
		if(f.isMaggiore(incremento))
			out.println("La frazione inserita è minore di 1 ");
		else if(f.isMinore(incremento))
			out.println("la frazione inserita è minore di 1 ");
		else if(f.equals(incremento))
			out.println("La frazione inserita è uguale a 1 ");
		
		/*Ciclo iterattivo*/
		Frazione dieci= new Frazione(10);
		
		while(f.isMinore(dieci))
		{
			f=f.piu(incremento);
			out.println("La frazione vale: "+f);
		}
	}

}