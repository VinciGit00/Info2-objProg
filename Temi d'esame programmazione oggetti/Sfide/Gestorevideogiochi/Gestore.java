package Gestorevideogiochi;

import java.util.ArrayList;

import Eccezioni.sfidaCorrettaException;
import sfide.Sfidaab;

public class Gestore {

	ArrayList<Sfidaab> lista;
	
	public Gestore() {
		 lista= new ArrayList<Sfidaab>();
	}
	
	public void inserimento(Sfidaab sfida) throws sfidaCorrettaException {
		if(lista.contains(sfida)) {
			throw new sfidaCorrettaException();
		}
		else {
			lista.add(sfida);
		}
	}
	
}
