package EsercizioRiferimento;

public class TavoloPienoException extends Exception{ //Eccezione controllata
	
	TavoloPienoException() {
		super("Persona gi� seduta al tavolo");
	}
	
}
