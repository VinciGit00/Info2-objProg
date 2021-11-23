import prog.io.ConsoleOutputManager;
import prog.utili.MeseDellAnno;
/*Pagina 154 del libro di programmazione ad oggetti*/

public class MeseDellAnno_prova {

	public static void main(String[] args) {
	
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		/*MeseDellAnno è un tipo enumerativo(i tipi enumerativi non sono classi) (i tipi enumerativi contengono classi enumerative)*/
		/*Creazione di una costante enumerativa*/
	
		MeseDellAnno mese= MeseDellAnno.APRILE;//N.B: non usare il new nei tipi enumerativi
		
		out.println(mese.toString());
		out.println(mese.numeroGiorni());//Scrive il numero dei giorni che quel mese ha
		out.println(mese.ordinal());//Scrive la posizione in cui si trova il mese (3 perchè parte da 0)
		out.println(mese.name()); //Scrive il mese (tutto in minuscolo)
	}

}
