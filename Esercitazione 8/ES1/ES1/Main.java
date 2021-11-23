package ES1;

import Eccezioni.kmsbagliatiException;

public class Main {
	
	public static void main(String[] args) throws kmsbagliatiException {
		TelecameraNormale T1= new TelecameraNormale(1, "Pos", 20);
		//TelecameraNormale Tsbagliata1= new TelecameraNormale(1, "Pos", 2000);
		
		TelecameraAllarme T2= new TelecameraAllarme(1, "Pos", 20, 036343525);
		//TelecameraAllarme Tsbagliata2= new TelecameraAllarme(1, "Pos", 2000, 036343525);
		
		TelecameraSemplice T3= new TelecameraSemplice(1, "Pos", 20, "Sony");
		TelecameraSemplice Tsbagliata3= new TelecameraSemplice(1, "Pos", 2023, "Sony");
		
		GestoreTelecamere gt= GestoreTelecamere.caricatelecameredafile();
	}
}
