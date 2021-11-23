import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_b {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager(); 
		
		String s= in.readLine("Inserisci una frase: ");
		
		/*Metto tutto in minuscolo*/
		s=s.toLowerCase();
		int l= s.length();
		
		for(int i=0; i<l; i++)
		{
			char lettera;
			lettera=s.charAt(i);
			
			isVocale(lettera);
		}
	}
	
	 public static void isVocale(char lettera) //public si può omettere
	{
		 ConsoleOutputManager out= new ConsoleOutputManager(); 
		if(lettera==('a')||lettera==('e')||lettera==('i')||lettera==('o')||lettera==('u'))
		{
			//continue; non può essere usato al di fuori di un loop
		}
		out.println(lettera);
	}
}
