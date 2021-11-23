package Es5;

public class Motorino {
	private String colore;
	protected float velocita;
	private String tipo;
	private boolean antifurto;
	
	public Motorino(String colore, String tipo, float velocita)  {
		this.colore=colore;
		this.velocita=velocita;
		this.tipo=tipo;
		antifurto=true;
	}
	
	public float getVelocita() {
		return this.velocita;
	}
	
	public float accelera(float a) throws Lucchettoexception {
		if(!this.antifurto)
			return this.velocita+a;
		else
			throw new Lucchettoexception();
	}
	
	public String getColore() {
		return this.colore;
	}

	public String getTipo() {
		return this.tipo;
	}
	
	public boolean getAntifurto() {
		return this.antifurto;
	}

	public void inserisciAntifurto() {
		this.antifurto=true;
	}
}

class MotorinoImmatricolato extends Motorino{

	
	float maxvelocita;
	String targa;

	public MotorinoImmatricolato(String colore, String tipo, float velocita, String targa, float maxvelocita) {
		super(colore, tipo, velocita);
		this.targa=targa;
		try {
			if(maxvelocita<this.getVelocita())
				throw new velocitabassaException();
			else
				this.maxvelocita=maxvelocita;
		} catch (velocitabassaException e) {
			System.out.println("Valocità troppo bassa ");
		}
	}

	public void getMax() {
		System.out.println("Velocità massima: "+this.maxvelocita);
	}

	@Override
	public float accelera(float a) throws Lucchettoexception {
	try {
		if(this.getAntifurto()==true) {
			if(this.getVelocita()<maxvelocita)
				return this.velocita+a;
			else
				throw new velocitaltaException();
		}
			
		else
			throw new Lucchettoexception();
	} catch (Exception e) {
		System.out.println("Velocità troppo alta");
	}
		return -1;
	}
	
	

}
