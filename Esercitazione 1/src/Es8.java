import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es8 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int n=in.readInt("Inserisci un valore n: ");
		
		
		for(int i=1; i<=n; i++)//Tengo fissa la riga e scorro tutte le colonne
		{
			
			for(int j=1; j<=n; j++) /*Moltiplicazione dipende dal valore della riga per il valore della colonna*/
			{
				int p=i*j; //i e j non si possono modificare dentro i cicli for ma si possono usare per fare operazioni
				out.print(p+" ");
			}
			
			out.println();
		}
	}

}
