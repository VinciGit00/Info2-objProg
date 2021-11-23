import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Iterazioni_con_frazioni2 {

	public static void main(String[] args) {
		/*Creazione degli oggetti di input/output*/
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Creazione di un oggetto di classe frazione*/
		int n=in.readInt("Inserisci il valore del numeratore della frazione: ");
		/*Controllo sul denominatore*/
		int d;
		do
		{
			d=in.readInt("Inserisci il valore del denominatore della frazione: ");
			if(d==0)
				out.println("0 non va bene come valore ");
		}while(d!=0);
		
		Frazione f= new Frazione(n,d);
		
		/*Creazione della frazione di confronto*/
		Frazione confronto= new Frazione (1);
		
		/*Confronto per vedere se la frazione inserita è maggiore di 1*/
		if(f.isMaggiore(confronto)) //dento bisogna mettere  necessariamente un oggetto di classe frazione
			out.println("La frazione inserita è maggiore di 1");
		else if(f.isMinore(confronto)) //dento bisogna mettere  necessariamente un oggetto di classe frazione
			out.println("La frazione inserita è minore di 1");
		else if(f.equals(confronto))
			out.println("La frazione inserita equivale a 1");
		
		/*Creazione di una funzione per l'incremento*/
		Frazione incremento= new Frazione(1); //Incremento di 1
		Frazione arrivo= new Frazione(10); //Arriva fino al valore 10
		
		/*Inizializzazione del ciclo*/
		while(f.isMinore(arrivo))//Incrementa fino ad arrivare a 10
		{
			out.println("Il valore della frazione è: "+f.toString());
			f=f.piu(incremento); //Qui incrementa ogni volta che entra nel ciclo
		}
		/*Con il ciclo for non ha molto senso*/
	}

}
