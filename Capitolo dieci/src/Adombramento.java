class Sopra {
	
	int k=1;
	
	@Override 
	public String toString() {
		return String.valueOf(k); //Converte l'int in String
	}
}

class Sotto {
	int k=2;
	
	@Override 
	public String toString() { //Ritorna 2 e poi 1
		return k+" "+super.toString();  //2° metodo per usare il super
	}
			
	
}

public class Adombramento {
	
	public static void main(String[] args) {
		Sotto s= new Sotto();
		System.out.println(s.toString()); 
	}
}
