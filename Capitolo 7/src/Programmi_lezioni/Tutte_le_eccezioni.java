package Programmi_lezioni;

import java.util.EmptyStackException;

public class Tutte_le_eccezioni {

	public static void main(String[] args) {

		try {
			
		} catch(NullPointerException e) { 
			System.out.println("Punta a qualcosa di nullo");
		} catch(ArithmeticException e) {
			System.out.println("Eccezione aritmetica");
		} catch(EmptyStackException e) {
			System.out.println("Punta a qualcosa di nullo");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Fuori dall'indice del vettore");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Fuori dall'indice della stringa");
		} catch(NumberFormatException e) {
			System.out.println("Non hai inserito un numero");
		}
	}

}
