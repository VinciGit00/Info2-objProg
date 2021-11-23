/*3 Metodi per risolverlo*/

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_bRifatto_IMPORTANTE{

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager(); 
		
		/*Creazione della stringa da anlizzare*/
		String stringa= in.readLine("Inserisci una stringa da analizzare: ");
		
		char lettera;
		
		/*Chiamata del metodo 1*/
		int l= stringa.length();
		
		for(int i=0; i<l; i++)
		{
			lettera= stringa.charAt(i);
			isVocale1(lettera);
		}
		
		/*Chiamata del metodo 2*/
		isVocale2(stringa);
		
		/*Chiamata del metodo 3*/
		String consonanti= new String();
		for(int i=0; i<l; i++)
		{
			lettera= stringa.charAt(i);
			boolean SiNo=isVocale3(lettera);
			
			if(SiNo==true)
				consonanti=consonanti+lettera;
				
		}
	}
	
	
	/*Lista dei metodi*/
	/*Metodo 1*/
	public static void isVocale1(char c)
	{
		ConsoleOutputManager out= new ConsoleOutputManager(); 
		
		if(c!='a'&& c!='e' && c!='i' && c!='o' && c!='u')
		{
			out.println(c);
			
		}
		
	}
	
	/*Metodo 2*/
	public static void isVocale2(String s)
	{
		ConsoleOutputManager out= new ConsoleOutputManager(); 
		/*Stringa dove vengono memorizzate le singole lettere*/
		String consonanti= new String();
		
		/*Creazione della lettera temporanea*/
		char lettera;
		
		/*Trasformo le lettere in minuscolo per semplificare i passaggi*/
		s=s.toLowerCase();
		s=s.trim();
		
		int l=s.length();
		/*Creazione del ciclo for*/
		for(int i=0; i<l; i++)
		{
			lettera= s.charAt(i);
			if(lettera=='a'||lettera=='e'|| lettera=='i'||lettera=='o'||lettera=='u') //Confronto con le singole lettere va fatto con apici singoli
				continue;
			
			out.print(lettera);
			consonanti=consonanti+lettera;
		}
	}
	
	/*Metodo 3*/
	public static boolean isVocale3(char s)
	{
		if(s!='a' && s!='e' && s!='i' && s!='o' && s!='u')
			return true;
		return false;
	}
}

