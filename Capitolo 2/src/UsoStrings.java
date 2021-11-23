import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class UsoStrings {

	public static void main(String[] args) {
		
		/*Creazione degli oggetti*/
		ConsoleOutputManager out= new ConsoleOutputManager();

		
		String s= new String("Pippo");
		String s4= new String("pizza");

		/*Metodo lenght*/
		int l= s.length();
		
		/*toUpperCase, tutti i caratteri maiuscoli*/
		s=s.toUpperCase(); //Cambia l'oggetto a cui fa riferimento, l'altro oggetto poi viene preso dal garbage collector
		
		/*toLowerCase,0 tutti i caratteri minuscoli*/
		s=s.toLowerCase(); //Cambia l'oggetto a cui fa riferimento, l'altro oggetto poi viene preso dal garbage collector
		
		/*Metodo concat()*/
		String s3= new String();
		s3=s.concat(s4); //Unisce due stringhe
		/*Metodo alternativo senza usare la concatenazione*/
		s3=s+s4;
		
		/*Metodo substring()*/
		out.println(s.substring(0,3)); //Ritaglia le stringhe ma solo per la stampa, la stringa non viene modificata
		/*Metodo alternativo*/
		s=s3.substring(0, 3);
		
		StringBuffer db= new StringBuffer("iii");//Non utilizzarlo mai
		db.append("jjjj"); //è come un concat ma crea un oggetto, concat invece modifica l'oggetto
		
		/*Meglio utilizzare il costruttore perchè crea sempre un oggetto, nel secondo metodo non è detto che venga creato l'oggetto*/
		String s1= new String("ciao"); //Utilizzo il costruttore perchè così crea sempre un oggetto, altrimenti non sempre lo crea
		/*Oppure*/
		String s2= new String("Ciao");
		
		String a=null; //null significa che non contiene nulla (stringa vuota)
		out.println(a.toLowerCase()); //Provoca un errore perchè a=null
		
		/*Math. è una classe che utilizza metodi statici*/
		out.println(Math.cos(Math.PI));
		
	}

}
