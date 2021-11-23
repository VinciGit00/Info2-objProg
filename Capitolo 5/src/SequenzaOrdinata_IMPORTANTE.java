import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.SequenzaOrdinata;

public class SequenzaOrdinata_IMPORTANTE {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Non va specificata la dimensione*/
		/*SequenzaOrdinata mette in ordine alfabetico la lista se è uno string*/
		/*SequenzaOrdinata mette in ordine numerico la lista se è un int*/
		SequenzaOrdinata<String> n= new SequenzaOrdinata<String>();
		
		String s= new String();
		
		while(true)
		{
			s= in.readLine();
			if(s.contentEquals(" "))
				break; //Esce dal ciclo
			n.add(s);
		}
		
		/*Uso il for each per la chiamata con le sequenze e le sequenze ordinate*/
		for(String k: n)
		{
			out.println(k);
		}
	}

}
