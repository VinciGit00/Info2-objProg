
public class ContaRicorsione { 
	
	/*E' un esempio di soluzione ricorsiva*/
	public static void main(String[] args) {
	
		System.out.println(conta(3, new int [] {5,6,7,8}));
	}
 
	/*Conta quante volte y è in a*/
	static int conta(int y, int a[]) { //y è il valore da cercare
		return conta(y, a, 0);
	}
	
	//Conta dalla posizione pos//helper 
	private static int conta(int y, int a[], int pos) { //Privato perchè serve per un passaggio interno
		System.out.println("Sto contando da pos "+pos);
		if(pos>=a.length) return 0; //Caso base, posizione che 
		if(y==a[pos]) return 1+conta(y, a, pos+1); //Aggiunge 1 quando i valori sono uguali
		else return conta(y,a, pos+1); //Nonn aggiunge 1 al contatore
	}
 
}
