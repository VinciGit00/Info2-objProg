package EserciziB;

class Persona1 implements Comparable<Persona1> {

	String nome;
	
	Persona1(String nome) {
		this.nome=nome;
	}
	
	@Override
	public int compareTo(Persona1 o) {
		return nome.compareTo(o.nome);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}


public class ListaPersone {

	NodoLista inizio;
	
	class NodoLista {
		Persona1 dato;
		NodoLista pros;
	}
	
	
	public ListaPersone () {
		inizio=null;
	}
	
	public void insert(Persona1 p) {
		NodoLista p1=inizio;
		NodoLista q1=null;
		
		while(p1!=null && p1.dato.compareTo(p)<0 ) {
			q1=p1;
			p1=p1.pros;
		}
		
		NodoLista temp= new NodoLista();
		temp.dato=p;
		temp.pros=p1;//Salvo la prossima posizione
		
		if(q1==null) 
			inizio=temp;
		else
			q1.pros=temp;
	
	}
	
	public void print () {
		for(NodoLista p=inizio; p!=null ; p=p.pros) {
			System.out.print(p.dato+" ");
		}
	}
	
	public int countNomeIniziaconA() {
		int count=0;
		
		for(NodoLista p=inizio; p!=null ; p=p.pros) { //Serve per scorrere la lista ordinata
			String lettera= p.dato.nome.substring(0);
			if(lettera.equals("A")) {
				count++;
			}
		
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		ListaPersone p= new ListaPersone();
		p.insert(new Persona1("Franco"));
		p.insert(new Persona1("A"));
		p.print();
		System.out.println(p.countNomeIniziaconA());
	}
}
