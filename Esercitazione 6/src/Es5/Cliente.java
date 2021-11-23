package Es5;

import java.util.ArrayList;

public class Cliente {

	private int nprogressivo=0;
	
	private String nome;
	private String cognome;
	private int ID;
	
	private ArrayList<Prodotto> listadellaSpesa;
	
	public  Cliente(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
		this.ID=++nprogressivo;
		listadellaSpesa= new ArrayList<Prodotto>();
		
	}
	
	public  Cliente(String parola) {
		String temp[]= parola.split(",");
		this.nome=temp[0];
		this.cognome=temp[1];
		this.ID=++nprogressivo;
		listadellaSpesa= new ArrayList<Prodotto>();
	}

	public void aggiungialCarrello(Negozio neg, int ID, int quantita, double prezzo){
		
		boolean flag=false;
		try {
			for(int i=0; i<neg.listaProdotti.size(); i++) {
				if(neg.listaProdotti.get(i).getID()==ID) {
					if( neg.listaProdotti.get(i).getQuantita()>=quantita) {
						
						neg.listaProdotti.get(i).quantita-=quantita;
					}
					if( neg.listaProdotti.get(i).getQuantita()<quantita) {
						throw new ProdottobassoException();
					}
					flag=true;
				}
				
				
			}
		} catch (ProdottobassoException e) {
			System.out.println("Eccezione riscontrata");
		}
		
		if(flag==true) {
			
			boolean flag2=false;
			for(int i=0; i<listadellaSpesa.size(); i++) {
				if(listadellaSpesa.get(i).getID()==ID) {
					flag=true;
					listadellaSpesa.get(i).quantita+=quantita;
				}
			}
			
			if(flag2==false) {
				listadellaSpesa.add(new Prodotto(ID, quantita, prezzo));
			}
		}
		
		else {
			try {
				throw new RuntimeException();
			} catch (RuntimeException e) {
				System.out.println("prodotto non presente nella lista");
			}
		}
	}
	
	public void rimuovidalCarrello(Negozio neg, int ID, int quantita, double prezzo) {
		boolean flag=false;
		for(int i=0; i<listadellaSpesa.size(); i++) {
			if(listadellaSpesa.get(i).getID()==ID ) {
				
				if(listadellaSpesa.get(i).getQuantita()>=quantita) {
					listadellaSpesa.get(i).quantita-=quantita;
				}
				
				else if(listadellaSpesa.get(i).getQuantita()<quantita) {
					throw new ProdottobassoException();
				}
				
				flag=true;
				
			}
			
			if(flag==true) {
				boolean flag2=false;
				
				for(int i1=0; i1<neg.listaProdotti.size(); i1++) {
					if(neg.listaProdotti.get(i1).getID()==ID) {
						flag=true;
						neg.listaProdotti.get(i1).quantita+=quantita;
					}
				}
				
				if(flag2==false) {
					neg.listaProdotti.add(new Prodotto(ID, quantita, prezzo));
				}
				
			}
			
			
			else {
				try {
					throw new RuntimeException();
				} catch (RuntimeException e) {
					System.out.println("Prodotto non presente nella carrello della spesa");
				}
			}
			
		}
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public int getID() {
		return this.ID;
	}
	
 	public String toString() {
		return "Nome del cliente: "+this.nome+", cognome: "+this.cognome+" ID: "+this.ID;
	}
}

