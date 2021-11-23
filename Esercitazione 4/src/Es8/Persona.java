package Es8;

import java.util.Comparator;

public class Persona {
	private String nome; 
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome= nome;
		this.cognome= cognome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+" Cognome: "+this.cognome;
	}

}

class ComparatorByName implements Comparator <Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getCognome().compareTo(o2.getCognome());
	}
	
}