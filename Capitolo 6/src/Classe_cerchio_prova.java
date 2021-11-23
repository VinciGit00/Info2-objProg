import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Cerchio;

public class Classe_cerchio_prova {

	public static void main(String[] args) {

		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in= new ConsoleInputManager();
		
		/*Costruttore*/
		Cerchio c1= new Cerchio(2);
		
		/*Metodi che mette a disposizione*/
		double area= c1.getArea();
		out.println("Area: "+c1.getArea());
		
		double circonferenza= c1.getCirconferenza();
		out.println("Circonferenza: "+c1.getCirconferenza());
		
		Cerchio c2= new Cerchio(2.5);
		
		if(c1.haAreaMaggiore(c2))
			out.println("C2 ha area maggiore di C1");
		else
			out.println("C1 ha area maggiore di C2");
		
		if(c1.haPerimetroMaggiore(c2))
			out.println("C2 ha perimetro maggiore di C1");
		else
			out.println("C1 ha perimetro maggiore di C2");
		

		
	}

}
