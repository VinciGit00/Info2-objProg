package sfide;

import Eccezioni.OraNonValidaException;
import Enumerativi.Validità;
import prog.utili.Data;

public abstract class Sfidaab {

	protected String descrizione;
	protected float ora;
	private String nome1;
	private String nome2;
	protected Validità v;
	
	
	public Sfidaab(String descrizione, float ora, String nome1, String nome2, Validità v ) throws OraNonValidaException {
		if(ora>24||ora<7)
			throw new OraNonValidaException();
		else {
			this.descrizione=descrizione;
			this.ora=ora;
			this.nome1=nome1;
			this.nome2=nome2;
			this.v=v;
		}
	}
	
	public abstract float CalcolaPunteggio();
	
	public abstract String toString();
	
	@Override //Override dell'equals
	public boolean equals (Object obj) { //Il comparator non sostituisce l'equals
		if(obj instanceof Sfidaab) {
			 return this.descrizione.equals(((Sfidaab)obj).descrizione);
		}
		else
			return false;
	}
}

