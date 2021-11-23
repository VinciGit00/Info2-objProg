import prog.io.ConsoleOutputManager;
import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class File_con_sequenzaOrdinata_IMPORTANTE {

	public static void main(String[] args) {

		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String namefile= "Nomi.txt";
		
		if(FileInputManager.exists(namefile))
		{
			FileInputManager fin= new FileInputManager(namefile);
			
			SequenzaOrdinata<String> seq= new SequenzaOrdinata();
			
			while(true)
			{
				String s= fin.readLine(); //Legge il carattere
				if(s==null)
					break; //Uscita dal ciclo
				seq.add(s); //Memorizzq il file qui 
			}
			
			for(String temp: seq)
				out.println(temp);
		
		}
		
		else
			out.println("file non trovato ");
	}

}
