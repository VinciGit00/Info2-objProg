
class B{}

class C{}

public class A {
	public static void main(String[] args) {
		Programmi_in_più.PROVA a = new Programmi_in_più.PROVA(); //Si può fare così al posto dell'import
	}
	
	/*Campi della classe*/
	int k; //Visibili a tutti le classi dello stesso package
	private int h;
	/*Metodi della classe*/
	private void moo() {
		this.h=5;
	}

}
