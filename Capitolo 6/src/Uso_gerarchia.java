import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Uso_gerarchia {

	public static void main(String[] args) {

		Object o= new String("ciao");
		
		Rettangolo r1= new Rettangolo(5,6);
		
		Quadrato q= new Quadrato(5); //Quadrato è visto un rettangolo con lati uguali
		
		/*Attenzione, questo per java è un rettangolo*/
		Rettangolo r2= new Rettangolo(1,1);//N.B: questo per java è un rettangolo
		
	}

}
