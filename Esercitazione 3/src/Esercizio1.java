import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Esercizio1 {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Vector<Rettangolo> contenitore= new Vector();
		
		/*Inserimento dei dati al'interno del Vector*/
		do {
			Rettangolo temp;
			
			int l1=in.readInt("Inserisci lato 1: ");
			int l2=in.readInt("Inserisci lato 2: ");
			
			if(l1==l2)
				 temp= new Quadrato(l1);
			else
				temp= new Rettangolo(l1, l2);
			
			contenitore.add(temp);
			
		}while(in.readSiNo("Vuoi continuare (s/n)?"));
		
		Areamax(contenitore, out);
		Perimetromax(contenitore,out);
		
		
	}
	
	public static void Areamax( Vector<Rettangolo> contenitore, ConsoleOutputManager out){
		Rettangolo max= new Rettangolo(0,0); //Non va bene indentarlo a null
		/*METODO PIU' INTELLIGENTE*/
		Rettangolo max1= contenitore.get(0);
		
		
		for(Rettangolo leggi: contenitore)
		{
			if(max.getArea()>leggi.getArea())
				max=leggi;
		}
		
		TipoFigura(max);
		
		out.println("L'area massima è "+max.getArea());
		
			
		}
	
	public static void Perimetromax( Vector<Rettangolo> contenitore, ConsoleOutputManager out){
		Rettangolo max= new Rettangolo(0,0); //Non va bene indentarlo a 0
		
		for(Rettangolo leggi: contenitore)
		{
			if(max.getPerimetro()>leggi.getPerimetro())
				max=leggi;
		}
		
		TipoFigura(max);
		
		out.println("Il perimetro massimo è "+max.getPerimetro());
		
		}
	
	public static void TipoFigura(Rettangolo p)
	{
		if(p instanceof Quadrato)
			System.out.println("La figura è un quadrato");
		else
			System.out.println("La figura è un rettangolo");
	}
	

	public static void Stringhe(String s, ConsoleOutputManager out)
	{
		Vector<Rettangolo> ret= new Vector();
		
		StringTokenizer st = new StringTokenizer(s, ";");
		
		while(st.hasMoreTokens())
		{
			int [] array= new int[2];
			String temp1= st.nextToken();
			
			StringTokenizer st1 = new StringTokenizer(s, ",");
			
			int i=0;
			
			while(st1.hasMoreTokens())
			{/*Deposito in un array temporaneo la lunghezza dei lati*/
				String temp2= st.nextToken();
				int val= Integer.parseInt(temp2);
					array[i]= val;
				i=1;
			}
			
			Rettangolo r= new Rettangolo(array[0], array[1]);
			
			ret.add(r);	
		}
	}
}
