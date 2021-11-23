package Pratiche;

import ClassiEnum.Stati;
import Cliente.Cliente;

public class Conciliazione extends Pratiche{

	public Conciliazione(Cliente cl, String descrizione, String data, int numeroore, int priorità, Stati s) { //Sistemare
		super(cl, descrizione ,data, numeroore, priorità,s);
	}

	@Override
	public String toString() {
		return "Cliente: "+cl.toString()+" numero ore: "+this.numeroore+" descrizione: "+getDescrizione()+" data: "+this.getdata();
	}

	@Override
	public float Calcolacosto() {
		return 120*this.numeroore;
	}


}
