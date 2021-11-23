
public class Orario  {
	/*Campi costanti*/
	/*final non può avere modifiche*/
	//private static final String SEPARATORE= ":";
	
	/*Campi non costanti*/
	/*private significache non può essere utilizzato al di fuori della stringa (class A)*/
	private static  String SEPARATORE= ":";
	
	private byte ore;
	private byte minuti;
	
	/*Costruttori*/
	public Orario(int ore, int minuti) {
		this.ore= (byte) ore;
		this.minuti= (byte) minuti;
	}
	
	public Orario(String s) {
		String[] p= s.split(":");
		/*Si può anche mettere il this che converte tutto in un'unica riga*/
		this.ore= (byte) Integer.parseInt(p[0]);
		this.minuti= (byte) Integer.parseInt(p[0]);
	}
	
	/*Orario standard senza input*/
	public Orario() {
		this.ore= 00;
		this.minuti= 00;
	}
	
	/*Metodi della classe*/
	public boolean isMaggiore(Orario o) {
		return ((this.ore+this.minuti*60)>(o.ore+o.minuti*60));
	}
	
	public boolean isMinore(Orario o) {
		return ((this.ore+this.minuti*60)<(o.ore+o.minuti*60));
	}
	
	public int getOre() {
		return this.ore;
	}
	
	public int getMinuti() {
		return this.minuti;
	}
	
	@Override
	public String toString() {
		return ore+"-"+(minuti<10? "0"+minuti: minuti);
	}
	
	public static void main(String[] args) {
		Orario o= new Orario(); //se non mette nulla inizializza solo a valori preimpostati
		Orario o2= new Orario();
		System.out.println(new Orario(12,50));
		Orario.SEPARATORE=":"; //OK, ma sconsigliato
		System.out.println(o);		
	}	
	
}


/*class A{
	Orario o= new Orario();
	public String toString(){
		//System.out.printlno(o.ore); //Errore perchè non si può accedere
	}
}*/