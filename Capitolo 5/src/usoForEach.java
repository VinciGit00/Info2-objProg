import prog.utili.Frazione;

//Riempiamo un array con i primi 10 numeri pari
public class usoForEach {

	public static void main(String[] args) {
		
		int [] numeriPari= new int[10];
		
		for(int i=1; i<=10; i++)
		{
			numeriPari[i-1]=i*2;
		}
		
		//Per stampare un array bisogna fare un ciclo for
		for(int j=0; j<numeriPari.length; j++) //.lenght senza le due parentesi()
				System.out.println(numeriPari[j]);
		
		//Forma più semplice, loop for each
		for(int e:numeriPari )//elemento che percorre l'array, l'array
			System.out.println(numeriPari[e]); //e scorre tutto il vettore
		
		int []NumeriPari2= {1,2,3};
		
		String [] nomi= {"Marco", "Federico", "Jojo", "Iqbal"};
		
		/*Oggetto di oggetti, array contente frazioniss*/
		Frazione [] fraz= new Frazione[4];
		
		String [] classe= {"Piero", null, null, null}; //4 nomi, solo uno valido
				
	}

}
