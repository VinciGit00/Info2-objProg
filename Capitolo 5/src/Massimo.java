import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Massimo {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
	
	}
	
	/*Cerca il massimo degli int*/
	public int cercaMassimoint( int [] numeri)
	{
		int massimo= numeri[0];
		for(int i=0; i<numeri.length; i++)
		{
			if(massimo>numeri[i])
				massimo=numeri[i];
		}
		
		return massimo;
	}
	
	/*Cerca il massimo delle stringhe*/
	public String cercaMassimoString( String [] Stringhe)
	{
		String LongestString= Stringhe[0];
		for(int i=0; i<Stringhe.length; i++)
		{
			if(Stringhe[i].length()>LongestString.length())
				LongestString=Stringhe[i];
		}
		
		return LongestString;
	}
	

}
