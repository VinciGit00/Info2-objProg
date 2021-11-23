import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Figura;
import prog.utili.Rettangolo;

/*Domanda all'utente una serie di figure geoemetriche che memorizza in un vector*/

public class DomandaFiguere {

	public static void main(String[] args) {

		/*Tipo equivale  a classe*/
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Per memorizzare un solo Vector di figure*/
		Vector<Figura> figura= new Vector<>();
		
		for(;;)
		{
			
			char f= in.readChar("Inserisci il nome di una figura");
		}
		
		/*Calcolare il massimo delle figure*/
		
		//System.out.println((Figura) figura.getArea());
		
	}

}
