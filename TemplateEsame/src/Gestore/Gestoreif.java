package Gestore;

import Eccezioni.FileinesistenteException;

public interface Gestoreif {
	
	/**
	 * Lettura del file
	 * Il primo carattere identifica la classe da inserire
	 * @throws FileinesistenteException
	 */
	public void LeggiFile() throws FileinesistenteException;
	
	
}
