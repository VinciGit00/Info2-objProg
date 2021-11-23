import prog.io.ConsoleOutputManager;
import java.util.StringTokenizer;


//Esercizio per imparare ad usare lo stringTokenizer


public class StringTokenizer_prova {

	public static void main(String[] args) {
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Creazione delle variabili e degli oggetti*/
		int n=0;
		String s="a,b,c,d";
		
		StringTokenizer st= new StringTokenizer(s,","); //Stringa di riferimento e codice di riconoscimento del token
		while(st.hasMoreTokens())
		{
			n=Integer.parseInt(st.nextToken()); //Prende il singolo token
		}

	}

}
