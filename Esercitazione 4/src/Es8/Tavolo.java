package Es8;
import java.util.ArrayList;
import java.util.Collections;

/*Costruttore delle eccezioni*/
class PiattoIDSbagliatoException extends RuntimeException { //Eccezione non controllata perchè estende RuntimeException
	
	 PiattoIDSbagliatoException() {
		super("Piatto già esistente");
	}
}

public class Tavolo {
	String nometavolo;
	ArrayList<Persona> clienti;
	ArrayList<Piatto> piatti;
	
	public Tavolo(String nome) {
		this.nometavolo= nome;
		piatti= new ArrayList<>();
		clienti= new ArrayList<>();
	}
	
	public void aggiungiPersona(Persona p) throws TavoloPienoException {
		if(clienti.contains(p)) { //IMPORTANTE
			throw new TavoloPienoException(); //Eccezione controllata
		}
		else {
			clienti.add(p);
		}
}
	
	public void rimuoviPersona(String nome, String cognome) {
		for(int i=0; i<clienti.size(); i++) {
			String nometemp=clienti.get(i).getNome();
			String cognometemp=clienti.get(i).getCognome();
			if(nometemp.equalsIgnoreCase(nome)&&cognometemp.equalsIgnoreCase(cognome)) {
				clienti.remove(i);
			}

		}
	}
	
	public void aggiungiPiatto(Piatto p) {
		if(p==null)
			//throw new Exception(); //eccezione controllata
			//throw new RuntimeException("p non può essere null"); //Eccezione non controllata
			throw new PiattoIDSbagliatoException();
		piatti.add(p);
	}
	
	public void rimuoviPiatto(Piatto nomepiatto) { //Mettere l'id del piatto
		if(piatti.contains(nomepiatto)) { //remove direttamente
			for(int i=0; i<piatti.size(); i++) {
				String idtemp= piatti.get(i).getId();
				if(idtemp.equalsIgnoreCase(nomepiatto.getId()))
					piatti.remove(i);
			}
		}
		
		else
			System.out.println("Piatto non trovato");
	}
	
	public void ordinaTavoli() {
		Collections.sort(clienti, new ComparatorByName());
	}
	
	public float calcolatotale(){
		float contofinale=0;
		for(Piatto p: piatti) {
			contofinale+=p.getPrezzo();
		}
		return contofinale;
	}
	
	public float contomedio() {
		int persone=0;
		float contofinale=0;
		for(Persona p: clienti) 
			persone++;
		float cmedio=(calcolatotale()/persone);
		return cmedio;
	}

	public void stampaPersone() {
		System.out.println("Lista clienti:");
		for(Persona indice: clienti)
			System.out.println(indice.toString());
	}
	
	public void stampaPiatti() {
		System.out.println("Lista piatti:");
		for(Piatto indice: piatti)
			System.out.println(indice.toString());
	}
	
	public void stampaTutto() { //da  mettere Overload dei costruttori e ID
		System.out.println("Tavolo: "+nometavolo);
		this.stampaPersone();
		System.out.println("");
		this.stampaPiatti();
	}
	
	@Override
	public String toString() {
		return "Persone"+clienti;
	}
}
