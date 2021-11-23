package EccezioniControllate;
/*Le eccezioni controllate devono essere o intercettate mediante un try-catch o delegate esplicitamente*/
public class Eccezionecontrollata {
	
	public static void main(String[] args) throws valnegativoException {
		int k=-5;
		
		
		//Try catch-> manda avanti l'esecuzione anche se l'eccezione è controllata
		try {
			metodo(k); //Metodo try-catch per le eccezioni controllate-> manda avanti l'esecuzione, senza il try catch non va avanti
		} catch (valnegativoException e) {
			e.printStackTrace();
		} //Eccezioni controllate bloccano l'esecuzione
		
		if(k<0)
			throw new valnegativoException(); //Se non uso il try catch bisogna mettere una throws declaration */
		
		System.out.println("ciao");//Questo non lo stampo perchè l'esecuzione viene bloccata
	}
	
	public static void metodo(int k) throws valnegativoException {//Eccezione controllata delegata al chiamante
		if(k<0) {
			throw new valnegativoException(); 
		}
	}
}

 class valnegativoException extends Exception{
	 
	 valnegativoException() {
		 super("Valore non valido");
	 }
}