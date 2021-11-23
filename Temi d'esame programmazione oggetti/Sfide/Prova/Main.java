package Prova;

import Eccezioni.OraNonValidaException;
import Eccezioni.sfidaCorrettaException;
import Enumerativi.Validità;
import Gestorevideogiochi.Gestore;
import sfide.Pacifiche;

public class Main {

	public static void main(String[] args) throws OraNonValidaException {
		
		Gestore g= new Gestore();
		
		Pacifiche p= new Pacifiche("boh", 12, "marco", "franco", Validità.AMICHEVOLE);
		
		try {
			g.inserimento(p);
			g.inserimento(p);
		} catch (sfidaCorrettaException e) {
			e.printStackTrace();
		}
		
		
	}

}
