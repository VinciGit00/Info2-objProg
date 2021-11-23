package Es5;
import java.util.Vector;

public class Studente {
	/*Tipi della classe*/
	String nome;
	String cognome;
	Vector <Double> voti; //Vanno sempre gli oggetti dentro i Vector
	String paeseResidenza;
	
	/*Costruttori della classe*/
	public Studente(String nome, String cognome, Vector<Double> voti2, String paeseResidenza){
		this.nome= nome;
		this.cognome= cognome;
		this.paeseResidenza= paeseResidenza;
		this.voti= voti2;
		voti= new Vector<>();
	}
	
	public Studente(String nome, String cognome, Vector <Double> voti){
		this(nome, cognome, voti, "Sconosciuto");
	}
	
	/*Metodi della classe*/
	public void aggiungiVoto(Double voto) {
		this.voti.add(voto); //Aggiunge in ultima posizione
	}
	
	public Double calcolaMedia() {
		Double votisommati=(double) 0, media=(double) 0;
		int i=0;
		for(Double b: this.voti) {
			votisommati+=b;
			i++;
		}
		if(i!=0)
			return media= votisommati/i;
		else 
			return (double) -1;
	}
	
	@Override
	public String toString() {
		return "Nome: "+this.nome+" Cognome: "+this.cognome+" voti: "+voti+" residenza: "+paeseResidenza;
	}

}
