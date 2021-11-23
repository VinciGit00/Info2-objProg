import java.util.Vector;

import prog.io.ConsoleOutputManager;

/*Classe enumerativa*/
enum Cambio{MANUALE, AUTOMATICO};

class Ruota{}

/*Classe che vogliamo costruire*/
public class Automobile {
	/*Campi della classe*/
	String colore;
	String marca, modello;
	int numeroposti, porte;
	char [] targa;
	boolean cambioManuale;
	Cambio cambio;
	Vector<Ruota> ruote;

	/*Costruttori*/
	/*Questi sono quelli inseriti automaticamente*/
	public Automobile( char[] t) { //Obbligatoria da inserire se la metto nelle parentesi
		targa=t; 
		cambio=Cambio.MANUALE;
		colore= "bianco";
		numeroposti =4;
	}
	
	/*Riscrittura della classe toString()*/
	@Override
	public String toString(){
		return "Colore"+this.colore+"-"+"Cambio: "+this.cambio ;
	}
	
	/*main*/
	public static void main(String[] args) {
		
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		char [] targa= {'0', '1', 'A'};
		Automobile mob= new Automobile(targa);
		out.println(mob.cambio+" "+mob.colore);
		
	}
}
