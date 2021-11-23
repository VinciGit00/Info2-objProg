import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Conversioni {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		long h=900000000; //Se è più grande di un intero posso creare problemi di arrotondamento
		int j= (int)h; //Possibile perdita di informazioni
		
		double f= 0.0/0.0; //caso particolare, deve esserci lo 0.0
		out.println(f);//Quando lo stampo in console mi esce NaN
		
		/*PERDITA DI PRECISIONE*/
		int x=1000000004;
		float y=x; //Conversione implicita da int a float
		out.println(x);
		/*Mi perde il 4*/
		out.println(y); //Conversione fa perdere un po' di dati
		
		double  k= 127.3;
		int v= (int)k; // Mi tronca 0.3
		

	}

}
