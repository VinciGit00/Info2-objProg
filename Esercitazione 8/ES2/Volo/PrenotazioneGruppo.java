package Volo;

import java.util.ArrayList;

public class PrenotazioneGruppo extends Prenotazione {

	private ArrayList<String> ListaPersone;
	Double prezzototale;
	
	public PrenotazioneGruppo(ArrayList<String> ListaPersone, int npersone, Double Costosingolo) {
		super(npersone, Costosingolo );
		this.ListaPersone=ListaPersone;
	}
	
	@Override
	public Double calcolaprezzo(Double Costosingolo) {
		if(ListaPersone.size()>10)
			return Costosingolo*0.8*this.npersone;
		return Costosingolo*0.9*this.npersone;
	}

	@Override
	public String toString() {
		return ListaPersone+"Prezzo"+this.prezzototale;
	}
	
	public void aggiungiPersona(String name) {
		ListaPersone.add(name);
		npersone++;
	}
}
