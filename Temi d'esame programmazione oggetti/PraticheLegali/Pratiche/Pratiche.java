package Pratiche;

import ClassiEnum.Stati;
import Cliente.Cliente;

public abstract class Pratiche implements Comparable<Pratiche> {

	/**
	 * Contatore degli ID aumenta in automatico
	 */
	private static int contatore=0;
	
	protected Cliente cl;
	private  String descrizione;
	private String data;
	protected int ID;
	protected int numeroore;
	public int priorità;
	protected Stati s;
	
	/**
	 * Costruttore principale comune a tutte le classi
	 * @param cl
	 * @param descrizione
	 * @param data
	 * @param numeroore
	 */
	public Pratiche(Cliente cl, String descrizione, String data, int numeroore, int priorità, Stati s) {
		this.cl=cl;
		this.descrizione=descrizione;
		this.data=data;
		this.ID=contatore++;
		this.numeroore=numeroore;
		this.priorità= priorità;
		this.s=s;
	}
	
	/**
	 * Overload dei costruttori
	 * @param cl
	 * @param data
	 * @param numeroore
	 */
	public Pratiche( Cliente cl, String data, int numeroore, Stati s) {
		this(cl, "Nessuna descrizione", data,  numeroore, 1000, s);
	}
	
	public Pratiche( Cliente cl, String data, Stati s) {
		this(cl, "Nessuna descrizione", data,  100, 1000, s);
	}
	
	/**
	 * Restituisce una stringa che rappresenta lq pratica
	 */
	public abstract String toString();

	/**
	 * Calcola il singolo costo di una pratica
	 * @return
	 */
	public abstract float Calcolacosto();

	public String getDescrizione() {
		return this.descrizione;
	}
	
	public String getdata() {
		return this.data;
	}
	
	@Override
	public int compareTo(Pratiche arg0) {
		return Double.compare(this.Calcolacosto(), arg0.Calcolacosto());
	}
	
	/**
	 * Serve per controllare che non ci siano due pratiche uguali
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pratiche)
			return ID==(((Pratiche)obj).ID);
		else
			return false;
	}
}
