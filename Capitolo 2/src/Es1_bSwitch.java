/*Es 1 rifatto con gli switch*/
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1_bSwitch {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		String s= in.readLine("Inserisci una stringa da analizzare: ");
		s=s.toLowerCase();
		int l= s.length();
		
		char lettera;
		
		for(int i=0; i<l; i++)
		{
			lettera=s.charAt(i);
			boolean b= isVocale(lettera);
		}
	}
	
	 public static boolean isVocale(char c)
	    {
	        switch(c)
	        {
	            case 'a':{return true;}	  
	            case 'e':{return true;}
	            case 'i':{return true;}
	            case 'o':{return true;}
	            case 'u':{return true;}
	            default:
	            {
	                return false;
	            }
	        }
	    }

}
