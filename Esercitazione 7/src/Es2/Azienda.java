package Es2;

public class Azienda {
	public static void main(String[] args) {
		Dipendente dip1= new Dipendente("Marco", "Vinciguerra", 5, 20);
		System.out.println(dip1.calcolaStipendio());
		
		DipendenteResponsabile dip2= new DipendenteResponsabile("Remo", "Garattini", 0, 0, 0);
		System.out.println(dip2.calcolaStipendio());
	}
}

