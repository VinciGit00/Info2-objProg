import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;

public class Sequenza_prova {
	
	public static void main(String[] args) {
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		/*Le sequenze vanno sempre inizializzati con il null*/
		Sequenza<String> sequenza= new Sequenza<String>();
		
		String s= new String("ciao");
		
		while(true)
		{
			s=in.readLine("Inserisci una stringa: ");
			
			if(s.contentEquals(" "))
				break;
			sequenza.add(s);
		}
		
		/*Fase di lettura mediante un for each*/
		for(String k: sequenza)
			out.println(k);
	}

}
