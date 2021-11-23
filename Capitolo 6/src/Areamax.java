import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Areamax {

	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		double a= in.readDouble("Inserisci lato 1 della prima figura: ");
		double b= in.readInt("Inserisci lato 2 della prima figura: ");
		
		Rettangolo r1= new Rettangolo(a,b);
		
		double c= in.readDouble("Inserisci lato 1 della seconda figura: ");
		double d= in.readInt("Inserisci lato 2 della seconda figura: ");
		
		Rettangolo r2= new Rettangolo(c,d);
		
		if(r1.haPerimetroMaggiore(r2))
			Read(a,b,out);
		else
			Read(c,d,out);
	
	}
	
	public static void Read(double a, double b, ConsoleOutputManager out)
	{
		Rettangolo r3;
		if(a==b)
		{
			 r3= new Quadrato(a);
			
			out.println("La figura inserita è un quadrato ");
			
			out.println("Lato: "+((Quadrato) r3).getLato()); //Bisogna mettere un cast
			out.println("Perimetro: "+r3.getPerimetro());
			out.println("Area: "+r3.getArea());
		}
		
		else
		{
			r3= new Rettangolo(a, b);
			
			out.println("La figura inserita è un rettangolo ");
			
			out.println("Lato 1: "+a+" lato 2: "+b); //Bisogna mettere un cast
			out.println("Perimetro: "+r3.getPerimetro());
			out.println("Area: "+r3.getArea());
		}
	}

}
