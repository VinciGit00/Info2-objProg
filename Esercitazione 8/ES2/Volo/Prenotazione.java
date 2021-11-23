package Volo;

import java.util.ArrayList;

public abstract class Prenotazione implements Comparable<Prenotazione> {

	
	private static String characters="ABCDEFGILMOPQRSTUVZ0103456789";   
	private static int Rand;
	protected String ID;
	int npersone;
	private Double costo;
	 
	public Prenotazione(int npersone, Double costo) {
		this.ID="";
		for(int i=0; i<6; i++) {
			Rand=(int)(Math.random()*characters.length());
			char lettera= characters.charAt(Rand);
			this.ID=ID+lettera;
		}
		this.npersone=npersone;
		this.costo=costo;
	}
	
	@Override
	public int compareTo(Prenotazione o) {
		return Double.compare(this.costo, o.costo);
	}
	
	public Double calcolaprezzo(Double Costosingolo) {
		return this.costo;
	}
	
	public Double getCosto() {
		return this.costo; 
	}
	
	public String getID() {
		return ID;
	}
	
	public abstract String toString();
}
