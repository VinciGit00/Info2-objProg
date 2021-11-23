import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.FileInputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;
import prog.utili.SequenzaOrdinata;

public class Esercizio4 {

	public static void main(String[] args) {

		String filename= "persona.txt";
		
		if(FileInputManager.exists(filename)) //Controllo se il file esiste
		{
			System.out.println("Il file esiste");
			System.out.println(" ");
			
			 FileInputManager testo= new FileInputManager(filename); //Va inserito il nome del file
			 
			 SequenzaOrdinata<String> nomi= new SequenzaOrdinata<String>();
			 
			 while(true)
			 {
				 String line= testo.readLine();
				 if(line==null)
					 break; //Uscita dal ciclo in caso siano uguali
				 nomi.add(line);
				 
			 }
			 
			 
			 
			 testo.close(); //Chiude il testo
			 
			 for(String scorri: nomi)
			 {
				 System.out.println(scorri);
			 }
		}
		 
		 else
				System.out.println("Il file non esiste");
	}
	
	public static Vector<Figura> creafig(Vector<String> nomi)
	{
		
		/*Inizializzo il vector tamite il null*/
		Vector<Figura> fig=new Vector(); //I vector vanno sempre inizializzati col new
		
		for(int i=0; i<nomi.size(); i++)
		{
			String q= nomi.get(i);
			StringTokenizer st= new StringTokenizer(q, "; ");
			
			while(st.hasMoreTokens())
			{
				String [] parola= st.nextToken().split(",");
				
				if(parola[0].equalsIgnoreCase("Q"))
					fig.add(new Quadrato(Double.parseDouble(parola[1])));
				if(parola[0].equalsIgnoreCase("R"))
					fig.add(new Rettangolo(Double.parseDouble(parola[1]), Double.parseDouble(parola[2])));
				if(parola[0].equalsIgnoreCase("C"))
					fig.add(new Cerchio(Double.parseDouble(parola[1])));		
			}
		
		}
		return null;
		
	}
	

}

