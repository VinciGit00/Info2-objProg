package Programmi_lezioni;

public class EsempioFinally {

	public static void main(String[] args) {
		System.out.println("Apre una connessione");
		try {
			System.out.println("Fa un'operazione che può lanciare un'eccezione");
			int y= 5/(int)(Math.random()*5);
			System.out.println("Faccio altre operazioni");
		} catch(Exception e) {
			System.out.println("eccezione!! Allarme");
			return; //Qui chiude tutto
		} finally {
			System.out.println("Chiude la connessione");
		}

	}

}
