package Es4;

import java.util.ArrayList;

import Es3.Persona;

public class Volo {
	
	public static int nprogressivo=0;
	
	private int ID;
	private String partenza;
	private String Arrivo;
	private int postidisponibiliprima;
	private int postidisponibilieconomy;
	
	ArrayList<Passeggero> listaPersone;
	
	public Volo(int ID, String partenza, String Arrivo, int postidisponibiliprima, int postidisponibilieconomy) {
		this.ID=ID;
		this.partenza=partenza;
		this.Arrivo=Arrivo;
		this.postidisponibiliprima=postidisponibiliprima;
		this.postidisponibilieconomy=postidisponibilieconomy;
		listaPersone= new ArrayList<>();
	}
	
	public Volo(String partenza, String Arrivo, int postidisponibiliprima, int postidisponibilieconomy) {
		this(++nprogressivo, partenza, Arrivo, postidisponibiliprima, postidisponibilieconomy);
	}
	
	//Aggiungere aggiungi o rimuovi persona
	public void aggiungiPasseggero(Passeggero pass) {
		try {
			if(listaPersone.contains(pass))
				throw new RuntimeException();
			else {
				 String val= pass.getclasse();
				 if(val.equals("F") && this.postidisponibilieconomy>0) {
					 listaPersone.add(pass);
					 this.postidisponibilieconomy--;
				 }
				 else if(val.equals("E") && this.postidisponibiliprima>0) {
					 this.postidisponibiliprima--;
					 listaPersone.add(pass);
				 }
				 
				 if(postidisponibilieconomy<=0)
					 throw new postidisponibilieconomyException();
				 else if(postidisponibiliprima<=0)
					 throw new postiliberifirstException();
			}
				
		} catch (RuntimeException e) {
			System.out.println("Passeggero già contenuto nella lista");
		} catch (postidisponibilieconomyException e) {
			e.printStackTrace();
		}
	}
	
	public void rimuoviPersone(Passeggero pass) {
		try {
			if(!listaPersone.contains(pass)) {
				throw new RuntimeException();
			}
			
			else {
				String val=pass.getclasse();
				if(val.equals("F")) {
					 this.postidisponibilieconomy++;
				 }
				 else if(val.equals("E") ) {
					 this.postidisponibiliprima++;
				 }
				listaPersone.remove(pass);
				
			}
		} catch (RuntimeException e) {
			System.out.println("Nome non presente nella lista");
		}
	}
	
	public void stampaPersone() {
		System.out.println("lista delle persone: ");
		for(Passeggero singola: listaPersone) {
			System.out.println(singola.toString());
		}
	}
	
}
