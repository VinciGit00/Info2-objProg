import java.util.Comparator;

public class Pesci2 implements Comparator<Pesci2>{
	String ID;
	String name;
	
	public Pesci2(String ID, String name) {
		this.ID=ID;
		this.name= name;
	}
	
	public void stampa() {
		System.out.println("ID: "+ID+" Nome: "+name);
	}

	@Override
	public int compare(Pesci2 o1, Pesci2 o2) {
		return o1.name.compareTo(o2.name);
	}

}
