package Es6;
import java.util.Arrays;

public class AutomobileProva {

	public static void main(String[] args) {

		Double v= 9000.0;
		Automobile a= new Automobile(900.);
		Automobile b= new Automobile(9007.0);
		Automobile c= new Automobile(906.0);
		/*Array di automobili*/
		Automobile []garage= {a,b,c};
		
		/*Scrittura*/
		System.out.println(Arrays.toString(garage));
		
		/*Ordina l'array in base al numero di km*/
		Arrays.parallelSort(garage); //IMPORTANTE
		System.out.println(Arrays.toString(garage));
	}

}
