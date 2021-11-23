package Es1;

import java.util.ArrayList;
import java.util.Collections;

abstract class Figure implements Comparable<Figure> {
	
	abstract float calcolaArea();
	
	abstract float calcolaPerimetro();
	
	abstract public  String toString();
	
	@Override
	public int compareTo(Figure arg0) {
		return Double.compare(this.calcolaPerimetro(), arg0.calcolaPerimetro());
	}

}

class Rettangolo extends Figure {
	float base;
	float altezza;
	
	Rettangolo(float base, float altezza) {
		
		this.base=base;
		this.altezza=altezza;
	}
	
	@Override
	float calcolaArea() {
		return base*altezza;
	}

	@Override
	float calcolaPerimetro() {
		return 2*base+2*altezza;
	}

	@Override
	public String toString() {
		return "Rettangolo "+this.calcolaPerimetro();
	}
	
}

class Quadrato extends Rettangolo {
	
	Quadrato(float lato) {
		super(lato,lato);
	}
}


class Triangolo extends Figure {

	float base;
	float altezza;
	
	Triangolo(float base, float altezza) {
		this.base=base;
		this.altezza=altezza;
	}
	
	@Override
	float calcolaArea() {
		return base*altezza/2;
	}

	@Override
	float calcolaPerimetro() {
		return 2*altezza+base;
		
	}

	@Override
	public String toString() {
		return "Triangolo: "+this.calcolaPerimetro();
	}
	
}

class Cerchio extends Figure {

	float raggio;
	
	Cerchio(float raggio) {
		this.raggio=raggio;
	}
	
	@Override
	float calcolaArea() {
		return (float) (Math.PI*raggio*raggio);	
	}

	@Override
	float calcolaPerimetro() {
		return (float) (Math.PI*2*raggio);			
	}

	@Override
	public String toString() {
		return "Cerchio"+this.calcolaPerimetro();
	}
	
}

public class Figure_Geometriche {
	public static void main(String[] args) {
		ArrayList<Figure> AL= new ArrayList();
		AL.add(new Rettangolo(5, 6));
		AL.add(new Triangolo(100, 100));
		AL.add(new Quadrato(4));
		AL.add(new Triangolo(5, 4));
		AL.add(new Cerchio(3));
		
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
		
		ordinatriangoli(AL);
	}
	
	public static void ordinatriangoli(ArrayList<Figure> AL) {
		ArrayList<Triangolo> AL1= new ArrayList();
		for(Figure index: AL) {
			if(index instanceof Triangolo) {
				AL1.add((Triangolo) index);
			}
		}
		
		System.out.println(AL1);
		Collections.sort(AL1);
		System.out.println(AL1);
	}
	
	public static void ordinaRettangoli(ArrayList<Figure> AL) { //Costruisco un bubble sorter
		ArrayList<Triangolo> AL1= new ArrayList();
		for(Figure index: AL) {
			if(index instanceof Rettangolo) {
				AL1.add((Triangolo) index);
			}
		}
		
		boolean flag=true;
		do {
			flag=true;
			for(int i=0; i<=AL1.size()-1; i++) {
				if(AL1.get(i).calcolaPerimetro()<AL1.get(i+1).calcolaPerimetro()) {
					Collections.swap(AL1, i, i+1);
				}
			}
		}while(!flag);
		
	}
}
