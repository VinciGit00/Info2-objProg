import java.util.Arrays;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Crivello_di_Eratostene {

	public static void main(String[] args) {
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		/*Creazione dell'array*/
		int n=in.readInt("Inserisci un valore di cui calcolare i numeri primi: ");
		Boolean[] b= new Boolean[n];
		Arrays.fill(b, Boolean.TRUE);
		
		
		/*Utilizzo il metodo di Iqbal*/
		b=metodoIqbal(b);
		out.println("Metodo di Iqbal: ");
		leggimultipli(b, out);
		
		/*Utilizzo il mio metodo*/
		//b=metodoVinci(b);
		//out.println("Metodo di Vinci: ");
		//leggimultipli(b, out);
		
	}

	
	/*Metodi che utilizzo*/
	public static Boolean[] metodoIqbal(Boolean[] b) //N.B:la B di Boolean deve essere maiuscola perchè un array è un ogggetto
	{
		int j;
		
		for(int i=2; i<=(int)Math.sqrt(b.length); i++)
		{
			j=i;
			while((i+j)<=b.length)
			{
				b[i+j]=false;
				j+=i;
			}
		}

		return b;
	}
	
	/*public static Boolean [] metodoVinci(Boolean []b)//N.B:la B di Boolean deve essere maiuscola perchè un array è un ogggetto
	{
		
		int j;
		
		for(int i=2; i<=Math.sqrt(b.length); i++)
		{
			j=i;
			while((i+j)<=b.length)
			{
				b[i+j]=false;
				j+=i;
			}
		}

		return b;
	}*/
	
	public static void leggimultipli(Boolean [] array, ConsoleOutputManager out) 
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==true)
				out.println(i);
		}
		
	}
}
