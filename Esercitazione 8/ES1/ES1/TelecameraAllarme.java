package ES1;

import Eccezioni.kmsbagliatiException;

public class TelecameraAllarme extends Telecamera {

	private int num;
	
	public TelecameraAllarme(int num, String d, float km, int num1) throws kmsbagliatiException {
		super(num1, d, km);
		this.num=num1;
	}

	public boolean SPEGNI() {
		System.err.println("La telecamera allarmata non può cambiare il suo stato");
		return false;
	}

}
