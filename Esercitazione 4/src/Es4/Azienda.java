package Es4;

import java.util.ArrayList;
import java.util.Collections;

public class Azienda {
	
	private String nome; 
	ArrayList <Dipendente> listadipendenti;
	
	public Azienda(String nome) {
		this.nome= nome;
		listadipendenti= new ArrayList<>();
	}

	public void aggiungidipendente(Dipendente dip) {
		if(!listadipendenti.contains(dip)) {
			listadipendenti.add(dip);
		}
		else 
			System.out.println("Nome già presente");
	}

	public void stampaDitta() {
		System.out.println("Nome della ditta: "+nome);
		System.out.println("Nomi dei dipendenti: "+nome);
		for(Dipendente index: listadipendenti) {
			System.out.println(index.toString());
		}
	
	}

	public void ordinaDitta() {
		Collections.sort(listadipendenti, new ComparatorByname());
	}
}
