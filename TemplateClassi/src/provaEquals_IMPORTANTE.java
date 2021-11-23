
class Automobile {
	
	String targa;
	
	@Override //Override dell'equals
	public boolean equals (Object obj) { //Il comparator non sostituisce l'equals
		if(obj instanceof Automobile) {
			 return targa.equals(((Automobile)obj).targa);
		}
		else
			return false;
	}
}

public class provaEquals_IMPORTANTE {

	public static void main(String[] args) {
		
		Automobile a1= new Automobile();
		Automobile a2= new Automobile();
		a1.targa="AXC899";
		a2.targa="AXC899";
		//Controllo che puntino allo stesso oggetto
		System.out.println(a1.equals(a2)); //equals � un boolean
		//compareTo � solo per i comparable  
		System.out.println(a1.targa.equals(a2.targa)); //E' equivalente ma nell'altro si passa tutto l'oggetto
	
	}	
}
