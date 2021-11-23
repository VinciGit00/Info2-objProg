import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es3 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s=in.readLine("Inserisci una stringa da analizzare: ");
		
		conta(s);
	}
	
	/*Utilizzo dei metodi*/
	public static void conta(String s)
	{
		/*Creo una stringa alfabeto*/
		String alfabeto="abcdefgilmonpqrtstuvxyz";

		/*Metto tutto in lettere minuscole*/
		s=s.toLowerCase();
		
		/*Creo due variabili temporanee*/
		char lParola;
		char lAlfabeto;
		
		for(int i=0; i<s.length(); i++)
		{
			int cont=0;
			for(int k=0; k<23;k++)
			{//Procedimento più comodo con un vettore 
				lParola=s.charAt(i);
				lAlfabeto=alfabeto.charAt(k);						
				
				if(lParola==lAlfabeto)
					cont++;
			}
		}
	}

}
