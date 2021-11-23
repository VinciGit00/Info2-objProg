package Es6;
/*Compara in base al numero din km*/
public class Automobile implements Comparable<Automobile> {
	int ID;
	Double kmpercorsi;
	/*Campo statico*/
	public static int numerodiautomobili=0;
	
	public Automobile(int ID, Double k) { 
		this.ID= ID;
		this.kmpercorsi= k;
	}
	
	public Automobile(Double k) { 
		this.kmpercorsi= k;
		this.ID=++numerodiautomobili;
	}
		
	@Override
	public String toString() {
		return"ID:" +this.ID+"km percorsi "+this.kmpercorsi;
	}
	
	/*Ordina in base al numero di km*/
	@Override
	public int compareTo(Automobile o) {
		return Double.compare(this.kmpercorsi, o.kmpercorsi);
	}
	
	/*Creiamo il nostro sort*/
	static void sort(Automobile[] a) {
		boolean ordinato= true;
		do {/*Utilizza il compareTo sopra*/
			for(int i=0; i<a.length; i++) {
				if(a[i].compareTo(a[i+1])>0) {
					Automobile temp= a[i]; //Variabile temporanea dove salvare
					a[i]= a[i+1];
					a[i+1]= temp;
					ordinato=false;
				}
			}
		}while(!ordinato);
	}
}
