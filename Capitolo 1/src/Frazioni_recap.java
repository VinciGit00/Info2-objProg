
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Frazioni_recap {

	public static void main(String[] args) {
		/*Creazione degli oggetti*/
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Gestione degli input della frazione*/
		int n=in.readInt("Inserisci il numeratore della frazione da prendere in considerazione: ");
		int d;
		do {
			d=in.readInt("Inserisci il denominatore della frazione da prendere in considerazione: ");
		}while(d!=0);
		
		int incr=in.readInt("Seleziona il valore dell'incremento che vuoi eseguire: ");
		
		int fin=in.readInt("Seleziona fino a che valore vorresti arrivare: ");
		
		/*Creazione delle frazioni che servono per il programma*/
		Frazione f= new Frazione(n,d);
		Frazione incremento= new Frazione(incr);
		Frazione fine= new Frazione(fin);
		
		/*Inizializzazione del ciclo*/
		while(fine.isMaggiore(f))
		{
			f=f.piu(incremento);
			out.println("Il valore della frazione ora vale: "+f);
		}
		
		/*Se voglio creare un incremento tramite vettori: */
		n=in.readInt("Inserisci il numeratore della frazione da prendere in considerazione: ");
		d=3;
		do {
			d=in.readInt("Inserisci il denominatore della frazione da prendere in considerazione: ");
		}while(d!=0);
		
		/*Creazione del vettore*/
		int dim=in.readInt("Inserisci la lunghezza del vettore che vuoi inserire: ");
		int[] vettore= new int[dim]; //Guarda bene come si crea un vettore in int
		
		/*Azzeramento dei valori*/
		Frazione zero= new Frazione(0,0);
		f=f.per(zero);
		
		/*Inserimento dei valori nel ciclo con l'inserimento dati diretto*/
		for(int i=0;i<dim; i++)
		{
			vettore[i]=in.readInt("Inserisci il vaore nella posizione "+(i+1)+" del vettore: ");
			Frazione temp=new Frazione(vettore[i]);
			f=f.piu(temp);
		}
		
		out.println("Il valore finale della frazione vale: "+f.toString());
		
	}

}

