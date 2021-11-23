
public class Errorenelfor {

	public static void main(String[] args) {
		
		int v;
		for(int i=0, k1=2; i<60; i++ ) //Tra un'istruzionen e l'altra posso mettere una virgola
		{
			//i+=2; darebbe errore perchè l'i non si può modificare all'interno delle parentesi
			/*Però si può fare così:*/
			v=i*2;
		}
	}

}
