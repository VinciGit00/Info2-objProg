import java.util.StringTokenizer;

public class StringTokenizerRifatto {

	public static void main(String[] args) {
		
		int n;
		int somma=0;
		
		String s= "18,19,20,21"; //Stringa contente numeri separati da una virgola
		StringTokenizer st= new StringTokenizer(s, ",");
		
		while(st.hasMoreTokens()) //Continua finchè ha ancora token
		{
			n=Integer.parseInt(st.nextToken()); //Trasformo un token in int e poi lo sommo
			somma+=n;
		}
	}

}
