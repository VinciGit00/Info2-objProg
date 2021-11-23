package Es5;

import java.util.ArrayList;

public class Negozio {
	
	public static int nprogressivo=0;
	
	private int ID;
	private String nome;
	
	public ArrayList<Prodotto> listaProdotti;
	
	public Negozio(String nome) {
		this.ID=++nprogressivo;
		this.nome=nome;
		listaProdotti= new ArrayList<Prodotto>();
	}
	
	public Negozio() {
		this("Anonimo");
	}

	public void aggiungiProdotto(Prodotto prod) {
		try {
			if(listaProdotti.contains(prod))
				throw new RuntimeException();
			else
				listaProdotti.add(prod);
		} catch (Exception e) {
			System.out.println("Prodotto già presente nella lista");
		}
	}
	
	public void rimuoviProdotto(Prodotto prod) throws prodottoAssenteException {
		if(!listaProdotti.contains(prod))
			throw new prodottoAssenteException();
		else {
			listaProdotti.remove(prod);
		}
	}
	
	public int getID() {
		return this.ID;
	}
	
	public String getNome() {
		return this.getNome();
	}
	
	@Override
	public String toString() {
		return "Nome del negozio: "+this.nome+" ID del negozio"+this.ID;
	}

}
