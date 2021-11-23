package Programmi_in_più;

public class Anomalia_chiamante {

	public static void main(String[] args) {

		int x=3;
		int y=0;
		float z; 
		//z=x/y; //Con questo l'anomalia viene mandata al chiamante ed interrompe l'esecuzione
		
		try{
			z=x/y;
		} catch(ArithmeticException e) { //Se viene intercettato blocca l'esecuzione del programma
			System.out.println("Divisione per 0 non è possibile");
			return; //Il return blocca l'esecuzione
		}	finally {
			System.out.println("Fine");
		}
		
		System.out.println("Linea "); //Anche se viene intercettato lo esegue
	}

}
