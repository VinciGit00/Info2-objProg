package Es2;

public class Dipendente {
	private String nome;
	private String cognome;
	protected int orelavorativeMensili;
	protected int retribuzioneoraria;
	
	public Dipendente(String nome, String cognome, int orelavorativeMensili, int retribuzioneoraria) {
		this.nome=nome;
		this.cognome=cognome;
		this.orelavorativeMensili=orelavorativeMensili;
		this.retribuzioneoraria=retribuzioneoraria;
	}
	
	public int calcolaStipendio() {
		return orelavorativeMensili*retribuzioneoraria;
	}
}

class DipendenteResponsabile extends Dipendente{
	int bonus;
	
	public DipendenteResponsabile(String nome, String cognome, int orelavorativeMensili, int retribuzioneoraria, int bonus) {
		super(nome, cognome, orelavorativeMensili, retribuzioneoraria);
		this.bonus=bonus;
	}
	
	@Override
	public int calcolaStipendio() { //Usa il metodo della superclasse
		return super.calcolaStipendio()+bonus; //IMPORTANTE
	}
	
}

