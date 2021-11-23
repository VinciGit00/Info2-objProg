import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es9Rifatto_IMPORTANTE {

	public static void testpalindroma(String s) //N.B: la p di public deve essere minuscola
	{
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		s=in.readLine("Inserisci una stringa da analizzare: ");
		
		/*Chiamo il metodo che analizza la stringa*/
		boolean SiNo= ispalindroma(s);
		if(SiNo==true)
			out.println("La stringa è palindroma ");
		else 
			out.println("La stringa non è palindroma ");
		
	}
	
	public static boolean ispalindroma(String s) //Importante per capire come funzionano i boolean
	{//Boolean restituiscono solo o true o false
		
		char inizio;
		char fine;
		
		/*Metto tutto minuscolo per sicurezzza in modo che non ci siano errori*/
		s=s.toLowerCase();
		
		/*Tolgo gli spazi in modo che non ci siano errori*/
		s=s.trim();
		
		/*Trovo la lunghezza media che serve per analizzare la stringa*/
		int l=s.length();
		int mid= l/2;
		
		for(int i=0; i<mid; i++)
		{
			inizio= s.charAt(i); //charAt prende le singole lettere di indice i
			fine= s.charAt(l-i); //charAt prende il singolo carattere di indice i
		
			if(inizio!=fine) //Confronto diretto tra le singole lettere
				return false;
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String stringa= new String();
		testpalindroma(stringa);
	}
	
	
}
