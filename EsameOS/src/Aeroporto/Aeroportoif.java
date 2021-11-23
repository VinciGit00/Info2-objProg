package Aeroporto;

public interface Aeroportoif {
	
	/**
	 * Richiesta di atterraggio del'aereo
	 * @param idaeromobile
	 */
	public void richiestaAtterraggio(String idaeromobile);
	
	/**
	 * Uscita dell'aeromobile dall'aeroporto
	 */
	public void liberaPista();
}
