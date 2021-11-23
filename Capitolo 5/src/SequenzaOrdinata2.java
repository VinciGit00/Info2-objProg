import prog.io.ConsoleInputManager;
import prog.utili.SequenzaOrdinata;

public class SequenzaOrdinata2 {

	public static void main(String[] args) {
		
			ConsoleInputManager in= new ConsoleInputManager();
			
			/*Per le stringhe*/
			SequenzaOrdinata<String> n= new SequenzaOrdinata<String>();
			String s= new String();
			
			while(true)
			{
				s= in.readLine();
				if(s.contentEquals(" "))
					break; //Esce dal ciclo
				n.add(s);
			}
			
			/*Per gli int*/
			//SequenzaOrdinata<int> n1= new SequenzaOrdinata<int>();
		}
	}


