package Es1;

import prog.io.ConsoleInputManager;

public class Es1 {
	
	public static void main(String[] args) {
		
		ConsoleInputManager in= new ConsoleInputManager();
		int x=in.readInt("Inserisci un numero: ");

		try {
			int y= (int)(Math.random()*4);
			float k=x/y;
			System.out.println(k);
			
		} catch (ArithmeticException e) {
			System.out.println("Divisione per 0 non possibile");
		} finally {
			System.out.println("Fine del programma");
		}
	}
}
