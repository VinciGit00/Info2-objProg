
public class Coppia<E, F> { //Permette di rappresentare coppie di numeri
	E sinistro;
	F destro;
	
	Coppia(E sin, F dex) {
		sinistro=sin;
		destro=dex;
	}
	
	E getsinistro() {
		return sinistro;
	}
	
	@Override
		public String toString() {
		return "sinistro "+sinistro+" destro "+destro;
	}
	
	
	public static void main(String[] args) {
		Coppia <String, String> nc= new Coppia <String, String>(" "," ");
		nc.sinistro= " ";
		nc.destro= " ";
		
		Coppia <String, Integer> ac= new Coppia <String, Integer>(" ", 5000); //N.B: deve essere un Integer-> si passano riferimenti a oggetti e non tipi primitivi nelle classi generiche
		ac.sinistro="Porsche";
		//ac.destro="MArco"; //Darebbe errore 
		ac.destro=5000;
	}
}
