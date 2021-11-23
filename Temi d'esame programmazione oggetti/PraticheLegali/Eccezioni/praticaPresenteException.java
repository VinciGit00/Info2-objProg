package Eccezioni;

public class praticaPresenteException extends Exception {

	public praticaPresenteException() {
		super("Targa già presente nella lista");
	}
}
