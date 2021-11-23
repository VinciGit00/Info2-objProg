
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.utili.Cerchio;
import prog.utili.Figura;
import prog.utili.Rettangolo;

public class DomandeFigure_prof {
	// domanda all'utente una serie di figure geometriche che memorizzo in un vector
	// domanda char R -> rettangolo q -> ...
	// poi calcolo quella che ha area massima (con un metodo)

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		// per morizzare un solo vector di Figura 
		// NON USARE 3 vector per ogni tipo di figura
		
		/*Il Vector è formato da Figure*/
		Vector<Figura> figure = new Vector<Figura>();
		
		for(;;) {
			
			/*In base alla richiesta creo delle sottoclassi di tipo figura*/
			
			char f = in.readChar("che figura vuoi inserire");
			if (f=='x') break;
			
			/*N.b: va azzerrata a null ogni volta (Altrimenti crea un tipo a caso*/
			/*IMPORTANTE*/
			Figura figura = null; //IMPORTANTE
			
			/*Occhio allo switch man*/
			switch (f) {
			case 'R':
			case 'r': //Guarda bene il break boy
				figura = new Rettangolo(in.readInt("lato1"), in.readInt("lato2"));
				break;
			case 'C':
			case 'c':
				figura = new Cerchio(in.readInt("raggio"));
				break;

			default:
				break;
			}
			figure.add(figura);
		}
		stampaFiguraPiuGrande(figure);
	}

	private static void stampaFiguraPiuGrande(Vector<Figura> figure) {
		Figura max = figure.get(0);
		for(Figura f: figure) {
			if (f.getArea()> max.getArea()) max = f;
		}
		System.out.println(max.getClass().getSimpleName());
		System.out.println(max);
	}

	
	
}
