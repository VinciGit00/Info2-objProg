import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es5 {

	public static void main(String[] args) {
		
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Frazione somma= new Frazione(0,1);
		int n,d,i=0;
		
		String s= new String("si");
		
		do{
			n=in.readInt("Inserisci nominatore della prima frazione");
			do {
				d=in.readInt("Inserisci denominatore della prima frazione");
			}while(d==0);
			
			Frazione f= new Frazione(n,d);
			somma=somma.piu(f);
			i++;			
			s=in.readLine("Inserisci s per continuare, n per fermarsi: ");
		}while(s.equals("s")); //è corretto
		
		/*Calcolo della media*/
		Frazione due= new Frazione(i);
		somma=somma.diviso(due); 
	}

}
