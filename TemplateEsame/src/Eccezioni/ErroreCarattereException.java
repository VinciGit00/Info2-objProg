package Eccezioni;

public class ErroreCarattereException extends RuntimeException {

	public ErroreCarattereException() {
		super("Errore nella scrittura del file ");
	}
}
