package Es5;

import Es4.Passeggero;

public class Prodotto {
	
	private static int nprogressivo=0;
	
	private int ID;
	public int quantita;
	private float prezzounitario;
	
	public Prodotto(int ID, int quantita, double d) {
		this.ID=ID;
		this.quantita= quantita;
		this.prezzounitario=(float) d;
	}
	
	
	public Prodotto(int quantita, double d) {
		this(++nprogressivo, quantita, d);
	}
	
	public Prodotto(float prezzounitario) {
		this(++nprogressivo,10,prezzounitario);
	}
	
	public Prodotto() {
		this(++nprogressivo,10, 10);
	}
	
	public int getID() {
		return this.ID;
	}
	
	public int getQuantita() {
		return this.quantita;
	}
	
	public float getPrezzounitario() {
		return this.prezzounitario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Prodotto) {
			if(this.ID==(((Prodotto) obj).ID))
				return true;
			else
				return false;
			
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.ID+" quantità: "+this.quantita+" prezzo unitario: "+this.prezzounitario;
	}
}
