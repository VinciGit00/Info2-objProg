import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= new String();
		s=in.readLine("Inserisci una stringa: ");
		out.println(s);
	}

}
