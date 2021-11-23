import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/*Esercizio rifatto con i vettori*/
public class Es3Alternativo {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s=in.readLine("Inserisci una stringa da analizzare: ");
		int []conta=contalettere(s);
		
		
		
	}

	public static int[] contalettere(String parola)
	{
		int dim=26; //Dimensione dell'alfabeto
		char lettera, lalfabeto;
		int []lettere= new int [dim];
		
		for(int i=0; i<parola.length(); i++)
		{
			lettera=parola.charAt(i);
			for(int j=0; j<dim; j++)
			{
				String alfabeto= "abcdefgilmonpqrstuvxyz";
				lalfabeto=alfabeto.charAt(j);
				if(lettera==lalfabeto)
					lettere[j]++;
			}
		}
		return lettere;
	}
}
