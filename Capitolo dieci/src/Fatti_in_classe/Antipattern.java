package Fatti_in_classe;
//Cose da non fare quando si definiscono i costruttori
class Persona{
	
	String nome, cognome;
	
	Persona(String n, String c){
		this.nome=n;
		this.cognome=c;
	}
	
	/*Overload del costruttore->si ridefinisce la classe*/
	Persona(String cognome){
		this.cognome= cognome;
		this.nome= " ";  //NO!! Usare il this
		/*Bisogna usare: this.(" ", cognome);*/
	
	}
}
	
class Studente extends Persona{ //Uno studente è anche una persona
		
	int matricola;
	//String nome, cognome; Noooooo, altrimenti avrebbe due nomi e due cognomi
		
	Studente(String n, String c, int m) { //N.B: i costruttori non vengono ereditati
		super(n,c); //Perchè li ha ereditati
		matricola=m; 	
		}
	
		/*Vengono ereditati solo i metodi*/
}


public class Antipattern { //Non fa nulla

	public static void main(String[] args) {
	}

}
