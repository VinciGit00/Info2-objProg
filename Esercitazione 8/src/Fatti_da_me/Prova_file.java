package Fatti_da_me;

import java.util.ArrayList;

import prog.io.FileInputManager;

public class Prova_file {
	public static void main(String[] args) {
		ArrayList<Persona> LP= new ArrayList<>();
		String namefile= "Prova.txt";
		if(FileInputManager.exists(namefile)) {
			FileInputManager fin= new FileInputManager(namefile);
			for(;;) {
				String line= fin.readLine();
				if(line==null)
					break;
				System.out.println(line);
				String []data= line.split(";");
				Persona pers=new Persona(data[0], data[1], Integer.parseInt(data[2])); //Non mettere gli spazi  tra  la riga e l'altra boy 
				LP.add(pers);
			}
			System.out.println(LP);
			
		}
		
		else {
			System.out.println("Non esiste");
		}
		
	}
}
