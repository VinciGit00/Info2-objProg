
package temaesame;

class Lista<E> {
	
	class NodoLista {
		String dato;
		NodoLista pros;
	}

	NodoLista inizio=null;
	
	//Insert
	void insert(String name) {
		//Utilizzo due puntatori
		
		NodoLista p=inizio;
		NodoLista q=null;
		
		//Lista fatta in ordine inverso
		//Continuo finchè è > di s, se fosse in oridine normale uso il <
		while(p!=null && p.dato.compareToIgnoreCase(name)>0) {
			q=p;
			p=q.pros;
		}
		
		//N.B: all'inizio tutto è nullo
		//Inserisco s tra q e p
		NodoLista temp= new NodoLista();
	
		
		temp.dato=name;
		temp.pros=p;
		q.pros=temp;
		
		if(q==null)
			inizio=temp;
		else
			q.pros= temp;
	
	}
	
	//print 
	void print() {
		System.out.println("[");
		
		for(NodoLista i=inizio; i!=null; i=i.pros) {
			System.out.println(i.dato+", ");
			
		System.out.println("]");

		}
	}

	//Cancellazione
	void cancella(E e) {
		NodoLista p= inizio;
		NodoLista q= null;
		
		while(p!=null && p.dato.compareTo((String) e)<=0) {
			q=p;
			p=q.pros;
		}
		
		if(p==null) 
			System.out.println("");
		else {
			q.pros=p.pros;
		}
		
	}
}


public class VinciguerraMarco {
	
	public static void main(String[] args) {
		Lista nomi= new Lista();
		nomi.insert("Anna");
	}
}
