package Es8;

import java.util.Comparator;

public class Piatto {
	private String id;
	private int quantita;
	private Double prezzo;
	
	public Piatto(String id, int quantita, Double prezzo) {
		this.id= id;
		this.quantita= quantita;
		this.prezzo= prezzo;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Double getPrezzo() {
		return this.prezzo;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.id+" Quantità: "+this.quantita+" Prezzo: "+this.prezzo;
	}
	
}

class comparatorByName2 implements Comparator <Piatto> {
	@Override
	public int compare(Piatto o1, Piatto o2) {
		return Double.compare(o1.getPrezzo(), o2.getPrezzo());
	}

}

