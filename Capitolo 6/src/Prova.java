import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Prova {
	public static void main(String[] args) {

		Rettangolo r= new Rettangolo(2, 2);
		Quadrato q= new Quadrato(5.0);
		
		if(r instanceof Quadrato) 
			q=(Quadrato) r; //Si può fare-> Casting
		System.out.println(q);
		
		r= q; //Promozione implicita
		if(r instanceof Quadrato)
			r=(Quadrato) q; //Necessario fare un controllo perchè può generare un errore di esecuzione
		
		float f;
		int k=3;
		f=k;
		System.out.println(f);
		
		f=(float) k;//Si può fare ma non è obbligatorio
		System.out.println(f); //Oggetti costruiti in fase di esecuzione!!!
	}
}
