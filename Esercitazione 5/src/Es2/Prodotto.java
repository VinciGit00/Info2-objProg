package Es2;

public class Prodotto implements Comparable<Prodotto> {
	
	/*Campi*/
	private int ID;
	int quantita;
	private Double prezzounitario;
	
	/*Costruttori*/
	public Prodotto(int ID, int q, Double prezzounitario) {
		this.ID= ID;
		this.quantita=q;
		this.prezzounitario= prezzounitario;
	}
	
	public Prodotto(String p) throws SwitchException {
		String[] z= p.split(",");
		for(int i=0; i<p.length(); i++) {
			switch(i) {
			case 1:
				this.ID=Integer.parseInt(z[i]);
				break;
			case 2:
				this.quantita=Integer.parseInt(z[i]);;
				break;
			case 3:
				this.prezzounitario=Double.parseDouble(z[i]);
				break;
				default:
					throw new SwitchException(); //Classe delle eccezioni fatta da me
			}
		}
	}
	
	/*Metodi*/
	public int getID() {
		return this.ID;
	}
	
	public int getQuantita() {
		return this.quantita;
	}
	
	public Double getPrezzo() {
		return this.prezzounitario;
	}
	
	@Override
	public int compareTo(Prodotto o) {
		return Double.compare(this.ID, o.ID );
	}
	
	@Override
	public String toString() {
		return "ID del prodotto: "+this.ID+", quantità: "+this.quantita+", prezzo unitario: "+this.prezzounitario;
	}

	
}
