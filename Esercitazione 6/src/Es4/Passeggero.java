package Es4;

public class Passeggero {

	public static int nprogressivo=0;
	
	
	private int IDBiglietto;
	private String nome;
	private String cognome;
	private double prezzobiglietto;
	private String c;

	public Passeggero(int IDBiglietto, String nome, String cognome, double d, String c) {
		this.IDBiglietto=IDBiglietto;
		this.nome=nome;
		this.cognome=cognome;
		this.prezzobiglietto=d;
		this.c=c;
	}

	public Passeggero(String nome, String cognome, double d, String c) {
		this(++nprogressivo, nome, cognome, d, c );
	}
	
	public Passeggero(float prezzobiglietto, String c) {
		this(++nprogressivo, "ANONIMO", "ANONIMO", prezzobiglietto, c );
	}
	
	public Passeggero(String c) {
		this(++nprogressivo, "ANONIMO", "ANONIMO", (float)500.0, c );
	}

	public String getNome() {
		return this.nome;
	}
		
	public String getcognome() {
		return this.cognome;
	}
	
	public double getPrezzobiglietto() {
		return this.prezzobiglietto;
	}
	
	public String getclasse() {
		return this.c;
	}
	
	@Override
	public String toString() {
		return "ID: "+this.IDBiglietto+" nome: "+this.nome+" cognome: "+this.cognome+" prezzo: "+this.prezzobiglietto+" classe: "+this.c;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Passeggero)
			return this.nome.equals(((Passeggero) obj).nome) && this.cognome.equals(((Passeggero) obj).cognome);
		
		return false;
	}
}
