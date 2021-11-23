package ES1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import Eccezioni.MappanonEsistenteException;
import Eccezioni.kmsbagliatiException;
import prog.io.FileInputManager;

public class GestoreTelecamere {
	private String nome;
	ArrayList<Telecamera> telecamere;
	
	public GestoreTelecamere(String nome) {
		this.nome=nome;
		telecamere= new ArrayList<>();
	}
	
	public void inserisciTelecamera(Telecamera o) {
		try {
			if(telecamere.contains(o))
				throw new RuntimeException();
				else
					telecamere.add(o);
		} catch (RuntimeException e) {
			System.out.println("Telecamera già contenuta all'interno della lista ");
		}
	}
	
	public boolean cambiastato(int name, Stato OP) throws MappanonEsistenteException {
	
		Telecamera []tt= new Telecamera [telecamere.size()];
		int k=0;
		for(Telecamera t: telecamere) {
			tt[k++]=t;
		}
		
		for(int i=0; i<tt.length; i++ ) {
			Telecamera t= tt[i];
			switch(OP) {
			case SPENTA:
				if(i>0 && i<tt.length-1 && tt[i-1].isAccesa()&& tt[i+1].isAccesa()
					|| (i==0 && i<tt.length-1 && tt[i+1].isAccesa())
					||(i==tt.length-1 && i>0 && tt[i-1].isAccesa()))
					return t.SPEGNI();
			case ACCESA:
				return t.ACCENDI();
			case BLOCCATA:
				return t.BLOCCA();
			default:
				break;
			}
			break;
		}
		
		return false;
	}
	
	static GestoreTelecamere caricatelecameredafile() throws NumberFormatException, kmsbagliatiException {
		GestoreTelecamere gt= new GestoreTelecamere("da file");
		FileInputManager file= new FileInputManager("Telecamere.txt");
		for(;;) {
			String line=file.readLine();
			if(line==null)
				break;
			String []data=line.split(";");
			
			switch(data[0]) {
			case "A":
				gt.inserisciTelecamera(new TelecameraAllarme(Integer.parseInt(data[1]), data[2], Float.parseFloat(data[3]), Integer.parseInt(data[4])));
			case "N":
				gt.inserisciTelecamera(new TelecameraNormale(Integer.parseInt(data[1]), data[2], Float.parseFloat(data[2])));
			case "S":
				gt.inserisciTelecamera(new TelecameraSemplice(Integer.parseInt(data[1]), data[2], Float.parseFloat(data[3]), data[4]));
			default:
				break;
			}
		}
		
		return gt;
	}
	
	public String getNome() {
		return this.nome;
	}
}
