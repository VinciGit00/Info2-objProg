package Es3;
public class Trapezio {
	/*campi
	 *  della classe*/
	float basemaggiore;
	float baseminore;
	float altezza;
	
	/*Costruttori*/
	public Trapezio(float basemaggiore, float baseminore, float altezza) {
		this.basemaggiore= basemaggiore;
		this.baseminore= baseminore;
		this.altezza= altezza;
	}
	
	/*Metodi della classe*/
	
	public void areatrapezio1(){
		float area=(this.basemaggiore+this.baseminore)*this.altezza/2;
		System.out.println("Area: "+area);	
	}
	
	public float getarea(){
		float area;
		area=((this.basemaggiore+this.baseminore)*this.altezza)/2;
		return area;
	}
	
	public  float getperimetro() {
		float perimetro;
		float latino=(this.basemaggiore-this.baseminore)/2;
		float lato= (float) Math.sqrt(Math.pow(this.altezza, 2)+Math.pow(latino, 2));
		perimetro=lato*2+this.basemaggiore+this.baseminore;
		return perimetro;
	}
}
