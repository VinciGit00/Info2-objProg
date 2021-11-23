import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es8Rifatto {
	
	public static void main(String[] args) {
		ConsoleOutputManager out= new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		int n= in.readInt("Inserisci numero: ");
		int val;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				val=i*j;
				out.print(val+"|");
			}
			out.println();
		}
	}

}
