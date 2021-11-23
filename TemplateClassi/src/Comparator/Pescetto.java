package Comparator;

import java.util.Comparator;

public class Pescetto {
	private String nome;
	
	public Pescetto(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	@Override
	public String toString() {
		return "Nome: "+this.getNome();
	}
}

/*Per il Comparator faccio una classe a parte*/
class ComparatorByName implements Comparator<Pescetto>{

	public int compare(Pescetto o1, Pescetto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}