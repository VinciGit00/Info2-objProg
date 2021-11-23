package Programmi_lezioni;

public class Eccezioni_con_stringhe {

	public static void main(String[] args) {
		String parola= "Marco";
		char s;
		try {
			int indice= (int) (Math.random()*10);
			s= parola.charAt(indice); 
			System.out.println(s);
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Fuori dall'indice");
		} finally {
			System.out.println("Fine");
		}
		System.out.println("Marco");
	}

}
