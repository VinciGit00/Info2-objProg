package Programmi_in_pi�;

public class Provaintercettazioni {
	
	public static void main(String[] args) {
		int c;
		try {
			int a=5;
			int b=0;
			c=a/b;
		} catch (ArithmeticException e) { //Viene creato un oggetto che descrive quanto � accaduto
			System.out.println("Eccezione"); //Il programma non finisce qui se non metto il return
		}
		/*Questo non si pu� fare bb*/ 
		//System.out.println(c);
		System.out.println("Il programma non finsce con il catch ma va avanti");
	}

}
