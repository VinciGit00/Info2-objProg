package Interfacce;

interface I0{}

interface I extends I0{}

public interface Window  extends I {

	static int y=90;
	
	void apri();
}

class myWindow implements Window {

	@Override
	public void apri() {
		
	}
	
}