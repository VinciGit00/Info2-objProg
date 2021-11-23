package Stack;

class PilaVuotaException extends RuntimeException {
	
}

public class Stack <E>{
	
	final static int N_ELEMENTI=10;
	
	//E[] data;-> non si può fare in Java
	Object [] data; //Utilizzo un array
	int primaposizioneLibera;
	
	public Stack() {
		data= new Object[N_ELEMENTI];
		primaposizioneLibera=0;
	}
	
	public void push(E e) {
		
		if(primaposizioneLibera==data.length) {
			/*Allarghiamo l'array per lo storage*/
			Object [] newData= new Object[data.length+N_ELEMENTI];
			
			//Copia l'array vecchio in un array nuovo per aumentare la grandezza della pila
			System.out.println("Sto allargando la pila");
			for(int i=0; i<data.length; i++) {
				newData[i]= data[i];
			}
			
			/*System.out.println("La pila è piena, non puoi inserire altri elementi");
			return;*/
		}
			
		data[primaposizioneLibera]=e;
		primaposizioneLibera++;
	}
	
	public E pop() { //Restituisce un tipo E
		if(isEmpty()) //Vedi riga 33
			throw new PilaVuotaException();
			
		primaposizioneLibera--;
		return (E) data[primaposizioneLibera];
	}
	
	public boolean isEmpty() { //IMPORTANTE
		return primaposizioneLibera==0;
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> numeristack= new Stack<Integer>();

		numeristack.push(15);
		numeristack.push(5);
		
		try {
			numeristack.pop();
		} catch (PilaVuotaException e) {
			System.out.println("La pila è vuota");
		}
	}
}
