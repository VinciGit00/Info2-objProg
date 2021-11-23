import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Array_di_oggetti {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Array di frazioni*/
		Frazione [] f= {new Frazione(1,2), new Frazione (5,6), new Frazione (7,6)};// f è un riferimento ad un oggetto che contiene i riferimenti agli oggetti frazioni
	
		/*Metodo alternativo:*/
		Frazione [] f1= new Frazione [5];
		
		f1[0]= new Frazione(5,6);
		f1[1]= new Frazione(5,6);
		f1[2]= new Frazione(5,6);
		f1[3]= new Frazione(5,6);
		f1[4]= new Frazione(5,6);
		//f1[5]= new Frazione(5,6); a differenza degli altri IDE darebbe errore perchè non esiste
		
		/*Altro metodo alternativo:*/
		Frazione [] f2= new Frazione [5];

		for(int i=0; i<f2.length; i++)
		{
			int n=in.readInt();
			int d= in.readInt();
			
			f2[i]= new Frazione(n,d);
		}

	}

}
