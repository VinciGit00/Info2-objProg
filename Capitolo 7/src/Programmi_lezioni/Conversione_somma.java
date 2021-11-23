package Programmi_lezioni;

public class Conversione_somma {

	public static void main(String[] args) {

		int somma=0;
		
		try {
			String parola= "0-1-2-3-4-M-6-7-8-9";
			String[] contenitore= parola.split("-");
			for(int i=0; i<contenitore.length; i++) {
				int valore= Integer.parseInt(contenitore[i]);
				somma+=valore;
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Non hai inserito un numero ma una lettera ");
		}
		System.out.println("Somma: "+somma);
		
	}

}
