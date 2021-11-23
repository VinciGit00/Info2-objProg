package Es8;
import java.util.ArrayList;

public class Ristorante {

	private String nome;
	ArrayList <Tavolo> tavoli;
	
	public Ristorante(String nome) {
		this.nome= nome;
		tavoli= new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
}
