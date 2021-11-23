import java.util.ArrayList;

public class Matrice {
	
	private ArrayList<ArrayList<Integer>> dati; //Matrice
	protected int numeroRighe, numeroColonne;

	public Matrice(int numeroRighe, int numeroColonne) {
		this.numeroRighe = numeroRighe; //Numero di righe
		this.numeroColonne = numeroColonne; //Numero di colonne
		dati = new ArrayList<ArrayList<Integer>>();
		for(int c = 0; c < numeroColonne; c++) { //Metto tutti gli elementi a 0
			ArrayList<Integer> e = new ArrayList<Integer>(numeroRighe); //ArrayList temporaneo
			for(int r = 0; r < numeroRighe; r++) {
				e.add(0); //Tutti i valori a 0
			}
			dati.add(e);
		}
	}
	// Matrice quadrata
	public Matrice(int numeroRighe) {
		this(numeroRighe,numeroRighe);
	}
	// r: riga, c: colonna
	public void set(int r, int c, int v) {
		dati.get(c).set(r, v); //v è il valore
	}
	
	/*@Override
	public String toString() {
		return dati.toString();
	}*/
	
	
	// Qualche metodo statico
	static ArrayList<Integer> calcoloSommaDiColonna(Matrice m) {
		ArrayList<Integer> risultato = new ArrayList<>();
		for(int c = 0; c <m.numeroColonne; c++) {
			// c è l'indice della colonna
			int somma=0;
			for(int r=0; r < m.numeroRighe; r++) {
				// prendi elemento posizione r,c
				somma+=m.dati.get(c).get(r);
			}
			risultato.add(somma);
		}
		return risultato;
	}    
	
	public static void main(String[] args) {
		Matrice txt = new Matrice(3);
		txt.set(0,0,1);
		txt.set(2,1,7);
		txt.set(2,2,10);
		System.out.println(txt.toString());
		System.out.println(calcoloSommaDiColonna(txt));
	}
	
}
