import java.util.StringTokenizer;
import java.util.Vector;

import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Esercizio2 {

	public static void main(String[] args) {
		
		
		Vector<Figura> fig= new Vector();
		String s1= "Q, 3.8; R, 5,8.7; C 0.5";
		
		StringTokenizer st1= new StringTokenizer(s1,";");
		
		double [] valori= new double [2];
		while(st1.hasMoreTokens())
		{
			int i=0;
			char campo = 0;
			String s2= st1.nextToken();
			
			StringTokenizer st2= new StringTokenizer(s2,";");
			
			while(st2.hasMoreTokens())
			{
				String s3= st1.nextToken();
				if(i==0)
				{
					
					campo=  s3.charAt(0);
				}
				if(i==1||i==2)
					valori[i]= Double.parseDouble(s3);
			
				double l1= valori[0];
				i++;
				
			}
			
			/*Il valore che diventa va sempre inizializzato*/
			Figura k = null;
			
			switch(campo)
			{
				case 'Q':
				case 'q':
				{
					k= new Quadrato(valori[0]);
					break;
				}
				case 'C':
				case 'c':
				{
					k= new Cerchio(valori[0]);
					break;
				}
				case 'R':
				case 'r':
				{
					k= new Rettangolo(valori[0], valori[1]);
					break;
				}
			}
			
			fig.add(k);
		}
	}

}
