package Es3;

import java.util.ArrayList;

import javax.management.RuntimeErrorException;

import Es1.Passeggero;

public class Pazienti {
	enum genere {M,F}
	
	String nome;
	String cognome;
	String datanascita;
	String CF;
	genere gen;
	ArrayList <Medicine> lmed;
	 
	public Pazienti(String nome, String cognome, String datanascita, String CF, genere gen) {
		this.nome=nome;
		this.cognome=cognome;
		this.datanascita=datanascita;
		this.CF=CF;
		this.gen=gen;
		ArrayList <Medicine> lmed= new ArrayList<>();
	}
	
	public void aggiungiMedicine(Medicine m) {
		if(lmed.contains(m))
			throw new RuntimeException("Medicina già presente"); 
		else
			lmed.add(m);
	}
	
	public void rimuoviMedicine(Medicine m) {
		if(!lmed.contains(m))
			throw new RuntimeException("Il paziente non prende quella medicina"); 
		else
			lmed.remove(m);
	}
	
	@Override
	public String toString() {
		return "Nome"+this.nome+", cognome:"+this.cognome+", data di nascita: "+this.datanascita+" ,CF: "+this.CF+", genere: "+this.gen+", medicine "+lmed;
	}
}
