import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Countrymain {

	public static void main(String[] args) {
		ArrayList<Country>count= new ArrayList();
		
		/*inserimento nella lista*/
		count.add(new Country("Belgio", 77000));//Metto direttamente il new dentro l'add
		count.add(new Country("Svizzera", 41000));
		count.add(new Country("Uruguay", 440000));
		
		System.out.println("Arraylist non ordinato: ");
		for(Country conta: count) {
			System.out.println(conta.getString()+" "+conta.getArea());
		}
		
		/*Adesso ordina in base all'estensionee non in base all'ordine alfabetico*/
		Collections.sort(count);
		
		System.out.println("");
		System.out.println("Arraylist ordinato: ");
		for(Country conta: count) {
			System.out.println(conta.getString()+" "+conta.getArea());
		}
	}

}
