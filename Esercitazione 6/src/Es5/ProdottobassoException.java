package Es5;

public class ProdottobassoException extends RuntimeException {

	public ProdottobassoException() {
		super("Quantit� che si vuole prelevare superiore a quella presente nel listino ");
	}
}
