package sfide;

import Eccezioni.OraNonValidaException;
import Enumerativi.Validità;

public class Pacifiche extends Sfidaab{

	public Pacifiche(String descrizione, float ora, String nome1, String nome2,  Validità v) throws OraNonValidaException {
		super(descrizione, ora, nome1, nome2, v);
	}

	@Override
	public float CalcolaPunteggio() {
		if(v.equals(Validità.AMICHEVOLE))
			return 10;
		else if(v.equals(Validità.CAMPIONATO))
			return 100;
	
		return -1;
	}

	@Override
	public String toString() {
		return null;
	}

}
