/**@author: Marco Vinciguerra
 *@serial: 1064889
 * */
package Es2VarianteOggCondivisi;

public class tFigli extends Thread{
	
	int [] v= new int [10];
	int [] resultArray = new int [5]; //Oggetto condiviso->Gli array sono oggetti!!
	int assignedIndex;
	
	
	/*
	 * In questo modo, come vedi, usiamo come oggetto condiviso un array ed assegnamo una cella diversa
	 * dell'array ad ogni thread, dando un "assignedIndex" differente.
	 */
	public tFigli(int[] a, int [] resultArray, int assignedIndex) {
		this.v= a;
		this.resultArray = resultArray;
		this.assignedIndex = assignedIndex;
	}
	  
	public void run() {

		int sommatemp=0;
		for(int i=0; i<10; i++) {
			sommatemp+=v[i];
		}
		 
		resultArray[assignedIndex]=sommatemp; //Array che contiene le somme parziali
	} 
	
}
