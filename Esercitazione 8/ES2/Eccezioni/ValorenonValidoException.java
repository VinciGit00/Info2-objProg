package Eccezioni;

public class ValorenonValidoException extends Exception {
	public ValorenonValidoException() {
		super("Valore nel file non valido");
	}
}
