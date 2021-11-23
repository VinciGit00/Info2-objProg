import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es6 {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Vector<String> vec= new Vector();
		
		String stringa="Marco, Pippo, Giuseppe";
		String []stringafinale=CreaStringa(stringa);
	}
	
	/*Presa una stringa ne crea una senza le virgole ma al contrario*/
	public static String[] CreaStringa (String s)
	{
		/*Crea una stringa di solo gli elementi senza la virgola*/
		String array[]= s.split(";");
		
		String[] strfin= new String[array.length];
		
		for(int i=0; i<array.length; i++)
		{
			strfin[i]= array[array.length-i];
		}
		
		return strfin;
	}

}
