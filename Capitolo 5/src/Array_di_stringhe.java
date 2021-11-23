import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Array_di_stringhe {

	public static void main(String[] args) {

		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		String s= "3.5-7-2-5";
		
		String [] array_di_stringhe=s.split("-");
		Double [] valori= new Double[array_di_stringhe.length];
		
		for(int i=0; i<array_di_stringhe.length; i++)
		{
			valori[i]= Double.parseDouble(array_di_stringhe[i]);
		}
		
		Double somma=(double) 0;
		for(int i=0; i<array_di_stringhe.length; i++)
		{
			out.println("Valore numero "+i+": "+valori[i]);
			somma+=valori[i];
		}
		
		out.println("La somma vale: "+somma);
		
		
	}

}
