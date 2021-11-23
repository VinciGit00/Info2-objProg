//Controlla se una stringa è palindroma

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es9 {

	public static void main(String[] args) {
		String s= new String();
		testpalindroma(s);
		
	}
	
	public static void testpalindroma(String palindroma)
	{
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		/*Chiama il metodo che analizza la stringa*/
		palindroma= in.readLine("Inserisci una stringa per vedere se è palindroma");
		
		boolean isPal= isPalindroma(palindroma);
		if(isPal==true)
			out.println(palindroma +"è palindroma");
		else
			out.println(palindroma +"non è palindroma");
	}
	
	//Calcola se la stringa e palindroma
	 public static boolean isPalindroma(String palindroma)
	{
		 /*Converte tutto in maiuscolo o minuscolo*/
		 palindroma=palindroma.toLowerCase();
		 /*Toglie gli spazi*/
		 /*IMPORTANTE	*/
		 palindroma=palindroma.trim(); //trim toglie gli spazi dalla stringa
		 
		 int l=palindroma.length();
		 /*Tolgo la posizione di me*/
		 int mid=l/2;
		 
		 char ini;
		 char fin;
		 
		 for(int i=0; i<mid; i++)
		 {
			 ini=palindroma.charAt(i);
			 fin=palindroma.charAt(l-i);
			 
			 if(ini!=fin)
				 return false;
		 }
		 return true;
	}

}
