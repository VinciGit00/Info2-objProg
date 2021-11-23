package sfide;

import Eccezioni.OraNonValidaException;
import Eccezioni.punteggioSbagliatoException;
import Enumerativi.Validit�;

public class Competizione extends Sfidaab {

	private int punteggio;
	
	public Competizione(String descrizione, float ora, String nome1, String nome2, int punteggio, Validit� v) throws OraNonValidaException, punteggioSbagliatoException {
		super(descrizione, ora, nome1, nome2, v);
	
		if(punteggio>10|| punteggio<1)
			throw new punteggioSbagliatoException();
		this.punteggio=punteggio;

	}

	@Override
	public float CalcolaPunteggio() {
		return this.punteggio*50000;
	}

	@Override
	public String toString() {
		return "Descrione: ";
	}

}
