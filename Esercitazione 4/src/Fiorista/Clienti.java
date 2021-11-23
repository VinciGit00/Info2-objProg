package Fiorista;

public class Clienti {
	private String nome;
	private String cognome;
	private int eta;
	
	public Clienti(String cognome, String nome, int eta) {
		this.cognome= cognome;
		this.nome= nome;
		this.eta= eta;
	}
	
	public Clienti(String nome, String cognome) {
		this( nome,  cognome, 35);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	@Override
	public String toString() {
		return "Cognome del cliente: "+this.cognome+", nome: "+this.nome+" età: "+this.eta;
	}
}
