package Volo;
public class PrenotazioneIndividuale extends Prenotazione {
	
	private String name;
	private Preferenza pref;
	
	public PrenotazioneIndividuale ( String name,  Double costo, Preferenza pref) {
		super(1, costo);
		this.name=name;
		this.pref=pref;
	}
	
	public PrenotazioneIndividuale ( String name,  Double costo) {
		this(name, costo, Preferenza.INDIFFERENTE);
	}
	
	public String getName() {
		return this.name; 
	}
	
	private Preferenza getPreferenza() {
		return this.pref; 
	}

	@Override
	public String toString() {
		return "Nome"+name;
	}

}
