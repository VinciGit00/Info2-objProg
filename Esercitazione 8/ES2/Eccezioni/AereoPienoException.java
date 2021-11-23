package Eccezioni;

public class AereoPienoException extends Exception {

	public AereoPienoException() {
		super("Non ci sono più posti disponibili per questo aereo");
	}
}
