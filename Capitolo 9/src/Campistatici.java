
class B{
	/*Campi statici possono essere public o private*/
	public static int contaOggetti=0;
	/*Se non avessi messo lo 0 l'avrebbe inizializzato comunque a 0*/
	private int x=0;
	
	public B(int i) {
		/*Assegna il valore e fa l'incremento*/
		this.x=i; 
		contaOggetti++;
	}
	
}

public class Campistatici {
	public static void main(String[] args) {
		B conta= new B(5);
		/*conta.x non lo posso stampare perché è un private*/
		System.out.println(B.contaOggetti); //Siccome è pubblic si può accedere direttamente dal main
	}
}






