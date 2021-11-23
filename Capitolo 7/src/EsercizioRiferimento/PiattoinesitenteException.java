package EsercizioRiferimento;

public class PiattoinesitenteException extends RuntimeException {

	public PiattoinesitenteException() {
		super("Piatto non esistente");
	}
}
