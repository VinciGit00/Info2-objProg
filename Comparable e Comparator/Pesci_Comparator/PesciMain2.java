import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PesciMain2 {
	
	public static void main(String[] args) {
		ArrayList <Pesci2> pesci= new ArrayList();
		pesci.add(new Pesci2("a", "b"));
		pesci.add(new Pesci2("b", "b"));	
		pesci.add(new Pesci2("c", "b"));
		
		for(Pesci2 p: pesci) {
			p.stampa();
		} 
		//Collections.sort(pesci, new Pesci2());
	
	}
}
