package Prova;

import ClassiEnum.Grado;
import ClassiEnum.Stati;
import Cliente.Cliente;
import Eccezioni.praticaPresenteException;
import Pratiche.Civile;
import Pratiche.Conciliazione;
import Pratiche.Penale;
import StudioLegale.StudioLegale;

public class Prova {

	public static void main(String[] args) {

		//Creazione di un nuovo cliente
		Cliente c= new Cliente("Franco", "Ranghetti",20);
		
		//Creazione di tutte le pratiche
		Conciliazione con1= new Conciliazione(c, "boh", "010600", 40, 10, Stati.ARCHIVIATA);
		Penale con2= new Penale(c, "boh", "010600", 50, 10, Stati.ARCHIVIATA, Grado.APPELLO);
		Civile con3= new Civile(c, "bog", "010600", 60, 50, Stati.CHIUSA, Grado.APPELLO);
		
		//Creazione di un nuovo studio legale
		StudioLegale g= new StudioLegale();
		
		//lettura da file
		g.leggiFile();
		
		//Aggiunta da lista
		try {
			g.aggiungiPratica(con1);
			g.aggiungiPratica(con2);
			g.aggiungiPratica(con3);
		} catch (praticaPresenteException e) {
			e.printStackTrace();
		}
		
		//Stampa in ordine di reddito
		g.stampa2();
	}

}
