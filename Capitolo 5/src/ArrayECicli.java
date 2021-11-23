import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ArrayECicli {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int [] array= new int[10];
		
		for(int i=0; i<array.length; i++) //Il metodo length non richiede l'uso delle parentesi
		{
			array[i]= in.readInt("Inserisci un numero nell'array in posizione: "+i);
		}
		
		for(int j=0; j<array.length; j++)
		{
			out.print(array[j]);
		}
	}

}
