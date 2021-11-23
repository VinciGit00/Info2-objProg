import prog.utili.MeseDellAnno;

public class TipiEnumerativi_IMPORTANTE {

	public static void main(String[] args) {
		MeseDellAnno mese_attuale= MeseDellAnno.MARZO; //Creo una costante enumerativa da un tipo enumerativo
		
		StampaValore(mese_attuale);
	}

	public static void StampaValore(MeseDellAnno mese)
	{
		switch (mese) {
			case GENNAIO: System.out.println("Hai inserito gennaio"); break; //Non  devo mettere le virgolette perchè riconosce da solo le costanti enumerative
			case FEBBRAIO: System.out.println("Hai inserito febbraio"); break;
			case MARZO: System.out.println("Hai inserito marzo"); break;
			case APRILE: System.out.println("Hai inserito aprile"); break;
			case MAGGIO: System.out.println("Hai inserito maggio"); break;
			case GIUGNO: System.out.println("Hai inserito giugnio"); break;
			case LUGLIO: System.out.println("Hai inserito luglio"); break;
			case AGOSTO: System.out.println("Hai inserito agosto"); break;
			case SETTEMBRE: System.out.println("Hai inserito settembre"); break;
			case OTTOBRE: System.out.println("Hai inserito ottobre"); break;
			case NOVEMBRE: System.out.println("Hai inserito novembre"); break;
			case DICEMBRE: System.out.println("Hai inserito dicembre"); break;

			default:
				System.out.println("Mese non valido "); break;
		}
	}
}
