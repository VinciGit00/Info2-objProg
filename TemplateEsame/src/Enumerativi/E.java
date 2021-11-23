package Enumerativi;

public enum E {

	A(1), B(2), C(3);
	
	private int number;
	
	E(int i) {
		this.number=i;
	}

	public int GetNumber() {
		return this.number;
	}
	
}
