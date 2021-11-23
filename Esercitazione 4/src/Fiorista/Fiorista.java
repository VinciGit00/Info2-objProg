package Fiorista;

import java.util.ArrayList;

public class Fiorista {
	String nome;
	ArrayList <Clienti> lclienti= new ArrayList();
	ArrayList <Fiori> lfiori= new ArrayList();
	
	public Fiorista(String nome) {
		this.nome= nome;
	}
		
	public void aggClienti(Clienti cl) {
		if(!lclienti.contains(cl)) 
			lclienti.add(cl);
		else
			System.out.println("Nome del cliente già presente ");
	}
	
	public void rimuoviClienti(Clienti cl) {
		if(lclienti.contains(cl)) 
			for(int i=0; i<lclienti.size(); i++) {
				Clienti temp= lclienti.get(i);
				if(temp.equals(cl)) {
					lclienti.remove(i);
				}
			}
		else
			System.out.println("Nome del cliente non esiste nella lista ");
	}
	
	public void aggiungipianta(Fiori p) {
		if(!lfiori.contains(lfiori))
			lfiori.add(p);
		else
			System.out.println("Nome della pianta già presente ");
	}
	
	public void rimuovipianta(Fiori p) {
		if(lfiori.contains(p)) 
			for(int i=0; i<lfiori.size(); i++) {
				Fiori temp= lfiori.get(i);
				if(temp.equals(p)) {
					lfiori.remove(i);
				}
			}
		else
			System.out.println("Nome della pianta non esiste nella lista ");
	}
	
	public void stampaFiore() {
		for(Fiori f: lfiori) {
			System.out.println(f.toString());
		}
	}
	
	public void stampaClienti() {
		for(Clienti c: lclienti) {
			System.out.println(c.toString());
		}
	}
	
	public void stampatutto() {
		System.out.println("Clienti: ");
		this.stampaClienti();
		System.out.println("Piante: ");
		this.stampaFiore();
	}
}
