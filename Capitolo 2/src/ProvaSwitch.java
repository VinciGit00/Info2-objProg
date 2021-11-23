import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ProvaSwitch {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int val;
		do {
			val=in.readInt("Inserisci un valore minore di 10: ");
		}while(val>10 || val<0);
		
		Confronta(val);
		
	}
	
	public static void Confronta(int numero)
	{
		ConsoleOutputManager out= new ConsoleOutputManager();

		switch(numero)
		{
			case 1: {out.println("Hai inserito 1");}
			default:{
				out.println("Non hai inserito 1");
			}
		}
	}

}
