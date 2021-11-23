package Es3;

import java.util.ArrayList;

public class Reparti {
	public static int nprogressivo=0;
	
	String nome;
	String descrizione;
	ArrayList<Letto> lletti;
	ArrayList<Pazienti> lpazienti;
	char tipoStanza;
	
	public Reparti(String nome, String descrizione) {
		this.nome= nome;
		this.descrizione= descrizione;
		lletti= new ArrayList<>();
		lpazienti= new ArrayList<>();
	}
	
	public void aggiungiLetto(Letto a) {
		if(lletti.contains(a)) 
			throw new RuntimeException("Letto già presente");
		else
			nprogressivo++;
			if(nprogressivo%4==0)
				tipoStanza='M';
			else
				tipoStanza='F';
			lletti.add(a);
			
	}
	
	public void rimuoviLetto(Letto a) {
		if(!lletti.contains(a)) 
			throw new RuntimeException("Letto inesistente");
		else
			lletti.remove(a);
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+", descrizione"+descrizione+", letti: "+lletti+", pazienti:"+lpazienti;
	}
}
