/*Comparable si usa quando si vuole creare una classe comparabile mediante ArrayList*/
public class Country implements Comparable<Country>{
	/*Tipi della classe*/
	private String fName;	
	private double fArea;
	
	/*Costruttore della classe*/
	public Country(String name, double area){
		fName=name;
		fArea=area;
	}
	
	/*Metodi della classe*/
	public String getString(){
		return this.fName;
	}
	
	public double getArea(){
		return this.fArea;
	}
	
	/*Metodo di ritorno della comparazione*/
	@Override
	public int compareTo(Country o) {
		return Double.compare(this.fArea, o.fArea); //Funzionano entrambi allo stesso modo
		
		/*Oppure:*/
		/*if(this.fArea>o.fArea)
			return 1;
		if(this.fArea<o.fArea)
			return -1;
		return 0;*/
	}

}
