import prog.io.ConsoleInputManager;

public class Crivello {

	public static void main(String[] args) {

		ConsoleInputManager in= new ConsoleInputManager();
		
		/*Modo veloce per trovare i numeri primi*/
		int n= in.readInt();
		
		boolean [] multipli= new boolean[n+1]; //Array di primitivi con la prima lettera minuscola
		/*boolean inizializzato tutto a false*/
		
		for(int i=2; i<=n; i++)
		{
			/*Entra nel ciclo se è false*/
			/*E' uguale a dire false*/
			if(!multipli[i])  //Se è false entra nell'if
			{
				for(int j=i+i; j>=n; j+=i)
				{
					multipli[j]= true;
				}
			}
		}
	}

}
