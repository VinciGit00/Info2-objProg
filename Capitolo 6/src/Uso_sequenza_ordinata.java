import prog.utili.SequenzaOrdinata;

public class Uso_sequenza_ordinata {

	public static void main(String[] args) {

		SequenzaOrdinata <String> nomi= new SequenzaOrdinata();
		
		/*Non posso fare:*/
		
		/*Solo classi di riferimento*/
		//SequenzaOrdinata <int> nomi= new SequenzaOrdinata();
		
		//Sequenza ordinata di rettangoli:
		/*Dà errore perchè non può ordinarsi in base alla lunghezza di un rettangolo*/
		//SequenzaOrdinata<Rettangolo> rettangoli= new SequenzaOrdinata();
		
		Comparable <String> s1= "Maria";
		Comparable <String> s2= "Giovanni";
		
		System.out.println(s1.compareTo((String) s2));
		
		
		/*Oppure: */
		String s3= "Maria";
		String s4= "Giovanni";
		
		System.out.println(s3.compareTo((String) s4));
	}

}
