package Fatti_in_classe;

class A1 {
	 void foo() throws IndexOutOfBoundsException, RuntimeException {
		 
	 }
	 
}

class B1 extends A1 {
	void foo() throws IndexOutOfBoundsException, RuntimeException {
		
	}
}

class Cl1 extends A1 {
	void foo() throws IndexOutOfBoundsException {
		
	}
}

class D1 extends A1 {
	void foo() throws RuntimeException {
		
	}
}
//Non si pu� fare perch� si deve andare dall'errore pi� generale a quella pi� singolare
/*class E extends A1 {
	E(int h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

	void foo() throws Exception {
		
	}
}*/


public class OverrideEccezioni {

}
