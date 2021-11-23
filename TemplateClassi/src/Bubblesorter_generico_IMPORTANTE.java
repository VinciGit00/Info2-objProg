/*Serve per ordinare un array di tipi generici*/
interface Sorter <E>{
	void sort(E[] e);
}


public class Bubblesorter_generico_IMPORTANTE<E extends Comparable <E>> implements Sorter<E>{

	@Override
	public  void sort(E[] e) { //E � un generico
		boolean ordinato=true;
		do {
			ordinato=true;
			for(int i=0; i<e.length-1; i++) {
				
				if(e[i].compareTo(e[i+1])>0) { //Col generico uso il vettore temporaneo e non lo swap, quello lo faccio con le collezioni
					E temp= e[i];
					e[i]=e[i+1];
					e[i+1]=temp;
					ordinato=false;
				}
			}
			
		}while(!ordinato); //Continua finch�  la flag � false
	}
}
