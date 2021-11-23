import java.util.Vector;

import prog.io.FileInputManager;

public class UsoFile_IMPORTANTE {

	public static void main(String[] args) {

		/*Ogni riga la deposito in un vector*/
		String namefile= "La Tigre della Malesia.txt";
		
		if(FileInputManager.exists(namefile))
		{
			Vector<String> buf= new Vector();
			FileInputManager fin= new FileInputManager(namefile);
			
			
			while(true)
			{
				String riga= fin.readLine(); //Bisogna mettere il FileInputMangaer e non del ConsoleOutputManager
				
				if(riga==null)
					break; //Uscita dal ciclo
				
				buf.add(riga);
				
			}
			
			for(String s: buf)
				System.out.println(s);
			
			fin.close();
		}
		
		else
			System.out.println("File non trovato");
		
	}

}
