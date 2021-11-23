package Es7;
import java.util.ArrayList;

public class Vasca {
	private String nome;
	private ArrayList<Pesce> vasca;
	
	/*Costruttore della vasca*/
	public Vasca(String nome) {
		this.nome= nome;//I nomi dei pesci li aggiungo in seguito
		vasca= new ArrayList<>();
	}
	
	public void aggiungiPesce(Pesce o) {
		if(vasca.contains(o))//IMPORTANTE
			System.out.println("Nome già presente all'interno della lista");
		else
			vasca.add(o);
	}
	
	public void eliminaPesce(String nome) {
		for(int i=0; i<vasca.size(); i++) {
			if(vasca.get(i).getid().equalsIgnoreCase(nome))
				vasca.remove(i);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void stampaPesci() {
		for(Pesce e: vasca) {
			System.out.print(e+"|");
		}
		System.out.println(" ");
	}
	
	@Override
	public String toString() {
		String r="Vasca "+nome;
		for(Pesce e: vasca) {
			r+=e.toString();
		}
		return r;
	}

}
