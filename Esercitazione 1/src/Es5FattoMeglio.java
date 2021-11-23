import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es5FattoMeglio {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int n, d, i=0;
		
		Frazione somma= new Frazione(0,1); //La inizializzo a 0
		
		do {
			n=in.readInt("Inserisci il numeratore: ");
			
			do {
				d=in.readInt("Inserisci il numeratore: ");
			}while(d==0);
			
			Frazione f= new Frazione (n,d);
			somma=somma.piu(f);
			i++;
			
		}while(in.readSiNo("Continuare? (S/N)")); //Se legge s continua, se legge n si ferma
		
		/*Calcola la media*/
		Frazione denominatore= new Frazione(i,1);
		Frazione finale= new Frazione(1,1);
		finale=somma.diviso(denominatore);
		
	}

}
