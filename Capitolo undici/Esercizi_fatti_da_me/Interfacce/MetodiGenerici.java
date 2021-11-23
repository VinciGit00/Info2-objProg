package Interfacce;

class cp<E, F> {
	
	public static int ncoppie=0;
	E sinistro;
	F destro;
	
	cp(E e, F f) {
		this.sinistro=e;
		this.destro= f;
	}
	
	public static cp <Object, Object> creaIdentita1(Object O) {
		return new <Object, Object> cp(O,O);
	}
	
	public static cp <String, String> creaIdentita2(String O) {
		return new <String, String> cp(O,O);
	}
	
	public static <T> cp <T, T> creaIdentita3(T t) {
		return new <T, T> cp(t,t);
	}
}


public class MetodiGenerici {
	public static void main(String[] args) {
		
	}
}
