package Interfacce;

class coppia <E, F> { //Bisogna aggiungere i parametri qui
	
	private static int nCoppie=0; //Contatore delle coppie
	private E sinistro;
	private F destro;
	
	/*Costruttore*/
	public coppia(E e, F f) {
		this.sinistro= e;
		this.destro= f;
		++nCoppie;
	}
	
	/*public coppia(E e) {
		this(e,e); //Non si può fare 
		
	}*/
	
	/*Metodi*/
	public E getSinistro() {
		return sinistro;
	}
	
	public F getDestro() {
		return destro;
	}
	
	public int getCoppie() {
		return nCoppie;
	}
	
	@Override
	public String toString () {
		return "Sinistro: "+this.sinistro+" destro: "+this.destro;
	}

}

 public class ClassiGeneriche{
	public static void main(String[] args) {
		coppia <String, String> doppio1= new coppia<String, String>("Marco", "Franco");
		coppia <String, Integer> doppio2= new coppia<String, Integer>("Marco", 50); //Non si passano dentro tipi primitivi ma tipi riferimento
		
		
		System.out.println(doppio1.toString());
		System.out.println(doppio2.toString());
	}
}