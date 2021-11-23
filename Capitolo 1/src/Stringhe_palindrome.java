import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Stringhe_palindrome {

	public static void main(String[] args) {
		/*Generazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Inserimento della frase*/
		String parola= in.readLine("Inserisci una parola per vedere se è palindroma: ");
		
		int lunghezza= parola.length();
		
		/*Distionzione dei casi in base al resto*/
		if((lunghezza%2)!=0)
			out.println("Parola non palindroma ");
		else
		{
			int bandiera=0; //Flag utile per il controllo
			
			for(int i=0; i<lunghezza; i++ )
			{
				char inizio=parola.charAt(i); //parola.charAt() serve per prendere la singola lettera
				char fine=parola.charAt(lunghezza-1); //parola.charAt() serve per prendere la singola lettera
				
				if(inizio!=fine)
				{
					bandiera=1;
					break; //In questo modo esce dal ciclo tramite un'interruzione
				}
			}
						
			if(bandiera==0)
				out.println("La parola inserita è palindroma");
			else
				out.println("La parola inserita non è palindroma");
		}
	}

}
