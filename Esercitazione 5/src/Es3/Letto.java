package Es3;

public class Letto {
	public static int nprogressivo=0;
	enum stato{L, O}
	
	int n;
	int numerodistanza; //è la stanza
	stato s;
	
	public Letto(int numerodistanza, stato s) {
		this.n= ++nprogressivo;
		this.numerodistanza=numerodistanza;
		this.s=s;
	}

	@Override
	public String toString() {
		return "Numero di letto: "+n+", numero di stanza: "+numerodistanza+", stato: "+s;
	}

}
