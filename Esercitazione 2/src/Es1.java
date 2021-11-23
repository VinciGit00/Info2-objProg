import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1 {

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
			
			if(lettera==('a')||lettera==('e')||lettera==('i')||lettera==('o')||lettera==('u'))
			{
				continue; //Se la soluzione è vera va al prossimo passo del for senza stampare
			}
			out.println(s);
		}
			
	}
	
	 public static boolean isVocale(String taglia) //Va specificato sempre il public static
	{
		return true;
	}
	
}
