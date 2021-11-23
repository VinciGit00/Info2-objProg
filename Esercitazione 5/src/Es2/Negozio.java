package Es2;

import java.util.ArrayList;

public class Negozio {
	/*Campi*/
	private static int num=0;
	private int numero;
	private String nome;
	public ArrayList <Prodotto> lprod;
	
	/*Costruttori della classe*/
	public Negozio(String nome) {
		this.nome=nome;
		this.numero=++num;
		lprod= new ArrayList<>();
	}
	
	public Negozio() {
		this("Anonimo ");
	}
	
	/*Metodi della classe*/
	public void aggiungiProd(Prodotto p) {
		if(lprod.contains(p))  {
			for(int i=0; i<lprod.size(); i++) {
				if(p.equals(lprod.get(i))) {
					lprod.get(i).quantita+=p.quantita;
				}
			}
		}
		
		else
			lprod.add(p);
	}
	
	public void minus(Prodotto p) {
		for(int i=0; i< lprod.size(); i++) {
			if(lprod.get(i).getID()==p.getID()) {
				 lprod.get(i).quantita-=p.quantita;
			}
		}

	}
	
	public void rimuoviProd1(Prodotto p) {
		if(lprod.contains(p))
			lprod.remove(p);
		else
			throw new RuntimeException("prodotto inserito inesistente");
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void stampaRimanenze() {
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
		System.out.println("Rimanenze del negozio: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
		for(Prodotto index: lprod) {
			System.out.println(index.toString());
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------- ");
	}
	
	@Override
	public String toString() {
		return "ID negozio: "+this.numero+", nome del negozio: "+this.nome+lprod;
	}
}
