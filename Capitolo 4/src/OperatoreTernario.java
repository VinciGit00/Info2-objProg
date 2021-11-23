import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
/*Operatore ternario condizionale a riga 13*/
public class OperatoreTernario {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();

		int x=in.readInt("Inserisci un numero: ");
		
		/*è un tipo di operatore ternario di tipo condizionale*/
		out.println(x%2==0 ? "Pari": "Dispari");//Condizione? espressione 1: espressione 2
		//Le due espressioni devono essere compatibili
	}

}
