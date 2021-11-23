package ProvaTemadesame;

public class Persona {
	private int eta;
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome, int eta) {
		this.eta=eta;
		this.cognome=cognome;
		this.nome=nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	@Override
	public String toString() {
		return "Cognome: "+this.cognome+", nome: "+this.nome+", eta: "+eta;
	}
}
