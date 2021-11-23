package Es1;
import prog.io.ConsoleOutputManager;
/*Il main è da fare a parte*/
public class ContoCorrenteMain {
	
	public static void main(String[] args) {
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		float k=1050;
		int n= 105405;
		String nome="Marco";
		ContoCorrente cont= new ContoCorrente(k, n, nome);
		
		cont.versa(50);
		cont.preleva(60);
		out.println(cont);
	}
}
