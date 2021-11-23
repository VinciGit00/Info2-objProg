import java.util.Arrays;

public enum GiorniSettimana {// Non possiede un costruttore nel main
	
	LUN(8), MAR(7), MER(10), GIO(15) {
		void foo() {}
	}, VEN(4), SAB(4), DOM(0);
	
	void foo() {}
	
	private int oreLavorative; //Punta alle parentesi
	
	//Costruttore
	private GiorniSettimana(int o) {oreLavorative=o;}
	
	/*Metodo*/
	int numeroOreLavorative() {
		return oreLavorative;
		
	}
	
	public static void main(String[] args) {
		
		GiorniSettimana g= LUN;
		//1. name
		System.out.println(g.name()); //Senza bisogno di implementarlo
		//2. ordinal
		System.out.println(g.ordinal()); //Parte da 0 a contare
		
		System.out.println(Arrays.toString(GiorniSettimana.values()));
		
		int giorno=6;
		System.out.println(GiorniSettimana.values()[giorno]);
		
	}
}
