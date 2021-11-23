package ClassiEnum;

public enum Grado {

	PRIMO(1), APPELLO (2), CASSAZIONE(3);

	public int number;
	
	Grado(int i) {
		
		this.number=i;
	}
}
