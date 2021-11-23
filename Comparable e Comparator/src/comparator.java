import java.util.Comparator;

class Countri{
	private String fName;
	private double fArea;
	
	public Countri(String fName,  double fArea) {
		this.fName=fName;
		this.fArea=fArea;
	}
	
	public double getArea() {
		return this.fArea;
	}
	
	
	public void stampacountri() {
		System.out.println("-Nome: "+this.getName()+" Area: "+this.getArea());
	}
	
	/*Mi permette di restituire il nome nel comparator*/
	public String getName() {
		return this.fName;
	}
}

public class comparator implements Comparator<Countri> {

	@Override
	public int compare(Countri o1, Countri o2) {
		String name1= o1.getName();
		String name2= o2.getName();
		return name1.compareTo(name2); //Da aggiungere un compareTo
	}

}
