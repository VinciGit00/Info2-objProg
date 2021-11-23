
public class Pro {
	public static void main(String[] args) {
		
		Fraz z= new Fraz(5,6);
		ContenitoreClasse p= new ContenitoreClasse("Fotter");
		p.addFrazione(new Fraz(1,1));
		p.addFrazione(new Fraz(5,6));
		p.addFrazione(new Fraz(5,6));
		p.addFrazione(new Fraz(5,7));
		
		System.out.println("Prima dell'ordinamento: ");
		p.stampaFrazioni();
		
		p.eliminaFrazione(new Fraz(5,6));
		
		System.out.println("-------------------------------------");
		System.out.println("Dopo l'ordinamento e l'eliminazione: ");
		p.ordina();
		
		p.stampaFrazioni();
	}
}
