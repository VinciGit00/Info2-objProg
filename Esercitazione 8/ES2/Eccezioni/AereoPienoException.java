package Eccezioni;

public class AereoPienoException extends Exception {

	public AereoPienoException() {
		super("Non ci sono pi� posti disponibili per questo aereo");
	}
}
