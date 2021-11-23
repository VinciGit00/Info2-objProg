
public class Boolean {

	public static void main(String[] args) {
		
		int i=0;
		boolean b=true; //Boolean può essere o true o false
		
		while(!b) /*N.B: finchè non diventa negativo non esce dal ciclo*/
		{
			i++;
			if(i==10)
				b=false;
		}
	}

}
