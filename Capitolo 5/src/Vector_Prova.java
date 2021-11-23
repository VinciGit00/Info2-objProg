import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

//Fare
public class Vector_Prova {

	public static void main(String[] args) {//Nei vector non è necessario specificare la dimensione del contenitore
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		/*I Vector vanno sempre inizializzati con il null*/
		Vector <String> nomi= new Vector();
		
		/*Fase di scrittura*/
		while(true)
		{
			String parola= in.readLine();//Continua finchè non inserisci lo spazio vuoto
			
			if(parola.equals(" "))
				break;
			
			nomi.add(parola); //Aggiunge al vector la stringa
		}
		
		/*Lettura dal primo all'ultiimo elemento mediante un for each*/
		for(String s: nomi)
		{
			out.println(s);
		}
		
		/*Stesso metodo ma con il for normale*/
		for(int i=0; i< nomi.size(); i++)
		{
			out.println(nomi.get(i)); //Il get serve per acquisire il valore i-esimo
		}
		
		/*Ciclo di scrittura ma al contrario tramite un ciclo for*/
		for(int j=nomi.size()-1; j>=0; j--) //Si usa size e non lenght con i vector e arrraylist
		{
			out.println(nomi.get(j));
		}
	}

}
