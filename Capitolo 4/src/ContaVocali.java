import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ContaVocali {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Input*/
		String frase= in.readLine("Inserisci una frase: ");
		
		/*Inizializzo un contatore*/
		int na=0, ne=0, ni=0, no=0, nu=0;
		
		/*Metto tutto in minuscolo per comodità*/
		frase= frase.toLowerCase();
		
		for(int i=0; i<frase.length(); i++)
		{
				/*Uso dello switch*/
				char c= frase.charAt(i); //Si può mettere anche un int perchè viene convertito automaticamente
				switch(c) {
					case 'a': na++; break;
					case 'e': ne++; break;
					case 'i': ni++; break;
					case 'o': no++; break;
					case 'u': nu++; break;
				}//Se non è in questi casi non succede nulla, non serve mettere il default
		}
		
		out.println("Conteggio vocali");
		out.println("A compare: "+na+" volte");
		out.println("E compare: "+ne+" volte");
		out.println("I compare: "+ni+" volte");
		out.println("O compare: "+no+" volte");
		out.println("U compare: "+nu+" volte");

	}

}
