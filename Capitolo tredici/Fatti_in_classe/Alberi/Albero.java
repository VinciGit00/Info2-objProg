package Alberi;

//Albero parametrico con metodi generi
public class Albero<E extends Comparable <E>> {

	Nodoalbero root;
	
	//Radice + un albero a sx e un albero a dx-> Nodo dell'albero
	class Nodoalbero {
		E dato;
		Albero<E> sx, dx;
	}
	
	public Albero() {
		root=null; //Inizializzato a null inizialmente 
	}
	
	//Inserimento in un albero
	public void insert(E e) {
		//Se l'albero è vuoto, inserisci direttamente qui
		if(root==null) {
			System.out.println("Albero vuoto, inserisco qui");
			root= new Nodoalbero();
			root.dato=e;
			root.sx= new Albero<>(); //sx e dx sono vuoti
			root.dx= new Albero<>();

		} else { //Cerco una posizione dove mettere l'elemento
			if(e.compareTo(root.dato)<0) {
				
				System.out.println("Inserisco a sx");
				root.sx.insert(e);
			} else { //Se è uguale inserisco a destra
				
				System.out.println("Inserisco a dx");
				root.dx.insert(e);
			}
		}	
	}
	
	public boolean trova(E e) {
	
		if(root==null) { //IMP
			return false;

		} else { //Cerco una posizione dove mettere l'elemento
			int cmp=root.dato.compareTo(e);
			
			if(cmp==0)
				return true;
			else if(cmp<0)
				return root.dx.trova(e);
			else
				return root.sx.trova(e);
		}
	}
	
	
	//Stampa in ordine-> chiamata ricorsiva
	void stampa() {
		if(root!=null) {
			root.sx.stampa();
			System.out.println(root.dato);
			root.dx.stampa();
		}
		
	}
	
	public static void main(String[] args) {
		
		Albero<Integer> numeri= new Albero<Integer>();
		
		numeri.insert(4);
		numeri.insert(10);
		
		numeri.stampa();
		
		System.out.println(numeri.trova(10));
	
	}
}
