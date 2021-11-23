package Pack1;

public class MachineSamePackage extends Machine{
	
	public void foo() {
		volume=10;
		altezza=20; //Per vedere altrzza bisogna estendere machine
		//peso=9; non accessibile perchè è private
	}
}

class noMachine {
	private void foo(Machine m) {
		m.volume=10;
		m.altezza=20;
	}
}