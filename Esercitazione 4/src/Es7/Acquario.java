package Es7;
import java.util.ArrayList;

public class Acquario {
	String nome;
	ArrayList <Vasca> nvasche;
	
	
	public Acquario(String nome){
		this.nome= nome;
		
	}
	
	public void addVasca(Vasca v) {
		nvasche.add(v);
		nvasche= new ArrayList<>();
	}
	
	public void stampaVasche() {
		for(Vasca v: nvasche) {
			System.out.println("Nome della vasca: "+v.getNome());
			v.stampaPesci();
		}
	}
	
	@Override
	public String toString() {
		String result=" ";
		for(Vasca v: nvasche) {
			result+=v.toString();
		}
		return result;
	}
}
