package Fatti_in_classe;

abstract class A {
	
	A(int h) { //Costruttore della classe A
		System.out.println("A");
	}
	
	abstract String getVal();
}


class B extends A {
	
	B(int h) { //Costruttore della classe B
		super(h); //Serve per chiamare il costruttore della superclasse, non obbligatorio perchè lo fa in automatico
		System.out.println("B");
	}

	B() { //Costruttore della classe B
		this(0); //Richiama l'altro B
		System.out.println("B0");
	}

	@Override
	String getVal() {
		return null;
	}
}


public class EsempioCostruttori {
	public static void main(String[] args) {
		B b= new B(); //Usa il secondo costruttore
	}
}
