import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		double a,b;
		a=in.readDouble("Inserisci valore a: ");
		b=in.readDouble("Inserisci valore b: ");
		
		double c=a+b;
		out.println("La somma vale: "+b);
	}

}
