
import prog.io.ConsoleInputManager;
import prog.utili.Cerchio;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;


// domanda all'utene i due lati di un rettangolo o quadrato
// se sono uguali isntazia un quadrato
// altrimenti costruisc eun rettangolo
// stampa area e perimetro
public class DomandaDati_prof_IMPORTANTE{

/*Guarda bene la riga 36*/
	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		int a = in.readInt("primo lato");
		int b = in.readInt("secondo lato");
		Rettangolo r;
		if (a==b) {
			r = new Quadrato(a);//Promozione
		} else {
			r = new Rettangolo(a,b);
		}
		// NON POSSO r = new Cerchio(5)
		// posso saper qui se e è un rettangolo o un quadrato????
		//instanceof
		if (r instanceof Quadrato)
			System.out.println("questo è un quadrato");
		if (r instanceof Rettangolo)
			System.out.println("questo è un rettangolo");
		
		/*IMPORTANTE*/
		// non c'è nel libro
		System.out.println(r.getClass());//SCRIVE LA CLASSE DI APPARTENENZA
		
		System.out.println(r.toString());
		System.out.println(r.getArea());
		System.out.println(r.getPerimetro());
	}
	
}
