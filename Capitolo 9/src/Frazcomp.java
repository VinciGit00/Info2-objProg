
public class Frazcomp implements Comparable<Frazcomp>{

	int n, d;
	
	@Override
	public int compareTo(Frazcomp a) {
		/*Metodo 1:*/
		/*if(this.n/this.d>a.n/a.d)
			return 1;
		else if((this.n/this.d<a.n/a.d))
			return -1;
		return 0;*/
		
		/*Metodo 2:*/
		/*A seconda del compare ritorna valori diveris*/
		return Double.compare(this.n/this.d, a.n/a.d );//Si usa compare e non compareTo
	}

}
