
public class Main {
	public static void main(String[] args) {
		
		Acquario acq= new Acquario("Acquario");
		acq.add(new Pesciolini(5));
		acq.add(new Pesciolini(6));
		acq.add(new Pesciolini(52));
		acq.add(new Pesciolini(2));
		System.out.println("Lista non ordinata:");
		acq.stampa();
		acq.ordina();
		System.out.println("--------------------");
		System.out.println("Lista ordinata:");
		acq.stampa();
	}
}
