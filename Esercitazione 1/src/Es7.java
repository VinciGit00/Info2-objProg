import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es7 {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= new String();
		s=in.readLine("Inserisci una stringa: ");
		
		int l=s.length();
		
		String asterischi= new String("************************************************");
		String spazi= new String("                                                     ");
		
		/*Con il concat*/
		asterischi=asterischi.substring(0,l+4);
		spazi= spazi.substring(0,l+2);
		spazi="*".concat(spazi).concat("*");
		s="*".concat(s).concat("*");
		asterischi="*".concat(asterischi).concat("*");
		
		/*Senza il concat*/
		asterischi=asterischi.substring(0,l+4);
		spazi= spazi.substring(0,l+2);
		spazi="*"+spazi+"*";
		s="*"+s+"*";
		asterischi="*"+asterischi+"*";
		
		out.println(asterischi);
		out.println(spazi);
		out.println(s);
		out.println(spazi);
		out.println(asterischi);

	}

}
