package Es3;
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
	int capienza;
	ArrayList<Persona> clienti;
	ArrayList<Piatto> piatti;
	
	public Tavolo(String nome, int capienza) {
		this.nometavolo= nome;
		piatti= new ArrayList<>();
		clienti= new ArrayList<>();
		this.capienza=capienza;
	}
	
	public void aggiungiPersona(Persona p) throws TavoloPienoException { //Siccome è controllata devo dichiararla nel metodo
		try { //IMPORTANTE
			if(clienti.contains(p)) { //Devo implementare l'equals nella classe
				throw new TavoloPienoException(); //Eccezione controllata
			}
			else {
				if(capienza>0) {
					clienti.add(p);
					capienza--;
				}
				else
					throw new RuntimeException("Capienza del tavolo esaurita");
			}
		} catch (RuntimeException e) { //Solo con RuntimeException metto questo e con le eccezioni controllate

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
	
	public void aggiungiPiatto(Piatto p) throws piattoesistenteException {
		
			if(p==null)
				//throw new Exception(); //eccezione controllata
				//throw new RuntimeException("p non può essere null"); //Eccezione non controllata
				throw new PiattoIDSbagliatoException();
			piatti.add(p);
			if(piatti.contains(p)) {
				throw new piattoesistenteException();
			}
	
	}
	
	public void rimuoviPiatto(Piatto nomepiatto) { //Mettere l'id del piatto
		try {
			if(piatti.contains(nomepiatto)) {  //Bisogna implementare l'equals con il contains
				for(int i=0; i<piatti.size(); i++) {
					String idtemp= piatti.get(i).getId();
					if(idtemp.equalsIgnoreCase(nomepiatto.getId()))
						piatti.remove(i);//remove direttamente
				}
			}
			
			else
				throw new PiattoinesitenteException(); //Eccezione non controllata necessita di un try catch
		} catch (PiattoinesitenteException e) {
			// TODO: handle exception
		}
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
		try {
			float cmedio=(calcolatotale()/persone);
			return cmedio;
		} catch (ArithmeticException e) {
			throw new RuntimeException("Calcolo non possibile");
		}
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
