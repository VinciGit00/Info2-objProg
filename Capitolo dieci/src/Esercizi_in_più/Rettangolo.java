package Esercizi_in_più;

public class Rettangolo {
	
	double base;
	double altezza;
	
	public Rettangolo(double d, double d2) {
		this.base= d;
		this.altezza= d2;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public double getArea() {
		return base*altezza;
	}
	
	@Override
	public String toString() {
		return "Base: "+getBase()+", altezza: "+getAltezza();
	}
}

/*Quadrato può invocare qualsiasi metodo della classe Rettangolo*/
class Quadrato extends Rettangolo { //Un quadrato è anche un rettangolo
	
	Quadrato (double d) {
		super(d,d); //Deve essere necessariamente alla prima riga
	}
	
	public double getLato() {
		return getBase(); //Eredita i metodi
	}
	
	@Override
	public String toString() {
		return "Lato: "+getLato();
	}
}
