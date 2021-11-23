package EserciziB;

class Persona implements Comparable<Persona>{
	String nome;

	public Persona(String nome) {
		this.nome=nome;
	}
	
	@Override
	public int compareTo(Persona o) {
		return nome.compareTo(o.nome);
	}
}
//Albero non generico
public class AlberoPersone {

	NodoAlbero root;
	
	class NodoAlbero {
		Persona dato;
		AlberoPersone sx, dx;
	}
	
	public AlberoPersone() {
		root=null;
	}
	
	public void insert(Persona p) {
		if(root==null) {
			root= new NodoAlbero();
			root.dato=p;
		} else {
			if(root.dato.compareTo(p)<0)
				root.dx.insert(p);
			else
				root.sx.insert(p);
		}
	}
	
	public void print() {
		if(root!=null) {
			root.sx.print();
			System.out.println(root.dato);
			root.dx.print();
		}
	}
		
	public static void main(String[] args) {
		AlberoPersone ap= new AlberoPersone();
		ap.insert(new Persona("Marco"));
	}
}
