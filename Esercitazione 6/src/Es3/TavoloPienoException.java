package Es3;

public class TavoloPienoException extends Exception{ //Eccezione controllata
	
	TavoloPienoException() {
		super("Persona gi� seduta al tavolo");
	}
	
}
