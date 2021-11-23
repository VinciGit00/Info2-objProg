
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

/*Domanda due frazioni e scrive la loro somma*/
/*Frazioni è il nome della classe*/
public class Frazioni {

	public static void main(String[] args) {
		
		/*Creazione degli oggetti*/
		ConsoleOutputManager video= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();

		Frazione f= new Frazione(1,2); //Creo una frazione, inserisco dentro la lista degli argomenti
		
		/*Creazione della prima frazione*/
		int num=in.readInt("Inserisci numeratore prima frazione: ");
		
		int den;
		/*Controllo sul denominatore*/
		do {
			den=in.readInt("Inserisci denominatore prima frazione: ");
			if(den==0)
				video.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(den!=0);
		
		/*Gli argomenti devono avere gli int all'interno*/
		Frazione f1= new Frazione (num, den);//Dentro la parentesi c'è la lista degli argomenti
		
		/*Creazione della seconda frazione*/
		num= in.readInt("Inserisci numeratore seconda frazione: ");
		
		/*Controllo sul denominatore*/
		do {
			den=in.readInt("Inserisci denominatore prima frazione: ");
			if(den==0)
				video.println("Non è possibile svolgere la divisione per 0, reinserisci il valore del denominatore");
		}while(den!=0);
		
		/*Gli argomenti devono avere gli int all'interno*/
		Frazione f2= new Frazione(num, den); //Dentro la parentesi c'è la lista degli argomenti
		
		/*Calcolo della somma*/
		Frazione somma= f1.piu(f2);
		/*è uguale a:*/
		Frazione sommma=f2.piu(f1);
		
		/*Incremento particolare*/
		/*Gli argomenti devono avere gli int all'interno*/
		Frazione frazione= new Frazione(num,den);
		frazione=frazione.piu(f1); //Si può richiamare la funzione in questo modo
		
		/*Calcolo della differenza*/
		Frazione differenza1=f1.meno(f2) ;
		/*Che è diverso da:*/
		Frazione differenza2= f2.meno(f1); //Sono risultati differenti
		
		/*Come scrivere a console i valori degli oggetti:*/
		video.println("La somma vale: "+somma);
		/*Oppure*/
		video.println("La somma vale: "+somma.toString()); //Converte la classe frazione in stringa
		
	}

}