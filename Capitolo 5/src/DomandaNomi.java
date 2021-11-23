import prog.io.ConsoleInputManager;
import prog.utili.Frazione;
import prog.utili.Sequenza;

public class DomandaNomi {

	public static void main(String[] args) {
		
		//Domanda nomi fino a quando l'utente inserisce ""
		ConsoleInputManager in= new ConsoleInputManager();
		
		String [] nomi = new String[10]; //Va specificato sempre il valore di elementi
		
		Sequenza<String> nomi1= new Sequenza<String> (); //Va specificato sempre il parametro
		Sequenza<Frazione> fraz = new Sequenza<Frazione>();
		
		while(true)
		{
			String s= in.readLine("Inserisci parola"); 
			
			if(s.contentEquals(" "))//Per le stringhe uso equals e non ==!!!
				break; //Esce dal ciclo
			nomi1.add(s);
		}
		
		for(String n: nomi)
		{
			System.out.println(n+" ");
		}
	}

}
