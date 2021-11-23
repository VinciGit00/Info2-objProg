import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class for_each {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int [] array= new int[10];
		
		for(int i: array) //i scorre tutto il vettore
		{//N.B: mettere i due puntini (:)
			array[i]= in.readInt("Inserisci un numero nell'array in posizione: "+i);
		}
		
		for(int j: array)
		{
			out.print(array[j]);
		}
		
		Frazione [] f= new Frazione[5];
		/*Oppure*/
		Frazione [] f1= {new Frazione (5,3), new Frazione(1,2), new Frazione(3,4), new Frazione (4,3)};
		
		for(Frazione a: f) //il cursore deve essere dello stesso tipo del secondo argomento
		{
			out.print(f); //scrive la variabile su cui a sta slittando
		}
	}

}
