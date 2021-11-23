import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//Array di interi e vogliamo ordinarlo
public class BubbleSorter {
//Per scomprire quando fermarsi usiamo un flag
	
	
		
public static void sort(int []n) {
	boolean ordinato=true; //Inizializzata inizialmente a true
	do {
		ordinato= true;
		for(int i=0; i<n.length-1; i++) {
			if(n[i]>n[i+1]) {
				int temp= n[i];
				n[i]= n[i+1];
				n[i+1]=temp;
				//Potrebbe non essere pi� ordinato
				ordinato=false;
			}
		}	
		}while(!ordinato);
	}

/*Compara in ordine alfabetico*/
public static void sort1(ArrayList<String> n) {
	boolean ordinato=true;
	do {
		ordinato= true;
		for(int i=0; i<n.size()-1; i++) { //Senza l'uguale!!
			if(n.get(i).compareTo(n.get(i+1))>0) { //Compara con il successivo
				Collections.swap(n, i, i+1); //Il Collections.swap scambia le due posizioni -> lo uso per  gli arrayList
				ordinato=false;
			}
		}	
		}while(!ordinato);
	}


	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a)); //Stampa il vettore intero
		
		ArrayList<String> l=(ArrayList<String>)Arrays.asList( "a", "h", "bb" );
	
	}
}
