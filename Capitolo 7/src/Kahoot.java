
public class Kahoot {

	public static void main(String[] args) {

		try {
			int x=0;
			int y=2/x;
		} catch (RuntimeException e) {
			System.out.println("Le eccezioni non controllate ");
		}
		
		
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} /*catch (ArithmeticException ae) {
			// TODO: handle exception-> Dà ERRORE DI COMPILAZIONE perchè le eccezioni devono essere in ordine gerarchico
		}*/
		
		foo();
	}
	
	public static void foo() {
		
		try {
			return;
		} finally {
			System.out.print("Finally");
		}
	}
}
