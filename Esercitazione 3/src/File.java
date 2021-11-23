import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class File {

	public static void main(String[] args) {
		
		String filename= "persona.txt";
		
		if(FileInputManager.exists(filename)) //Controllo se il file esiste
		{
			System.out.println("Il file esiste");
			System.out.println(" ");
			
			 FileInputManager testo= new FileInputManager(filename); //Va inserito il nome del file
			 
			 SequenzaOrdinata<String> nomi= new SequenzaOrdinata<String>();
			 
			 while(true)
			 {
				 String line= testo.readLine();
				 if(line==null)
					 break; //Uscita dal ciclo in caso siano uguali
				 nomi.add(line);
			 }
			 
			 testo.close(); //Chiude il testo
			 
			 for(String scorri: nomi)
			 {
				 System.out.println(scorri);
			 }
		}
		 
		 else
				System.out.println("Il file non esiste");
		
	}

}
