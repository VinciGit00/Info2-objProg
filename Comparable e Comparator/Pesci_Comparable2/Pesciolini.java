
public class Pesciolini implements Comparable<Pesciolini>{
	private int ID;
	
	public Pesciolini(int ID) {
		this.ID=ID;
	}
	
	public int getID() {
		return this.ID;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.ID;
	}

	@Override
	public int compareTo(Pesciolini o) {
		return Double.compare(this.ID, o.ID);
	}
}
