package ES1;

import Eccezioni.kmsbagliatiException;

public abstract class Telecamera implements Comparable<Telecamera>{
	
	protected int ID;
	private String descrizione;
	private float posizione;
	private static int ntelecamere=0;
	Stato s;
	
	public Telecamera(int num, String d, float km) throws kmsbagliatiException{
		
		try {
			if(num<0)
				throw new RuntimeException();
			else
				this.ID=num;
		} catch(RuntimeException e) {
			System.out.println("Numero non valido");
		}
		
		if(km>200||km<0)
			throw new kmsbagliatiException();
		else
			this.posizione=km;
		this.descrizione=d;
		
		s=Stato.ACCESA;
		ntelecamere++;
	}
	
	public Telecamera() throws kmsbagliatiException {
		this(ntelecamere, "",0);
	}
	
	public boolean ACCENDI() {
		 s=Stato.ACCESA;
		 return true;
	}
	
	public boolean SPEGNI() {
		s=Stato.SPENTA;
		return true;
	}
	
	public boolean BLOCCA() {
		s=Stato.BLOCCATA;
		return true;
	}
	
	
	@Override
	public int compareTo(Telecamera o) {
		return Double.compare(this.posizione,o.posizione );
	}
	
	@Override
	public String  toString() {
		return "Descrizione "+descrizione+" posizione "+this.posizione;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public int getntelecamere() {
		return ntelecamere;
	}
	
	public float getPosizione() {
		return this.posizione;
	}
	
	public boolean isAccesa() {
		return s!=Stato.SPENTA;
	}
}
