import java.util.Comparator;

public class Fraz implements Comparable<Fraz>{
	private int num;
	private int den;
	
	public Fraz(int num, int den) {
		this.num= num;
		this.den= den;
	}
	
	public int getNum(){
		return this.num;
	}
	
	public int getDen(){
		return this.den;
	}
	
	@Override
	public String toString() {
		return "Numeratore: "+this.getNum()+" denominatore: "+this.getDen();
	}

	@Override
	public int compareTo(Fraz o1) {
		return Double.compare(this.num*o1.den, o1.num*this.den);
	}
}

class Cumpa implements Comparator<Fraz>{
	@Override
	public int compare(Fraz o1, Fraz o2) {
		return Double.compare(o1.getNum()/o1.getDen(), o2.getNum()/o2.getDen());
	}
	
}