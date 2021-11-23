package Volo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Volo implements Comparable<Volo> {
	
	private static int nprogressivo=0;
	public ArrayList<Prenotazione> prenotazioni;
	private int ID; 
	public  String partenza; 
	private String arrivo; 
	private String data; 
	private String ora;
	int numeromaxpasseggeri;
	Double costo;
	public int passeggeriprenotati;
	
	public Volo(int ID, String partenza, String arrivo, String data, String ora,int numeromaxpasseggeri, int passeggeriprenotati) {
		this.ID=ID;
		this.partenza=partenza;
		this.arrivo=arrivo;
		this.data=data;
		this.ora=ora;
		this.numeromaxpasseggeri=numeromaxpasseggeri;
		this.prenotazioni= new ArrayList<>() ;
	}
	
	
	public Volo(String partenza, String arrivo, String data, String ora, int numeromaxpasseggeri, int passeggeriprenotati) {
		this(++nprogressivo,  partenza,  arrivo, data, ora, numeromaxpasseggeri,passeggeriprenotati );
	}
	
	public Volo(String partenza, String arrivo, String data, String ora) {
		this(++nprogressivo,  partenza,  arrivo, data, ora, 180, 0);
	}
	
	public int getId() {
		return this.ID;
	}
	
	public void setPrenotazione(Prenotazione prentemp) {
		this.prenotazioni.add(prentemp);
	}
	
	public void setPrenotazione(ArrayList<Prenotazione> prentemp) {
		this.prenotazioni=(prentemp);
	}

	public Double CalcolaCosto() {
		Double c=(double) 0;
		for(int i=0; i<prenotazioni.size(); i++) {
			if(prenotazioni.get(i) instanceof PrenotazioneGruppo) {
				costo+=prenotazioni.get(i).calcolaprezzo(prenotazioni.get(i).getCosto());
			}
			else {
				costo+=prenotazioni.get(i).getCosto();
			}
		}
		return c;

	}
	
	@Override
	public int compareTo(Volo o) {
		return Double.compare(this.CalcolaCosto(), o.CalcolaCosto());
	}
	
	@Override
	public String toString() {
		return "ID"+ID+"partenza"+partenza+"arrivo"+arrivo+"data"+data+"ora"+ora+"numeromaxpasseggeri"+numeromaxpasseggeri;
	}

	
}