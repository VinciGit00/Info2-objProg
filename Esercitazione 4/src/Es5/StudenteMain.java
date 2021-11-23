package Es5;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class StudenteMain {
	
	public static void main(String[] args) {
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		String nome= in.readLine("Inserisci il nome: ");
		String cognome= in.readLine("Inserisci il cognome: ");
		String residenza= in.readLine("Inserisci la residenza: ");
		
		Vector<Double> voti= new Vector<>();
		
		while(true) {
			double temp= in.readDouble("Inserisci un numero compreso tra 0 e 30 e -1 per uscire: ");
			if(temp<30 && temp>0)
				voti.add(temp);
			else if(temp==-1)
				break;
			else if(temp<1)
				out.println("Numero non valido ");
		}
		
		Studente stud= new Studente(nome, cognome, voti, residenza);
		Double voto= in.readDouble("Inserisci un voto da aggiungere: ");
		stud.aggiungiVoto(voto);
		Double b=stud.calcolaMedia();
		out.println(stud.toString());//Stampa tutto
	}

}
