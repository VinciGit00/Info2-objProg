package sfide;

import Eccezioni.OraNonValidaException;
import Enumerativi.Validità;

public class Normali extends Sfidaab {

	private String luogo;
	
	public Normali(String descrizione, float ora, String nome1, String nome2, Validità v, String luogo) throws OraNonValidaException {
		super(descrizione, ora, nome1, nome2, v);
		this.luogo=luogo;
	}

	@Override
	public float CalcolaPunteggio() {
		if(this.ora<12) 
			return 200;
		else 
			return 300;
	}

	@Override
	public String toString() {
		return null;
	}

}
