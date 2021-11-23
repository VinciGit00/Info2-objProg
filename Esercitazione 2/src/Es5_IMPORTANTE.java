import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

/*Programma per l'uso dei vector*/
public class Es5_IMPORTANTE {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String stringa= in.readLine("Inserisci una stringa");
		
		Vector<Frazione> v= new Vector();
		
		v=extractFrazioni(stringa);
	
		Frazione f= new Frazione(1,1);
		f=getFrazione(v);
		
		out.println("Il podotto è: "+ getFrazione(v)); //Metodo per fare la chiamata
	}
	
	public static Vector<Frazione> extractFrazioni(String s) //Vector è equivalente ad arraylist
	{
		int [] numDen= new int[2];
		StringTokenizer st= new StringTokenizer(s, ";");
		Vector<Frazione> v= new Vector<Frazione>();
		
		while(st.hasMoreTokens())
		{
			String sParziale= st.nextToken();
			
			StringTokenizer st2= new StringTokenizer(s, ";");
			
			int i=0;
			
			while(st2.hasMoreTokens())
			{
				numDen[i]=Integer.parseInt(st2.nextToken());  //Metto temporaneamente sul vettore
				i++;	 		
			}
			
			Frazione f= new Frazione(numDen[0],numDen[1]);
			v.add(f);
		}
		
		return v;
	}

	public static Frazione getFrazione(Vector<Frazione> v)
	{
		Frazione prodotto= new Frazione(1,1);
		
		for(Frazione g:v)
		{
			prodotto=prodotto.per(g);
		}
		
		return prodotto;
	}
}
