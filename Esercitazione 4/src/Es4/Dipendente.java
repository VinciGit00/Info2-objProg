package Es4;

import java.util.Comparator;

public class Dipendente {
	
	String nome;
	String cognome;
	double stipendio;
	
	/*IMPORTANTE*/
	private static final int StipendioBase=1500; //Non può essere modificato
	
	/*Costruttori della classe*/
	public Dipendente(String nome, String cognome, double i) {
		this.nome= nome;
		this.cognome= cognome;
		this.stipendio= Math.round(i*100)/100;
	}
	
	public Dipendente(String nome) {
		this.nome= nome;
		this.stipendio= StipendioBase;
	}
	
	/*Oppure:*/
	/*public Dipendente(String nome) {
		this(nome,1500.0);
	  */
	
	/*Metodi della classe*/
	public String getNome(){
		return this.nome;
	}
	
	public double getStipendio() {
		return this.stipendio;
	}
	
	public void incrementastipendio(double i) {
		this.stipendio=this.stipendio+this.stipendio*i/100;
	}
	
	@Override
	public String toString() {
		return "Cognome: "+this.cognome+" Nome: "+this.nome+" stipendio: "+this.stipendio;
	}
}

class ComparatorByname implements Comparator <Dipendente> {

	@Override
	public int compare(Dipendente o1, Dipendente o2) {
		return o1.cognome.compareTo(o2.cognome);
	}
	
}