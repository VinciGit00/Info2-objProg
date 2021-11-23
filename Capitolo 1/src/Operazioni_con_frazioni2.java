import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Operazioni_con_frazioni2 {

	public static void main(String[] args) {
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Creazione della frazione*/
		int n= in.readInt("Inserisci il numeratore della frazione: ");
		int d;
		/*Controllo sul denominatore*/
		do {
			d=in.readInt("Inserisci il denominatore ella frazione: ");
			if(d==0)
				out.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(d==0);
		
		Frazione f= new Frazione(n,d);
		
		/*Funzione per ottenere il numeratore*/
		int VNumeratore=f.getNumeratore();
		
		/*Funzione per ottenere il denominatore*/
		int VDenominatore= f.getDenominatore();
		
		Frazione fConfronto= new Frazione(1);
		
		if(f.isMaggiore(fConfronto)) //Il confronto deve essere con un'altra frazione
			out.println("La frazione inserita è maggiore di 1");
		else if(f.isMinore(fConfronto))
			out.print("La frazione inserita è minore di 1");
		else if(f.equals(fConfronto))
			out.println("La frazione inserita equivale a  1");
	
		Frazione due= new Frazione(2);
		Frazione f_prova= new Frazione(n,d); //Bisogna mettere necessariamente dentro gli argomenti
		
		/*Moltiplicazione per 2*/
		 f_prova=f.per(due); //Dentro deve essere moltiplicata per una frazione e non per una variabile
		
		/*Divisione per 2*/
		f_prova=f.diviso(due);
		
		/*Addizione con il 2*/
		f_prova=f.piu(due);
		
		/*Sottrazione col il 2*/
		f_prova=f.meno(due);

	}

}
