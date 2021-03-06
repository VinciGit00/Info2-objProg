import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Arraylist {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		ArrayList<String> memo= new ArrayList<String>(); //Non ? necessario mettere il secondo <>
		
		/*Fase di scrittura*/
		while(true)
		{
			String s= in.readLine("Inserisci una parola: ");
			
			if(s.contentEquals(" "))
				break;
			
			memo.add(s); //add. permette di scrivere sul vector
		}
		
		/*Fase di lettura con un ciclo for each*/
		for(String x: memo)
			out.println(x);
		
		/*Fase di lettura con un ciclo for*/

		for(int j=0; j<memo.size(); j++)//Si usa size e non lenght con i vector, arrraylist, sequenze e esequenze ordinates
		{
			out.println(memo.get(j));
		}
			
		/*Fase di lettura al contrario*/
		for(int i=memo.size()-1; i>=0; i-- ) //Si usa size e non lenght con i vector e arrraylist, per i vettori lenght
			out.println(memo.get(i)); //get permette di acquisire un valore di un vector
	}

}
