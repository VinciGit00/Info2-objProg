/*Algoritmo di RICERCA DICOTOMICA*/
public class BinarySearcher_IMPORTANTE {

	 /*Algoritmo fatto per confrontare gli interi*/
	static int cerca(int []a, int k) {
		int i=0, j=a.length-1, m;
		while(i<=j) {
			m= (i+j)/2;
			if(a[m]==k)
				return m;
			else if(a[m]<k)
				i=m+1;
			else j=m-1;
			
		}
		return -1; //Se non trova il valore da ricercare restituisce -1
	}
	
	/*Overload del metodo cerca*/
	/*Algoritmo fatto per confrontare i tipi generici*/
	static <E extends Comparable<E>> int cerca(E[] a, E k) { //Devo mettere acnhe il valore di ritorno di comparbale
		int i=0;//Estremo sinistro
		int j= a.length-1;//Estremo destro-> parte da a.length-1
		int m; //Metà vettore
		while(i<=j) {
			System.out.println("Cerco tra i: "+i+" j: "+j);
			m=(i+j)/2;
			if(a[m].compareTo(k)==0) 
				return m; //Restituisce l'indice del vettore
			else if(a[m].compareTo(k)<0) //IMPORTANTE
				i=m+1;
			else
				j=m-1;	
		}
		
		return -1;  //Se non trova la cosa da ricercare restituisce -1
	}
	
	/*N.B: il vettore deve essere ordinato per fare questo tipo di ricerca*/
	public static void main(String[] args) {
		int [] numeri= {1,3,7,9,10,50,100};
		System.out.println(cerca(numeri, 60));
		System.out.println(cerca(numeri, 3));
		
		String [] nomi= {"Anna", "Barbara", "Carlo", "Mario", "Nadia"};
		System.out.println(cerca(nomi, "Barbara"));
	}
}
