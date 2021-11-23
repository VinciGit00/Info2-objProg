package Es2;

public class Parallelogramma {
	
	float dmaggiore;
	float dminore;
	float angolo;

	public Parallelogramma(float dmaggiore,float dminore,float angolo){
		this.dmaggiore= dmaggiore;
		this.dminore= dminore;
		this.angolo= angolo;
	}
	
	public float altezza(){
		float h=(float) (Math.sin(angolo)*this.dmaggiore);
		return h;
	}
	
	public float base() {
		float h=this.altezza();
		float b=(float) ((float) Math.sqrt(Math.pow(this.dmaggiore, 2)-Math.pow(h,2))-Math.sqrt(Math.pow(this.dminore, 2)-Math.pow(h,2)))/2;
		return b;
	}
	
	public float lato() {
		float l=0;
		return l;
	}
	
	public float area() {
		float a=this.base()*this.altezza();
		return a;
	}
	
	public float perimetro() {
		float p=this.base()*2+this.lato()*2;
		return p;
	}
	
	@Override
	public String toString() {
		return "Diagonale maggiore: "+this.dmaggiore+"Diagonale minore: "+this.dminore;
	}
}
