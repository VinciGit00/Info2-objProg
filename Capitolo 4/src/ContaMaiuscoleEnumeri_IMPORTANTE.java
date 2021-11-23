import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ContaMaiuscoleEnumeri_IMPORTANTE {

	/*Domanda una frase e conta maiuscole e numeri */
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String frase= in.readLine("Inserisci una frase: ");
		int nM=0,nN=0;
		
		
		for(int i=0; i<frase.length(); i++)
		{
				char c= frase.charAt(i); //Si pu� mettere anche un int perch� viene convertito automaticamente
				
				/*Utilizzo il ternario*/
				nM+=Character.isUpperCase(c)?1:0; //.isUpperCase serve per vedere se un carattere � maiuscolo
				
				nN+=Character.isDigit(c)? 1:0; //.isDigit serve per vedere se un carattere � un numero
					
				/*E' uguale a:*/
				
				if(Character.isUpperCase(c))//Guarda se il carattere � maiuscolo
					nM++;
				
				if(Character.isLowerCase(c)) //Guarda se il carattere � un numero
					nN++;
		}
		
	}

}
