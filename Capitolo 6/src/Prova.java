import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Prova {
	public static void main(String[] args) {

		Rettangolo r= new Rettangolo(2, 2);
		Quadrato q= new Quadrato(5.0);
		
		if(r instanceof Quadrato) 
			q=(Quadrato) r; //Si pu� fare-> Casting
		System.out.println(q);
		
		r= q; //Promozione implicita
		if(r instanceof Quadrato)
			r=(Quadrato) q; //Necessario fare un controllo perch� pu� generare un errore di esecuzione
		
		float f;
		int k=3;
		f=k;
		System.out.println(f);
		
		f=(float) k;//Si pu� fare ma non � obbligatorio
		System.out.println(f); //Oggetti costruiti in fase di esecuzione!!!
	}
}
