
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Usogerarchia_prof{
	
	public static void main(String[] args) {
		
		/*Object � una superclasse*/
		Object o = new String("ciao");
		
		Rettangolo r = new Rettangolo(5,6.5);
		System.out.println(r.getArea());
		
		/*Quadrato � una sottoclasse e quindi si pu� fare*/
		Rettangolo q = new Quadrato(55); // quadrato � anche un rettangolo
		
		
		Rettangolo r2 = new Rettangolo(1,1); // attenzione questo per java � un rettangolo
		
	}

}
