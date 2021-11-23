package Es1;

public class Passeggero {
	public static int cont=0;
	enum classe {P, E}
	String IdBiglietto;
	String nome;
	String cognome;
	Double prezzo;
	classe c;
	 
	 public Passeggero(String nome, String cognome, Double prezzo, classe x) {
		 this.IdBiglietto="P"+(++cont);
		 this.nome=nome;
		 this.cognome=cognome;
		 this.prezzo=prezzo;
		 this.c=x;
	 }
	 
	 public Passeggero(String nome, String cognome, classe x) {
		 this(nome, cognome, 340.0, x);
	 }
	 
	 public Passeggero(String parola) throws ValorevuotoException {
		 String [] pezzetti= parola.split(",");
		 for(int i=0; i<pezzetti.length; i++) {
			 switch (i) {
			 	case 1: 
			 		this.nome=pezzetti[i];
			 		break;
			 	case 2:
			 		this.cognome=pezzetti[i];
			 		break;
			 	case 3:
			 		this.prezzo= Double.parseDouble(pezzetti[i]);
			 		break;
			 	case 4:
			 		if(pezzetti[i].equals("E"))
			 			this.c=classe.E;
			 		else
			 			this.c=classe.P;
			 		break;
			 	default: 
			 		throw new RuntimeException("Errore");
			 }
				
		 }
	 }
	 
	 @Override()
	 public String toString() {
		 return "Nome"+this.nome+", cognome: "+this.cognome+", prezzo: "+this.prezzo;
	 }
}
