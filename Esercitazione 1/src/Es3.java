import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es3 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Frazione f1= new Frazione(1,3);
		Frazione f2= new Frazione(2,3);
		
		out.println("Somma: "+f1.piu(f2).toString());
		out.println("Differenza: "+f1.meno(f2).toString());
		out.println("Prodotto: "+f1.per(f2).toString());
		out.println("Quoziente: "+f1.diviso(f2).toString()); //Nb: non si può fare la somma come con gli interi
	}

}
