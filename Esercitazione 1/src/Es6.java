import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/*Programma senza l'uso di nessun ciclo for*/
public class Es6 {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= new String();
		s=in.readLine("Inserisci una stringa: ");
		
		int l=s.length();
		
		String asterischi= new String("************************************************");
		asterischi=asterischi.substring(0,l);
		
		out.println(asterischi);
		out.println(s);
		out.println(asterischi);

	}

}
