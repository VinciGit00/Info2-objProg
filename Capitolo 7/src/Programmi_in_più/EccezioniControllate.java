package Programmi_in_più;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class EccezioniControllate {
	
	public static void main(String[] args) /*throws FileNotFoundException */{
		try {
			foodelego();
		} catch (FileNotFoundException e) {
			System.out.println("Non ho trovato il file");
		}
	}
	
	static private void fooTC() {
		
		try {
			FileReader fr= new FileReader("pippo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Non ho trovato il file, non so cosa fare");
		}
	}
	
	static private void foodelego() throws FileNotFoundException { //Lo delega esplicitamente al chiamante (main)
		FileReader fr= new FileReader("pippo.txt");
	}
}
