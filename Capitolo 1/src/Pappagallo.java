import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Pappagallo {

	public static void main(String[] args) {
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Input*/
		String s= in.readLine("Inserisci una frase: ");
		
		/*Output*/
		out.println(s);
	}

}
