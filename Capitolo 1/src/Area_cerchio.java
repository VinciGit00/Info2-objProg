import java.util.Arrays;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Area_cerchio {

	public static void main(String[] args) {
		/*Generazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Double raggio;
		Double PI=3.14;
		
		do {
			raggio=in.readDouble("Inserisci la lunghezza del raggio del cerchio: ");
		}while(raggio<0);
		
		Double area= raggio*raggio*PI;
		out.println("L'area del cerchio è: "+area);
		
		int [] a= new int [5];
		Arrays.sort(a);
	}

}
