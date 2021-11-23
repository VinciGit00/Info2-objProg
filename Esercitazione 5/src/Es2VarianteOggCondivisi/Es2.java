package Es2VarianteOggCondivisi;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Es2 {
	public static void main(String[] args) throws InterruptedException {

		int dim=50;
		int [] array= new int[50];
		int [] miniarray= new int [10];
		
		/*
		 * In questo caso l'oggetto condiviso è il vettore dei risultati
		 */
		int [] resultArray = new int [5];
		
		for(int i=0; i<50; i++) {
			array[i]=3;
		}
		
		tFigli [] t= new tFigli [5];
		int index=0;
		int k=0;
		for(int i=0; i<50; i++) {
			try {
				k++;
				if(k>9) {
					// Il fatto che "resultArray" è un oggetto condiviso è dimostrato dal fatto che lo passo
					// allo stesso modo a tutti i thread che creo
					t[index]= new tFigli(miniarray, resultArray, index);
					index++;
					k=0;
				}
				miniarray[k]= array[i];
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Sei uscito");
			}
		}
		
	int somma=0;
		
	// Attenzione a non mettere start e join nello stesso ciclo, perchè facendo in questo modo non hai un vero
	// e proprio funzionamento parallelo, in quanto per avviare il thread successivo il tuo main aspetterà 
	// di fare il join del thread precedente... e di conseguenza avrai sempre e solo un thread attivo
	for(int i=0; i<5; i++) {
		t[i].start();
	}
	
	for(int i=0; i<5; i++) {
		t[i].join();
		somma+=resultArray[i];		
	}
	
	System.out.println("La somma è: "+somma);
	}
}
