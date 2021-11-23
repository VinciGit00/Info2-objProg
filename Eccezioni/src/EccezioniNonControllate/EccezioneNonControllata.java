package EccezioniNonControllate;

public class EccezioneNonControllata {
	
	public static void main(String[] args) {
		
	try { //Eccezioni non controllate vanno trattate necessariamente con un try-catch e non si possono delegare
		int k=-5;
		if(k<0)
			throw new eccnoncintrollata();
	}
	 catch (eccnoncintrollata e) {
		System.out.println("xdcfgvhbjnmk");
	 }
		System.out.println("ciao"); //Eccezione non controllata non blocca l'esecuzione

	}
	
	public static void controlla(int k) {
		try { //Eccezioni non controllate vanno trattate necessariamente con un try-catch e non si possono delegare
			if(k<0) //Anche dentro i metodi non posso farlo
				throw new eccnoncintrollata();
		}
		 catch (eccnoncintrollata e) {
			System.out.println("xdcfgvhbjnmk");
		}
	}
}

class eccnoncintrollata extends RuntimeException {
	eccnoncintrollata() {
		
	}
}
