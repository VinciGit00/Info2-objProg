package Programmi_in_più;

public class ProvaEccezioni {
	
	public static void main(String[] args) {
		try {//Meccanismo per intercettare le eccezioni
			
			int y= (int)(Math.random()*10); //Genera un numero tra 0 e 1
			int x=10/y;
			System.out.println("Divisore: "+y);
			System.out.println("Risultato della divisione: "+x);
			
			int a[] = {1,2,2,3};
			System.out.println(a[y]);
		} catch(ArithmeticException e) { //Senza il catch se y=0, l'anomalia viene mandata al chiamante fornendo il messaggio d'errore
			System.out.println("Mi spiace, y è zero");	
			//Se c'è il return blocca l'esecuzione del programma
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("Mi spiace, non posso accedere a quella posizione");	
		}catch(Exception e) {
			System.out.println("Errore");	
		}
	}

}
