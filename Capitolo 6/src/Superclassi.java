import prog.utili.Cerchio;
import prog.utili.Frazione;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Superclassi {

	public static void main(String[] args) {
		/*Oggetto appartente alla superclasse Object*/
		/*Posso porlo uguale ad ogni sottoclasse*/
		Object k;
		
		k= new String("Parola");
		k= new Integer(5);
		k= new Double(5);
		k= new Frazione(5,1);
		k= new Rettangolo(5,3);
		k= new Quadrato(5);
		k= new Cerchio(5);
		
		/*Altro caso*/
		Number one;
		one= new Double(5);
		one= new Integer(5);
		
		/*Altro caso*/
		Rettangolo r;
		r= new Rettangolo(5, 6);
		r= new Quadrato(3);
	}

}
