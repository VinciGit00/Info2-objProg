import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {

	public static void main(String[] args) {
			ArrayList<Countri> ci= new ArrayList();
			ci.add(new Countri("Marconia", 50.0));
			ci.add(new Countri("Amazzonia", 50.0));
			ci.add(new Countri("Terronia", 50.0));
			ci.add(new Countri("Guasconia", 50.0));
			
			System.out.println("Prima della modifica: ");
			stampa(ci);
			Collections.sort(ci, new comparator()); //IMPORTANTE
			System.out.println("---------------------------- ");
			System.out.println("Dopo la modifica: ");
			stampa(ci);
	}
	
	public static void stampa(ArrayList<Countri> list) {
		for(Countri indice: list) {
			indice.stampacountri();
		}
	}

}
