package Interfacce;

public class Prova_generici<E, F> {
	E e;
	F b;

	public Prova_generici(E e, F b) {
		this.e=e;
		this.b=b;
	}
	
	E getE() {
		return this.e;
	}
	
	F getF() {
		return this.b;
	}
	
	
	@Override
	public String toString() {
		return e+" "+b;
	}
	
	public static void main(String[] args) {
		Prova_generici pg= new Prova_generici<String, String>("Marco", "Franco");
	}
}
