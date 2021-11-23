import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

import prog.utili.SequenzaOrdinata;

/*Voglio ordinare anche per il nome*/
/*Con i Vector e gli Arraylist si usa Comprator*/
class ComparatorPerNome implements Comparator <Persona>{ //Ordina in base a un valore alfabetico

	//singleton
	static final ComparatorPerNome instance= new ComparatorPerNome();
	
	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.nome.compareTo(o2.nome);
	}
}

/*Con le sequenze ordinate si Comparable */
public class Persona implements Comparable<Persona>{ //Ordina in base a un valore numerico
	
	/*Campi della classe*/
	double eta;
	String nome;
	
	/*Costruttori dei metodi*/
	public Persona(double eta, String nome) {
		this.eta= eta;
		this.nome= nome;
	}
	
	@Override
	public String toString() {

		return nome+"->"+eta;
	}

	/*IMPORTANTE*/
	/*Serve per fare i confronti*/
	public int compareTo(Persona o){
		//Se this.eta <o.eta return <0 (ad esempio +1)
		//Se this.eta ==o.eta return 0
		//Se this.eta >o.eta return >0
		return Double.compare(this.eta, o.eta);
	}
		
	/*main*/
	public static void main(String[] args) {
		Persona a= new Persona(40, "Sergio");
		Persona b= new Persona(50, "Mario");
		Persona c= new Persona(40.1, "Giovanni");
		
		/*Con le sequenza ordinata utilizzo l'implements comparable*/
		SequenzaOrdinata<Persona> amici= new SequenzaOrdinata();
		amici.add(a);
		amici.add(b);
		amici.add(c);
		
		/*Con i Vector*/
		Vector<Persona> amici2= new Vector();
		amici2.add(a);
		amici2.add(b);
		amici2.add(c);
		/*Confronta in base all'eta*/
		/*sort si usa per i Vector e per gli Arraylist*/
		Collections.sort(amici2);
		
		/*Voglio confrontare per nome*/
		//Uso il comparator
		/*sort si usa per i Vector e per gli Arraylist*/
		//Collection.sort(Amici2, New ComparatorPerNome());
		
		/*Faccio una mescolatura*/
		Collections.shuffle(amici2); //Si può usare solo con i Vector e gli Arraylist
	}

}
