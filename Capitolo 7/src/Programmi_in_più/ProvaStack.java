package Programmi_in_più;

import java.util.EmptyStackException;
import java.util.Stack;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class ProvaStack {

	public static void main(String[] args) {
		ConsoleInputManager in= new ConsoleInputManager();
		ConsoleOutputManager out= new ConsoleOutputManager();
		
		Stack<Integer> s= new Stack<>();
		while(true) {
			try {
				out.println("Inserisci 0 per far finire");
				int v=in.readInt("Inserisci un numero");
				s.push(v);
			} catch(NumberFormatException e) {
				out.println("Non hai inserito un numero "); 
				
			}
		}
	}

}
