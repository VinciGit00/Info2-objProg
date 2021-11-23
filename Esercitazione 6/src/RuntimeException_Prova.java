
public class RuntimeException_Prova {

	public static void main(String[] args) {

		try {
			int x=-1;
			if(x<1)
				throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println("Numero negativo non valido");
		}
		
	}

}
