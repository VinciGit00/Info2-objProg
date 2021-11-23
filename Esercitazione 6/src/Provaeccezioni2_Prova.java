
public class Provaeccezioni2_Prova {

	public static void main(String[] args) {
		
		try {
			int k=-5;
			if(k<0)
				throw new valorengativoexception2();
		} catch (valorengativoexception2 e) {
			System.out.println("Valore negativo non consentito");
		}
	}
}
