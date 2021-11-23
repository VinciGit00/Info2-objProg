import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

//Simulo il lancio di 5 dadi
//se la somma è > 25 dico "sei fortunato" altrimenti scrivo riprova

public class GiocoDadi {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int somma=0;
		/*Lancio 5 dadi*/
		for(int i=0; i<=5; i++)
		{
			/*Ad ogni lancio*/
			out.println("Lancio numero "+i);
			/*Math classe che genera metodi statici*/
			long dado=(int) (Math.round(Math.random()*5))+1; /*Metodo statico, moltiplico per 6 */
			out.println(dado);
			somma+=dado;
		}
		
		if(somma>25)
			out.println("Sei fortunato ");
		else
			out.println("Riprova ");

	}

}
