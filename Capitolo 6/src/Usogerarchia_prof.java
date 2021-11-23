
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Usogerarchia_prof{
	
	public static void main(String[] args) {
		
		/*Object è una superclasse*/
		Object o = new String("ciao");
		
		Rettangolo r = new Rettangolo(5,6.5);
		System.out.println(r.getArea());
		
		/*Quadrato è una sottoclasse e quindi si può fare*/
		Rettangolo q = new Quadrato(55); // quadrato è anche un rettangolo
		
		
		Rettangolo r2 = new Rettangolo(1,1); // attenzione questo per java è un rettangolo
		
	}

}
