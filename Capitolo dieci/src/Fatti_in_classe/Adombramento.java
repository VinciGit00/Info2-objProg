package Fatti_in_classe;

class sopra {
	
	int k=1;
	/*Costruttore fatto automaticamte senza argomenti*/
	@Override
	public String toString() {
		return String.valueOf(k);
	}
}

class sotto extends sopra {
	
	int k=2;
	
	@Override
	public String toString() {
		return k+","+super.toString(); //Senza il super il k di sotto adombra il k di sotto
	}
}

/*Altro esempio di adombramento*/

class ex2 {
	private int x;
	
	ex2() {
		this.x= x; //Senza  il this, x adombrerebbe la x
	}
}

public class Adombramento {
	
	public static void main(String[] args) {
		sopra sa= new sopra();
		sotto so= new sotto();
		System.out.println(so.toString());
	}

}
