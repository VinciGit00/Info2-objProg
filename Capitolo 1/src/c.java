
public class c {
	class Felino
	{
	   //classe Felino
	}
	 
	class Gatto extends Felino
	{
	   //classe Gatto
	}
	
	public static void main(String[] args) {
		char c = 'a';
		int i = 65;
		byte b = 66;
		
			//c = i; 
			c = (char)i;
			i = c;
			//c = b; 
			c = (char)b; 
			//b = c; 
			
			 //Felino f = new Felino();
		     //Gatto g = (Gatto)f;
	}								
	
}
