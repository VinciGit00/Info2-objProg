package Es7;
import java.util.Comparator;

public class Pesce implements Comparator<String> { //Compara in base al nome

	private String id;
	private int eta;
	private int profondita;
	
	public Pesce(String id, int eta, int profondita){
		this.id= id;
		this.eta= eta;
		this.profondita= profondita;
	}
	
	public String getid() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "id: "+this.id+" eta: "+this.eta+" profondità: "+this.profondita;
	}

	@Override
	public int compare(String s0, String s1) {
		return s0.compareTo(s1);
	}
}
