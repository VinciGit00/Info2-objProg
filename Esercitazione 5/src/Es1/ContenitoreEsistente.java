package Es1;

public class ContenitoreEsistente extends RuntimeException {
	public ContenitoreEsistente () {
		super("Passeggero già presente");
	}
}
