package ES1;

import Eccezioni.kmsbagliatiException;

public class TelecameraSemplice extends Telecamera {

	private String costruttore;
	
	public TelecameraSemplice(int num, String d, float km, String cos) throws kmsbagliatiException {
		super(num, d, km);
		this.costruttore=cos;
	}
}
