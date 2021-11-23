package Enumerativi;

public enum classeenum {

	GENNAIO("Gennaio", 31), FEBBRAIO("Febbraio", 28), MARZO("Marzo",31), 
	APRILE("Aprile", 31), MAGGIO("Maggio", 31), GIUGNO("Giugno",30), 
	LUGLIO("Luglio", 31), AGOSTO("Agosto",30), SETTEMBRE("Settembre",30), 
	OTTOBRE("Ottobre",31), NOVEMBRE("Novembre",30), DICEMBRE("Dicembre",31);
	
	
	private String nome;
	private int numGiorni;
	
	classeenum(String string, int i) { //Costruttore obbligatorio da mettere se metto altri parametri altrimenti no
		this.nome=string;
		this.numGiorni=i;
	}
	
}
