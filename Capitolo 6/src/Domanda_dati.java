import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

/*Domanda all'utente i due lati di un rettangolo o quadrato*/
//Se sono uguali istanzia un quadrato
//Altrimenti costruisce un rettangolo
//Stampa area e perimetro

public class Domanda_dati {

	public static void main(String[] args) {
		
		//Il tipo di una variabile è la classe di appartenenza
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		double a= in.readDouble("Inserisci lato 1: ");
		double b= in.readInt("Inserisci lato 2: ");
		
		Rettangolo quad;
		
		/*Tipo equivale  a classe*/
		
		/*Se i lati sono uguali creo un quadrato, altrimenti un quadrato*/
		if(a==b)
			quad= new Quadrato(a);//Non perdo dati in questa conversione
		else
			quad= new Rettangolo(a,b); 
		
		//Posso sapere se è un rettangolo o un quadrato??
		//istanceof
		if(quad instanceof Quadrato)
			out.println("Questo è un quadrato");
		
		/*Se metto due lati uguali esce anche se metto due lati uguali*/
		if(quad instanceof Rettangolo) //Per capire prova a fare l'esecuzione in caso sia un quadrato
			out.println("Questo è un rettangolo");
		
		/*Non c'è nel libro*/
	}

}
