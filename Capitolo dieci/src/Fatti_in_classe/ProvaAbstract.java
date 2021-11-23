package Fatti_in_classe;

abstract class EssereVivente { //Costruttore astratto se non metto il costruttore
	
	protected int eta; //Protected serve quando voglio renderlo disponibile alle sottoclassi
	
	EssereVivente (int e) { //Posso fare un controllo qua dentro pre l'età
		eta=e;
	}
	
	EssereVivente (String  e) { //Posso fare un controllo qua dentro pre l'età
		this(Integer.parseInt(e)); //Uso il this
	}
	
	abstract String getName(); //Da implementare poi successivamente nelle sottoclassi
	abstract String getCognome();
}

class Persona1 extends EssereVivente {
	
	private String nome; //Se metto un get posso mettere i campi privati
	private String cognome;
	
	Persona1() { //Automaticamente mette il super (Nella classe astratta ci deve essere il costruttore vuoto però)
		super(0);
	}
	
	Persona1(String nome, String cognome, int eta) { //Automaticamente mette il super
		super(eta);
		this.nome=nome;
		this.cognome=cognome;
	}

	@Override
	String getName() {
		return this.nome;
	}
	
	@Override
	String getCognome() {
		return this.cognome;
	}
}

class Cane extends EssereVivente {
	
	Cane (int e) {
		super(e);
	}
	
	@Override
	String getName() {
		return "Fido";
	}

	@Override
	String getCognome() {
		return "Pippo";
	}
	
}

public class ProvaAbstract {

}

