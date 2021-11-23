import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2 {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= in.readLine("Inserisci una stringa e ne conto le vocali motherfucker: ");
		char lettera;
		int k=0;
		
		for(int i=0; i<s.length(); i++)
		{
			lettera=s.charAt(i);
			if(lettera!='a'||lettera!='e'||lettera!='i'||lettera!='o'||lettera!='u')
				continue;
			out.println(lettera+" è una vocale");
			/*Conta il numero di vocali*/
			k++;
		}
		
		out.println("Hai inserito "+k+" vocali");
	}

}
