import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Iterazioni_con_frazioni3 {

	public static void main(String[] args) {
		/*Creazione degli oggetti di input/output*/
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Creazione di un oggetto di classe frazione*/
		int n=in.readInt("Inserisci il valore del numeratore della frazione: ");
		
		/*Controllo sul denominatore*/
		int d;
		do{
			d=in.readInt("Inserisci il valore del denominatore della frazione: ");
			if(d==0)
				out.println("0 non va bene come valore ");
		}while(d==0);
		
		Frazione f= new Frazione(n,d);
		
		/*Creazione della frazione di arrivo*/
		out.println("Creazione della frazione di arrivo");
		n=in.readInt("Inserisci il numeratore della frazione di arrivo");
		
		do{
			d=in.readInt("Inserisci il valore del denominatore della frazione: ");
			if(d==0)
				out.println("0 non va bene come valore ");
		}while(d!=0);
		
		Frazione arrivo= new Frazione(n,d);
		
		/*Inzializzazione del ciclo*/
		while(f.isMinore(arrivo))
		{
			n=in.readInt("Inserisci il valore del numeratore della frazione da aggiungere: ");
			do{
				d=in.readInt("Inserisci il valore del denominatore della frazione da aggiungere: ");
				if(d==0)
					out.println("0 non va bene come valore ");
			}while(d!=0);
			
			Frazione temp= new Frazione(n,d);
			
			f=f.piu(temp);
		}
	}

}
