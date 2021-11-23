package Fatti_in_classe;

class C {
	int m(int a) {return 0;}
}

class C1 extends C{
	static int m(float d) {return 2;}
}

class C2 extends C{
	int m(int a) {return 1;}
}

public class OverloadvsOverride {
	
	public static void main(String[] args) {
		C c= new C1();
		System.out.println(C1.m(3.4f));
		//System.out.println(C1.m(2));
	}
}
