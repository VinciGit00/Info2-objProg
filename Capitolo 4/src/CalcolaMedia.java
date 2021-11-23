
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;
//Domandiamo una serie di numeri terminanti con -1
//Calcoliamo la media

public class CalcolaMedia {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		int somma=0;
		int x=0;
		
		while(true)
		{
			int n= in.readInt();
			if(n==1)
				break; //break serve per uscire dal ciclo
			somma+=n;
			x++;
		}
		
		/*Conversione esplicita per forzare la divisione tra double*/
		/*Vanno bene entrambi*/
		System.out.println("Media: "+somma/(double)x); //Basta convertirne solo 1 perchè il numeratore viene convertito implicitamente
		System.out.println("Media: "+(double)somma/x);
		
		/*Non va bene*/
		System.out.println("Media: "+(double)(somma/x)); //Non va bene perchè prima fa l'operazione e poi converte in double
		
		Frazione fr= new Frazione(1,2);
		out.println(fr); //Convertito automaticamente in string (fr.toString())
		
		char z= 'z';
		
		int nZ=z; /*Va bene*/
		char k=117; //Va bene
		//char k1= nZ; Non va bene
	}

}
