import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2_b {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= in.readLine("Inserisci una stringa e ne conto le vocali motherfucker: ");
		
		/*Chiamata del metodo*/
		int nVocali=nvocali (s);
		
		out.println("Hai inserito "+nVocali+" vocali");

	}
	
	public static int nvocali(String stringa)
	{
		ConsoleOutputManager out= new ConsoleOutputManager();
		char lettera;
		
		/*Conta il numero di vocali*/
		int n=0;
		
		
		for(int i=0; i<stringa.length(); i++)
		{
			lettera=stringa.charAt(i);
			if(lettera!='a'||lettera!='e'||lettera!='i'||lettera!='o'||lettera!='u')
				continue;
			out.println(lettera+" è una vocale");
			n++;
		}
		
		/*Ritorna il numero di vocali*/
		return n;
	}

}
