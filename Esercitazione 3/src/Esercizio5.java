import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;

public class Esercizio5 {

	public static void main(String[] args) {

		String filename= "Male.txt";
		if(FileInputManager.exists(filename)) //Controllo se il file esiste
		{
			System.out.println("Il file esiste");
			System.out.println(" ");
			
			 FileInputManager testo= new FileInputManager(filename);
			 
			 int ca=0, ce=0, ci=0, co=0, cu=0;
			 char lettera;
			 
			 while(true)
			 {
				 String line= testo.readLine();
				 if(line==null)
					 break;
				 line=line.toLowerCase();
				 
				 for(int i=0; i<line.length(); i++)
				 {
					 lettera= line.charAt(i);
					 switch(lettera)
					 {
					 	case 'a':
					 		ca++;
					 	case'e':
					 		ce++;
					 	case 'i':
					 		ci++;
					 	case'o':
					 		ce++;
					 	case 'u':
					 		cu++;
	
					 }				 
				}
				 
			 }
			 
			 testo.close(); //Chiude il testo
			 
		}
		 
		 else
				System.out.println("Il file non esiste");
		
	}
	}



