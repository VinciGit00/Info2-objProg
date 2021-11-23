import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1Rifatto {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out =new ConsoleOutputManager();
		
		/*Inserimento della stringa*/
		String s= in.readLine("Inserisci una stringa da analizzare: ");
		
		/*Stringa su cui vengono memorizzati i dati*/
		String v= new String(); //N.B: non inizializzare la stringa uguale a null
		
		/*Metto tutto in minuscolo e tolgo gli spazi per semplificare i calcoli*/
		s=s.trim();
		s=s.toLowerCase();
		
		
		/*Lunghezza della stringa*/
		int l= s.length();
		
		/*Lettera temporanea che serve per il confronto*/
		char lettera;
		
		for(int i=0; i<l; i++)
		{
			lettera= s.charAt(i);
			if(lettera=='a'||lettera=='e'|| lettera=='i'|| lettera=='o'|| lettera=='u')
				continue; //Va direttamente alla prossima istruzione del for saltando l'istruzione successiva, altrimenti stampa la singola lettera
			
			v=v+lettera; //Posso scrivere direttamente la stringa o memorizzare la lettera su una stringa v
			out.print(lettera);
		}
		
		out.println(v);
	}

}
