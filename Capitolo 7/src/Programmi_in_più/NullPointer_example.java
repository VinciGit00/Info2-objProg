package Programmi_in_più;

import java.util.ArrayList;

class Studenti{
	ArrayList<Integer> voti= new ArrayList(); //Campo tutto nullo
}


public class NullPointer_example {

	public static void main(String[] args) {
		Studenti bravo= new Studenti();
		bravo.voti.add(30); 
		
		try {
			Integer i= null;
			Integer x= i*20; //Null pointer exception
		} catch (NullPointerException e) {
			System.out.println("Punta a qualcosa di nullo");
		}
	}

}
