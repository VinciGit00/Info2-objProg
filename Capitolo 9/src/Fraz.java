
public class Fraz {

	/*CAMPI che sono richiesti per la costruzione della classe*/
	int num;
	int den;

	/*Costruttori della classe*/
	public Fraz(int num, int den){
		/*this intende i campi richiesti da Fraz*/
		this.num= num; //this con il punto
		this.den= den; //this con il punto
	}
	
	/*Segnatura= nomi+tipi*/
	/*Cambia il letterale (tipi dentro le parentesi)*/
	public Fraz(int num){
		this(num, 1); //this con le parentesi si può usare solo alla prima riga dell costruttore
	}
	
	/*Costruttore con le stringhe*/
	public Fraz(String x){
		String[] s= x.split("/"); //s ha le parentesi perchè è un array
		int n= Integer.parseInt(s[0]);
		int d= Integer.parseInt(s[1]);
	}
	
	/*Metodi all'interno della classe*/
	
	public Fraz per(Fraz a){
		int nprod= this.num*a.num;
		int dprod= this.den*a.den;
		return new Fraz(nprod, dprod);
	}
	
	public Fraz diviso(Fraz a)
	{
		int ndiv= this.num*a.num;
		int ddiv= this.den*a.den;
		return new Fraz(ndiv, ddiv);
	}
	
	/*Riscrittura della classe toString*/
	@Override
	public String toString(){
		return "Nominatore: "+this.num+" Denominatore: "+this.den;
	}
	
}

	


