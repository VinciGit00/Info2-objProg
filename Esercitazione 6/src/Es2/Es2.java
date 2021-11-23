package Es2;

import java.util.ArrayList;

public class Es2 {

	public static void main(String[] args) {
		String stringavoti="a; 18; 20; -3" ;
		
		estraivoti(stringavoti);
	}

	public static void estraivoti(String s) {
		
		String elencoVoti []= s.split(";");
		
		for(int i=0; i<elencoVoti.length; i++) {
			try {
				int voto= Integer.parseInt(elencoVoti[i]);
				if(voto<18|| voto>30)
					throw new RuntimeException("Voto "+ voto+" non valido");
			} catch (NumberFormatException e) {
				System.out.println("Errore");
			} catch (RuntimeException e) {
				throw new RuntimeException("Voto "+ elencoVoti[i]+" non valido");
			}
		}

	}
}

