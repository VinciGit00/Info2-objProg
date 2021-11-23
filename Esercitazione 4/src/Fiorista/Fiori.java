package Fiorista;

public class Fiori {
	
	private String nome;
	private int quantita;
	private double prezzo;
	
	
	public Fiori(String nome, int quantita, double prezzo) {
		this.nome= nome;
		this.quantita= quantita;
		this.prezzo= prezzo;
	}
	
	public Fiori(String nome, double prezzo) {
		this(nome, 1, prezzo);
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getQuantita() {
		return this.quantita;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}

	@Override
	public String toString() {
		return "Nome della pianta: "+this.nome+", quantità: "+this.quantita+", prezzo: "+this.prezzo;
	}

	public void aggiungiFiore(int quantità) {
		if(quantità>0)
		this.quantita+=quantità;
		else
			System.out.println("Numero inserito non valido ");
	}

	
}
