package TipiGenerici;

public class Provametodigenerici1 {
	
	public static void main(String[] args) {
		generics G= new generics("Marco");
		System.out.println(G.Scrivi());
	}
	
}

class generics<E>{
	
	E e;
	
	generics(E e) {
		this.e=e;
	}
	
	
	public <E> String Scrivi() {
		return e.toString();		
	}
	
	public <E> void Stampa() {
		System.out.println(e);
	}
}