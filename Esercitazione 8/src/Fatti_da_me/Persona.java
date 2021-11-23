package Fatti_da_me;

public class Persona {
	private String nome;
	private	String cognome;
	private Integer eta;
	public Persona( String nome, String cognome, int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+", Cognome: "+this.cognome+", età: "+this.eta;
	};
}
