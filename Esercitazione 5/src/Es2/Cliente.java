package Es2;

import java.util.ArrayList;
import java.util.Collections;

public class Cliente {
	
	public static int cont=0;
	
	/*Campi*/
	String nome;
	String cognome;
	int IDcliente;
	ArrayList<Prodotto> carrello;
	
	/*Costruttori*/
	public Cliente(String nome, String cognome, int IDcliente) {
		this.nome=nome;
		this.cognome=cognome;
		this.IDcliente= IDcliente;
		carrello= new ArrayList<>();
	}
	
	public Cliente(String nome, String cognome) {
		this(nome, cognome, ++cont);
	}
	
	public Cliente() {
		this("Ignoto", "Ignoto", ++cont);
	}
	
	/*Metodi della classe*/
	public void aggiungiAlCarrello(Prodotto p, Negozio n) {

		boolean flag=true;
		for(int i=0; i<n.lprod.size(); i++) {
			if(p.getID()==n.lprod.get(i).getID()) {
				if(n.lprod.get(i).quantita>= p.quantita) {
					carrello.add(p);
					flag=false;
					n.minus(p);
				}
					else
						throw new RuntimeException("Quantità che si cerca di prelevare superiore alla presente");
			}
		}
		
		if(flag)
			throw new RuntimeException("Prodotto che si cerca non presente nel supermercato ");
	}
	
	public void rimuoviDalCarrello(Prodotto p, Negozio n) { //Questo da rifare da capo
		
		boolean flag= true;
		
		for(int i=0; i<n.lprod.size(); i++) {
			if(p.getID()==n.lprod.get(i).getID()) {
					carrello.remove(p);
					n.lprod.get(i).quantita+=p.quantita;
					flag=false;
			}
		}
		
		if(flag) 
			throw new RuntimeException("Quantità che si cerca di prelevare superiore alla presente in negozio");
	}
	
	public Double stampaScontrino() {
		Double somma=0.0;
		for(int i=0; i<carrello.size(); i++) {
			somma+=carrello.get(i).getPrezzo()*carrello.get(i).quantita;
		}
		return somma;
	}
	
	public void ordina() {
		Collections.sort(carrello);
	}
	
	public void stampaCarrello() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
		System.out.println("Scontrino del carrello: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
		for(Prodotto index: carrello) {
			System.out.println(index.toString());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
	}
}
