import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class PesciMain {

	public static void main(String[] args) {
		
		ArrayList<Pesci> pesci= new ArrayList();
		pesci.add(new Pesci(5, "Nemo"));
		pesci.add(new Pesci(2, "Dory"));
		pesci.add(new Pesci(8, "Squiddy"));
		System.out.println("Sequenza non ordinata: ");
		
		for(Pesci j: pesci) {
			j.stampa();
		}
		
		Collections.sort(pesci);
		System.out.println("------------------------");
		System.out.println("Sequenza ordinata:");
		for(Pesci j: pesci) {
			j.stampa();
		}
	}

}
