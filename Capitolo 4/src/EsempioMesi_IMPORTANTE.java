import prog.utili.MeseDellAnno;

public class EsempioMesi_IMPORTANTE {
//Prendiamo il mese corrente
// e stampiamo l'ordinal
	public static void main(String[] args) {
		
		MeseDellAnno meseCorrente= MeseDellAnno.MARZO; //Creo una costante enumerativa
		System.out.println(meseCorrente.ordinal());
	}
	
	//metodo che chiamiamo MoodMese
	//a seconda del mese, stampa l'umore di quel mese
	
	public static void stampaMoodMese(MeseDellAnno m) {
		switch(m) {
		case GENNAIO: System.out.println("Che bello è l'inverno"); break;
		case FEBBRAIO: System.out.println("Che bello è l'inverno"); break;
		case MARZO: System.out.println("Che bello è l'inverno"); break;
		case APRILE: System.out.println("Che bello è l'inverno"); break;
		case MAGGIO: System.out.println("Che bello è l'inverno"); break;
		case GIUGNO: System.out.println("Che bello è l'inverno"); break;
		case LUGLIO: System.out.println("Che bello è l'inverno"); break;
		case AGOSTO: System.out.println("Che bello è l'inverno"); break;
		case SETTEMBRE: System.out.println("Che bello è l'inverno"); break;
		case OTTOBRE: System.out.println("Che bello è l'inverno"); break;
		case NOVEMBRE: System.out.println("Che bello è l'inverno"); break;
		case DICEMBRE: System.out.println("Che bello è l'inverno"); break;

		default:
			System.out.println(); break; //break serve necessariamente
		}
	}

}
