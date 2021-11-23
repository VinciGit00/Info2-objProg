import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class CostruzioneDiArray {

	public static void main(String[] args) {
	
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		/*Struttura base: = new tipo base[int]*/
		
		/*Vettore di interi*/
		int [] numeri= new int [10]; //Il tipo base è int 
		
		/*Vettore di stringhe*/
		/*Automaticamente mette tutti i valori uguali a null*/
		String [] s= new String[10]; //numero di elementi sempre da specificare
		
		/*Vettore di caratteri*/
		char [] caratteri= new  char[4];
		/*Oppure*/
		
		/*Altro metodo per fare le dichiarazioni:*/
		char [] caratteri1= {'a','b', 'c'};//Numero non specificato a priori ma lo riconosce da solo
		
		/*Vettore di stringhe*/
		String[] s1= {"Marco", "Federico", "Stefano", "Iqbal", "Jojo"};
		
		/*Vettore di frazioni*/
		/*Vettore di oggetti*/
		/*Automaticamente mette tutti i valori uguali a null*/
		Frazione[] f= new Frazione[4]; //4 posizioni (da 0 a 3) 
		
		/*Assegnamento*/
		/*Assegnamento diretto*/
		f[0]= new Frazione(1,4);
		f[1]= new Frazione (1,2);
		f[3]= new Frazione(1,4);
		f[4]= new Frazione (1,2);
		/*Metodo analogo in un'unica riga*/
		Frazione [] f1= {new Frazione(1,4), new Frazione(1,2), new Frazione (1,5)};
		
		/*Assegnamento con un ciclo for con richiesta per l'utente*/
		for(int i=0; i<f.length; i++)
		{
			int n=in.readInt("Inserisci il numeratore della frazione in posizione: "+(i+1));
			int d=in.readInt("Inserisci il denominatore della frazione in posizione: "+(i+1));
			
			f[i]= new Frazione(n,d);
		}
	}

}
