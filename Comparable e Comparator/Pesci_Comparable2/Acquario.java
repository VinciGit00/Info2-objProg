import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Acquario {
	ArrayList <Pesciolini> Acquario= new ArrayList();
	String nome;
	Acquario(String nome) {
		this.nome= nome;
	}
	
	public void add(Pesciolini p) {
		Acquario.add(p);
	}
	
	/*Ordina il contenuto della lista, non la lista*/
	public void ordina() {
		Collections.sort(Acquario);
	}
	
	public void stampa() {
		for(Pesciolini indice: Acquario) {
			System.out.println(indice.toString());
		}
	}

}
