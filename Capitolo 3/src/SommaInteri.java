import java.util.StringTokenizer;

public class SommaInteri {

	public static void main(String[] args) {
		
		int somma=0;
		String s="5,7,9,10"; //Valori in in string separati l'uno dall'altro mediante una virgola, ognuno di essi è un token
		
		StringTokenizer st= new StringTokenizer(s,",");
		
		while(st.hasMoreTokens())
		{
			int n= Integer.parseInt(st.nextToken()); //Converte in int il singolo token
			somma+=n; //Somma il token
		}
		
	}

}
