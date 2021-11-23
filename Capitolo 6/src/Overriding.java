import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class Overriding {

	public static void main(String[] args) {

		Object o;
		
		/*La riscrittura (overriding) dipende dall'oggetto che esegue il metodo e non dal riferimento*/
		/*Il metodo da eseguire viene determinato dalla JVM in fase di esecuzione sulla sulla base del tipo effettivo dell'oggetto e non dal riferimento*/
	
		Rettangolo r= new Rettangolo(5,6); 
		
		o=r; //r viene promosso a object
		
		System.out.println(o.toString());
		
		/*Se invece facessi:*/
		Quadrato j= new Quadrato(5);
		
		r=j;
		/*E' uguale ad*/
		r=(Rettangolo)j;
		
	}

}
