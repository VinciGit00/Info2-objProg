import prog.io.ConsoleOutputManager;

public class Studente {
	/*Campi della classe*/
	int matricola;
	String nome;

	/*Campo statico di appoggio*/
	/*Se lo metto privato non può essere modificato da fuori*/
	/*Se non mettessi static prendono tutti 1 come numero studente perchè poi si riazzera*/
	public static int numeroStudentiImmatricolati=0;
	
	Studente(String n) {
		this.nome=n;
		/*Incrementa il numero di studenti immatricolati e poi somma*/
		matricola= ++numeroStudentiImmatricolati;	
	}
	
	@Override
	public String toString() {
		return this.nome+" "+this.matricola; 
	}
	
	/*main*/
	 public static void main(String[] args) {
		ConsoleOutputManager out= new ConsoleOutputManager();
		Studente a= new Studente("Peppino");
		out.println(a);
	}
}
