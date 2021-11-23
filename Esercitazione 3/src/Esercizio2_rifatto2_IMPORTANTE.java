import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Esercizio2_rifatto2_IMPORTANTE {

	public static void main(String[] args) {

		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s="Q,3.8; R,5,8.7; C,0.5";
		
		Vector<Figura> sep= SeparaStringhe(s);
		
	}
	
	public static Vector<Figura> SeparaStringhe(String s)
	{
		
		Vector<Figura> vFinale= new Vector();
		
		StringTokenizer temp1= new StringTokenizer(s, ";");
		
		while(temp1.hasMoreTokens())
		{
			String [] temp2= temp1.nextToken().split(","); //Creo un array temporaneo che ha un minimo di due elementi e un massimo di 3
			/*Non posso usare lo switch perchè non puoi fare l'equals nella condizione*/
			
			if(temp2[0].equalsIgnoreCase("Q"))
			{
				vFinale.add(new Quadrato(Double.parseDouble(temp2[1]))); //Aggiunge al Vector un riferimento ad un oggetto di classe quadrato
			}
			
			else if(temp2[0].equalsIgnoreCase("C"))
			{
				vFinale.add(new Cerchio(Double.parseDouble(temp2[1])));
			}
			
			else if(temp2[0].equalsIgnoreCase("R"))
			{
				vFinale.add(new Rettangolo(Double.parseDouble(temp2[1]), Double.parseDouble(temp2[2])));
			}
			
			
		}
		return vFinale;
	}

	
	public static void massimo(Vector<Figura> sep , ConsoleOutputManager out)
	{
		
		Figura max= sep.get(0);
		
		for(int i=0; i<sep.size(); i++)
		{
			if(max.getArea()<sep.get(i).getArea())
				max=sep.get(i);
		}
		
		if(max instanceof Quadrato)
			out.println("Il massimo è un quadrato");
		else
		{
			if(max instanceof Cerchio)
				out.println("Il massimo è un quadrato");
			else
				out.println("Il massimo è un rettangolo");
		}


	}
}
