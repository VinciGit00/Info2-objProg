package Cliente;

public class Cliente {

	private String nome;
	private String cognome;
	private int eta;
	
	
	public Cliente(String nome, String cognome, int eta) {
			this.nome=nome;
			this.cognome=cognome;
			this.eta=eta;
	}
	
	@Override
	public String toString() {
		return "Nome:"+this.nome+" cognome: "+this.cognome;
	}
}
