package Gestore;

import java.util.ArrayList;

import Eccezioni.ErroreCarattereException;
import Eccezioni.FileinesistenteException;
import OggettoEsame.AB;
import prog.io.FileInputManager;

public class Gestore implements Gestoreif {
	
	ArrayList<AB> lista;
	
	public Gestore() {
		lista = new ArrayList<>();
	}

	@Override
	public void LeggiFile() throws FileinesistenteException {
		String namefile="File.txt";
		FileInputManager fin= new FileInputManager(namefile);
		
		if(!fin.exists(namefile))
			throw new FileinesistenteException();
		
		while(true) {
			String line=fin.readLine();
			if(line==null)
				break;
			String [] temp=line.split(";");
			try {
				switch(temp[0]) {
				case "A":
					
					break;
				case "B":
					
					break;
				case "C":
					
					break;
				default: 
					throw new ErroreCarattereException();
			}
			} catch (ErroreCarattereException e) {
				System.out.println("Rilevato errore nel file ");
			}
		}
		
	}
	
}
