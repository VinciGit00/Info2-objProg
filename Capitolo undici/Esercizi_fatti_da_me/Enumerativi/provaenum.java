package Enumerativi;

enum parola {
	MARCO,LUCA,FRANCO;
}


public class provaenum {
	public static void main(String[] args) {
		parola e= parola.FRANCO;
		
		System.out.println(e.ordinal()+" "+e.name()+" "+e.toString()); //name scrive il nome normale
	
	}
}
