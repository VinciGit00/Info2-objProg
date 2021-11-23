import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Classe_quadrato_prova {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int h= in.readInt("Inserisci lato 1: ");
		int b= in.readInt("Inserisci lato 2: ");
		
		/*Tipo equivale  a classe*/
		
		Rettangolo quad; //Posso dichiararlo mediante superclasse 
		/*Oppure: Object quad */
		if(h==b)
			quad= new Quadrato(h); //Utilizzo la sottoclasse
		else
			quad= new Rettangolo(h,b);
		
		if(quad instanceof Quadrato)
			out.println("Hai inserito un quadrato");
		/*N.B: se mettessi  instanceof Rettangolo entrerebbe lo stesso anche se è un quadrato */
		else
			out.println("Hai inserito un cerchio");
			
	}

}
