package Eccezioni;

public class FileinesistenteException extends Exception {
	public FileinesistenteException() {
		super("File inesistente");
	}
}
