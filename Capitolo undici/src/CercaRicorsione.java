
public class CercaRicorsione {
	/*E' un esempio di soluzione ricorsiva*/
	public static void main(String[] args) {
	
	}
	static boolean cerca(int y, int []a ) { //y è il valore da cercare
		return cerca(y, a, 0);
	}
	private static boolean cerca(int y, int[] a, int pos) {
		if(pos>= a.length)
			return false;
		if(y==a[pos])
			return true;
		return cerca( y, a, pos);
	}
}
