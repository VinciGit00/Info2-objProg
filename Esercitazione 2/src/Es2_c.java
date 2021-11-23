import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_c {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		char lettera;
		int k = 0; //Va sempre inizializzata
		
		String s= in.readLine("Inserisci una stringa e ne conto le vocali motherfucker: ");
		
		for(int i=0; i<s.length(); i++)
		{
			lettera=s.charAt(i);
			
			boolean val=iSvocale(lettera);
			if(val==true)
				k++;
		}
		
		out.println("Hai inserito "+k+" vocali");
	}
	
	public static boolean iSvocale(char let)
	{
		if(let=='a'||let=='e'||let=='i'||let=='o'||let=='u')
			return true;
		/*In alternativa*/
		return false;
	}

}
