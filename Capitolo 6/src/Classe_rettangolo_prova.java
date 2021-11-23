import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Classe_rettangolo_prova {

	public static void main(String[] args) {
	
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*Crea un riferimento r ad un oggetto rettangolo*/
		
		int b=0, h=0;
		
		do {
			b=in.readInt("Inserisci la base: ");
			
			if(b<0)
				out.println("La base non può essere minore di 0!!");
		}while(b<0);
		
		do {
			h=in.readInt("Inserisci la base: ");
			
			if(h<0)
				out.println("La base non può essere minore di 0!!");
		}while(h<0);
		
		Rettangolo r= new Rettangolo(b,h);
		
		Quadrato r1= new Quadrato(1);
		
		out.println(r.toString()); //Converte in String
		out.println(r.getArea()); //Stampa l'area
		out.println(r.getPerimetro()); //Stampa il perimetro
		out.println(r.getAltezza());//Stampa l'altezza
		out.println(r.getBase());//Stampa la base
		
		if(r.haAreaMaggiore(r1) ||r.haPerimetroMaggiore(r1))
			out.println("area maggiore di r1 o perimetro maggiore di r1");
			
			
		double f=r.getArea();
		f=r.getPerimetro();
		f=r.getAltezza();
		f=r.getBase();
		
	}

}
