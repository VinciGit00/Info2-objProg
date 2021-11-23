package Es5;

public class ProdottobassoException extends RuntimeException {

	public ProdottobassoException() {
		super("Quantità che si vuole prelevare superiore a quella presente nel listino ");
	}
}
