package Stack;

/*Soluzione ricorsiva con i tipi generici*/
public class StackDin <E> {
	
	/*Classe inner/nested*/
	private class Nodo<E> { //Innerclass
		E dato; //Classe dentro la classe-> classe di servizio
		Nodo pros; //Punatatore al prossimo nodo
	}
	
	/*Dichiarazione della variabile*/
	Nodo cima; //Si riferisce al primo nodo dello stack (ultimo ad essere esguito)->oggetto appartenente alla classe StackDin
	
	public StackDin() { //Inizialmente tutto null
		cima=null; //Messa a terra
	}
	
	public void push(E e) { //Inserisce un dato generico
		/*Creo nodo*/
		Nodo nuovoNodo= new Nodo();
		nuovoNodo.dato=e; 
		
		/*Il nuovo nodo è prima della cima attuale*/
		/*Metto il nodo per primo*/
		nuovoNodo.pros=cima;
		cima=nuovoNodo;
	}
	
	public E pop() { //Preleva
		/*Restituisce un dato temporaneo*/
		E temp= (E) cima.dato; //Copia il valore
		cima=cima.pros; //Punta al nodo prima
		return temp;
	}
	
	public boolean isEmpty() {
		return cima==null; //IMPORTANTE
	}
	
	public static void main(String[] args) {
		
		StackDin<String> nomi= new StackDin<String>();
		
		nomi.push("Ciao");
		nomi.push("è");
		nomi.push("tardi");
		
		System.out.println(nomi);
	}
}
