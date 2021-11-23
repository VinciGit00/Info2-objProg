/*Involucro permette di creare riferimenti a oggetti e non variabili*/
/*Involucro e Wrapper sono la stessa cosa*/
public class ClassiInvolucro_IMPORTANTE {

	public static void main(String[] args) {
		
		/*Integer creato inserendo un int*/
		Integer k= new Integer(10);
		
		/*Integer creato inserendo una stringa*/
		String s="10";
		Integer k1= new Integer(s);
		
		/*Vantaggio: posso usarlo con i metodi degli oggetti*/
		if(k1.equals(k))
			System.out.println();
	}
}
