import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/*Chiedo all'utente la password e se è uguale alla parola magica*/
/*allora ha accesso alla parola*/

public class UsoPassword {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String password= in.readLine();
		/*Confronta con i puntatori agli oggetti*/
		if(password=="Atalanta") //Sempre falso perchè puntano a due oggetti sempre differenti
			out.print("Hai accesso alla cassaforte");
		else
			out.print("Non ti riconosco, vai via juventino");
		
		/*Confronta carattere per carattere il contenente degli oggetti*/
		if(password.equals("Atalanta")) //Sempre falso perchè puntano a due oggetti sempre differenti
			out.print("Hai accesso alla cassaforte");
		else
			out.print("Non ti riconosco, vai via juventino ");

	}

}
