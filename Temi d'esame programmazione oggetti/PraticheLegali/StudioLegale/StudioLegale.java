package StudioLegale;

import java.util.ArrayList;
import java.util.Collections;

import ClassiEnum.Grado;
import ClassiEnum.Stati;
import Cliente.Cliente;
import Eccezioni.praticaPresenteException;
import Pratiche.Civile;
import Pratiche.Conciliazione;
import Pratiche.Penale;
import Pratiche.Pratiche;
import prog.io.FileInputManager;

public class StudioLegale {
	ArrayList<Pratiche> listapratiche;
	
	public StudioLegale() {
		listapratiche= new ArrayList<Pratiche>();
	}
	
	/**
	 * Aggiunge un elemento nella lista e in caso di errore lancia un'eccezione
	 * @param pratica
	 * @throws praticaPresenteException
	 */
	public void aggiungiPratica(Pratiche pratica) throws praticaPresenteException {
	
	if(listapratiche.contains(pratica)) 
		throw new praticaPresenteException();
	else {
		listapratiche.add(pratica);
	}
	}
	
	/**
	 * Stampa la lista normalmente
	 * @param listapratiche
	 */
	/*public void stampa1(ArrayList<E> listapratiche) {
		for(E pratica: listapratiche ) {
			System.out.println(pratica.toString());
		}
	}*/

	
	public void stampa1(ArrayList<Pratiche> listapratiche) {
		for(Pratiche pratica: listapratiche ) {
			System.out.println(pratica.toString());
		}
	}
	
	/**
	 * Ordina in base al prezzo della pratica tramite l'equals nella lista 
	 */
	public void stampa2() {
		Collections.sort(listapratiche);
		stampa1(listapratiche);
	}
	
	public void stampa3() {
		ArrayList<Pratiche> listatemp= new ArrayList<Pratiche>();
		
		for(Pratiche index: listatemp) {
			if(index.priorità==1000)
				listatemp.add(index);
		}
		
		boolean ordinato=true;
		
		do {
			ordinato= true;
			for(int i=0; i<=listatemp.size()-1; i++) {
				if(listatemp.get(i).Calcolacosto()>listatemp.get(i+1).Calcolacosto()) { //Compara con il successivo
					Collections.swap(listatemp, i, i+1); //Il Collections.swap scambia le due posizioni -> lo uso per  gli arrayList
					ordinato=false;
				}
			}	
			}while(!ordinato);
		stampa1(listatemp);
	}
	
	/**
	 * Lettura di un file
	 */
	public void leggiFile() {
		FileInputManager fin= new FileInputManager("Nomi.txt");
		while(true) {
			String line= fin.readLine();
			if(line==null) { //Bisogna mettere ==null
				break;
			}
			
			String [] temp= line.split(";");
			Cliente c= new Cliente(temp[1], temp[2], Integer.parseInt(temp[3]));
			switch(temp[0]) {
				case "Ci":
					listapratiche.add(new Civile(c, temp[4],temp[5], Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Stati.valueOf(temp[8]) ,Grado.PRIMO));
					break;
				case "Co":
					listapratiche.add(new Conciliazione(c, temp[4],temp[5], Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Stati.valueOf(temp[8])));
					break;
				case "P":
					listapratiche.add(new Penale(c, temp[4],temp[5], Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), Stati.valueOf(temp[8]) ,Grado.valueOf(temp[9])));
					break;
			}
		}
	}


}
