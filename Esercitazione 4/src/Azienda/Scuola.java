package Azienda;

import java.util.ArrayList;
import java.util.Collections;

public class Scuola {
	
	private String nomescuola;
	private ArrayList <Stud> insiStud;
	
	public Scuola(String nomescuola) {
		this.nomescuola= nomescuola;
		insiStud= new ArrayList<>();
	}
	
	public void  addStudenti(Stud nome) {
		if(insiStud.contains(nome))
			System.out.println("Studente già presente");
		else 
			insiStud.add(nome);
	}

	public void rimuoviStudenti(Stud nome) {
		if(!insiStud.contains(nome))
			System.out.println("Alunno non presente");
		else
			for(int i=0; i<insiStud.size(); i++) {
				Stud temp= insiStud.get(i);
				if(temp.equals(nome))
					insiStud.remove(i);
			}
	}

	public void stampaStudenti() {
		System.out.println("Nome dell'istituto: "+nomescuola);
		System.out.println("Elenco degli studenti: ");
		for(Stud s: insiStud) {
			System.out.println(s.toString());
		}
	}

	public void ordinaStudenti() {
		Collections.sort(insiStud, new comparatorByName());
	}
}
