package Pratiche;

import ClassiEnum.Grado;
import ClassiEnum.Stati;
import Cliente.Cliente;

public class Penale extends Pratiche {

	private Grado g;
	
	public Penale(Cliente cl, String descrizione, String data, int numeroore, int priorità, Stati s, Grado g) { //Sistemare
		super(cl, descrizione ,data, numeroore, priorità,s);
		this.g=g;
	}

	
	/**
	 * Restituisce il grado penale
	 * @return
	 */
	public Grado getGrado() {
		return g;
	}
	
	@Override
	public String toString() {
		return "Cliente: "+cl.toString()+" numero ore: "+this.numeroore+" descrizione: "+getDescrizione()+" data: "+this.getdata()+" grado: "+this.getGrado();
	}

	@Override
	public float Calcolacosto() {
		return g.number*100*this.numeroore;
	}

}
