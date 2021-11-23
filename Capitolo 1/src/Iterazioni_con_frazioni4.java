import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Iterazioni_con_frazioni4 {

	public static void main(String[] args) {
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new  ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Inizializzazione della frazione somma uguale a 0 e del boolean*/
		Frazione somma= new Frazione(0); //Inizializzo a 0 la frazione somma		
		boolean continua;
		
		/*Inserimento dei dati*/
		do{
			int num=in.readInt("Numeratore? ");
			
			/*Controllo del denominatore*/
			int den;
			do {
				den=in.readInt("Denominatore? ");
				if(den==0)
					out.println("0 è un numero non valido");
			}while(den==0);
			
			somma=somma.piu(new Frazione(num, den));
			continua=in.readSiNo("Scrivi s per inserire un'altra frazione e n per finire il programma");
		}while(continua);
		
		out.println("La somma è: "+somma.toString());
	}

}
