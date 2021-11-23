import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class PappagalloInstancabile {

	public static void main(String[] args) {
		
		/*Predisposizione dei canali di comunicazione*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();

		/*Creazione degli oggetti*/
		String messaggio= new String();
		String risposta= new String();
		
		/*Ciclo infinito*/
		while(true)
		{
			messaggio=in.readLine("Parla ");
			risposta= messaggio.toUpperCase();
			out.println(risposta);
		}
	}

}
