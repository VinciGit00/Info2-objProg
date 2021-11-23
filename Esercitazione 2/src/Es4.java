import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.io.ConsoleOutputManager;

public class Es4 {

	public static void main(String[] args) {
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String numeri="3.5-7-4-5"; //Per la virgola nei double utilizzo il punto e non la virgola
	}
	
	/*Metodo con lo stringtokenizer*/
	public static double massimo1(String parola)
	{
		String parolatemp= new String();
		double b, max=0;
		
		StringTokenizer st= new StringTokenizer(parola, "-");
		while(st.hasMoreTokens())
		{
			parolatemp=st.nextToken();
			b=Double.parseDouble(parolatemp); //Metto dentro al parse la stringa temporanea
			
			if(b>max)
				max=b;
			
		}
		
		return max;
	}
	
	/*Metodo con le arraylist e lo split*/
	public static double massimo2(String parola)
	{
		double b, max=0;
		
		/*Creo un array di parole con lo split*/
		String [] arraydiparole= parola.split("-"); //Dentro bisogna mettere l'elemento sepratore
		
		for(String p: arraydiparole)
		{
			b=Double.parseDouble(p);
			
			if(b>max)
				max=b;
		}
		
		return max;
	}
	
	/*Metodo con le arraylist e lo split*/
	public static double massimo3(String parola)
	{
		double b, max=0;
		
		/*Creo un array di parole con lo split*/
		String [] arraydiparole= parola.split("-"); //Dentro bisogna mettere l'elemento sepratore
		
		ArrayList<Double> valori= new ArrayList();
		
		for(String p: arraydiparole)
		{
			b=Double.parseDouble(p);
			
			valori.add(b); //add mette in memoria
		}
		
		for(double val:valori)
		{
			if(val>max)
				max=val;
		}
		return max;
	}
	
	/*Calcolo della media*/
	public static double media1(String p)
	{
		double media=0;
		int i=0;
		
		String [] parole= p.split("-");
		
		for(String cursore: parole)
		{
			double valore= Double.parseDouble(cursore);
			media+=valore;
			i++;
		}
		
		if(i==0)
			return (Double) null;
	
		return media/i;
	}
	
	
	/*Calcolo della varianza*/
	public static double varianza(String parola)
	{
		int i=0;
		double valore;
		double media= media1(parola);
		
		String [] vetparola =parola.split("-");
		
		ArrayList<Double> listacalcoli= new ArrayList();
		
		for(String temp: vetparola)
		{
			valore=Double.parseDouble(temp);
			valore=Math.pow(valore-media, 2); //Valore della varianza
			listacalcoli.add(valore);
			i++;
		}
		
		double somma=0;
		for(int k=0; k<listacalcoli.size(); k++)
		{
			somma+=listacalcoli.get(k);
		}
		
		somma=somma/i;
		
		return (Double) null;
	}
	
	
}
