/*Ordina in base all'ordine int*/
public class Pesci implements Comparable<Pesci> {
	
	int id;
	String nome;

	public Pesci(int id, String nome) {
		this.nome=nome;
		this.id=id;
	}
	
	@Override
	public int compareTo(Pesci o) {
		return Double.compare(this.id, o.id);
	}
	
	public void stampa() {
		System.out.println("ID: "+this.id+" Nome: "+this.nome);
	}

}
  