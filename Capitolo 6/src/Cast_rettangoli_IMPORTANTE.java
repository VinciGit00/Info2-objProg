import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Cast_rettangoli_IMPORTANTE {

	public static void main(String[] args) {

		Rettangolo r= new Rettangolo(5,5);
		
		//Promosso al tipo pi� ampio
		Rettangolo b= new Quadrato(4); //Si pu� fare!!!-> ragionamento: un  quadrato � un rettangolo!!!
		//Anche questo si pu� fare:
		Object o= new String("A"); //Devo mettere la sottoclasse a destra
		
		Quadrato q= new Quadrato(4);
		
		/*Casting*/
		if(r.getAltezza()==r.getBase())
			q= (Quadrato) r; //Questo non genera un errore in compilazione-> il cast si fa solo con gli int e ste cazzate qua
		
		//Questo non si pu� fare r=b;
		Quadrato c= new Quadrato(5);
		r= (Quadrato) c;
		
	}

}
