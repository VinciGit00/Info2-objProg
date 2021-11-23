import prog.io.ConsoleOutputManager;
import prog.io.FileInputManager;
import prog.utili.Sequenza;

public class Esercizio3 {

	public static void main(String[] args) {

		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String filename= "Nomi.txt";
		
		if(FileInputManager.exists(filename))
		{
			Sequenza<String> seq= new Sequenza();
			
			FileInputManager fin= new FileInputManager(filename);
			String temp;
			
			while(true)
			{
				temp= fin.readLine();
				
				if(temp==null)
					break;
				
				seq.add(temp);
			}
			
			fin.close();
		}
		
		else
			out.println("File non trovato ");
			
	}

}
