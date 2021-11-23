import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;

public class Classe_quadrato {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int l=in.readInt("Inserisci il lato del quadrato: ");
		
		Quadrato quad= new Quadrato(l);
		
		/*Tipo equivale  a classe*/
		
		/*costruttori disponibili oltre a quelli della classe rettangolo*/
		double b= quad.getLato();
		out.print(quad.toString()); //toString cambia in base a come viene eeguito il programma
	}

}
