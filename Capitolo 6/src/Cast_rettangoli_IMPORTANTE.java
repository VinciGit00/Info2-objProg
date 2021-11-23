import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Cast_rettangoli_IMPORTANTE {

	public static void main(String[] args) {

		Rettangolo r= new Rettangolo(5,5);
		
		//Promosso al tipo più ampio
		Rettangolo b= new Quadrato(4); //Si può fare!!!-> ragionamento: un  quadrato è un rettangolo!!!
		//Anche questo si può fare:
		Object o= new String("A"); //Devo mettere la sottoclasse a destra
		
		Quadrato q= new Quadrato(4);
		
		/*Casting*/
		if(r.getAltezza()==r.getBase())
			q= (Quadrato) r; //Questo non genera un errore in compilazione-> il cast si fa solo con gli int e ste cazzate qua
		
		//Questo non si può fare r=b;
		Quadrato c= new Quadrato(5);
		r= (Quadrato) c;
		
	}

}
