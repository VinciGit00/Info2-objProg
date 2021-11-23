package EsercizioRiferimento;

public class TavoloPienoException extends Exception{ //Eccezione controllata
	
	TavoloPienoException() {
		super("Persona già seduta al tavolo");
	}
	
}
