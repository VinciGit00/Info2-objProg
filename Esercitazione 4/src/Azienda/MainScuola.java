package Azienda;

public class MainScuola {

	public static void main(String[] args) {
		Stud p0= new Stud("Gargantino","Pino");
		Stud p= new Stud("Vinciguerra","Marco");
		p.aggiungiVoto(30);
		p.aggiungiVoto(30);
		System.out.println(p);
		System.out.println("Media: "+p.calcolaMedia());
		
		
		Scuola school= new Scuola("UniBg");
		school.addStudenti(p);
		school.addStudenti(p0);
		
		
		Stud p1= new Stud("Vinciguerr","Marco");
		school.rimuoviStudenti(p1);
		
		System.out.println("Prima dell'ordinamento: ");
		school.stampaStudenti();
		System.out.println("*------------------------");
		school.ordinaStudenti();
		System.out.println("Dopo l'ordinamento: ");
		school.stampaStudenti();
		
	}

}
