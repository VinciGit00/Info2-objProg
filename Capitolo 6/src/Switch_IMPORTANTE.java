
public class Switch_IMPORTANTE {

	public static void main(String[] args) {
		
		/*Va sempre inizializzato il valore x*/
		int x=4;
		
		switch (x) {
		/*Se non c'è il break non esce dallo switch*/
		case 4: x++; //Entra in tutti gli switch successivi
		case 5: x++;
		case 6: x++; break; 
		
		}
		
		System.out.println(x);
	}

}
