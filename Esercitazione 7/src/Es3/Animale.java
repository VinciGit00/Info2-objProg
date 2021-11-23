package Es3;

public class Animale { 
	private String nome; 
	protected Animale(String s){ nome = s; }
	protected String comeTiChiami() { return nome; } 
	protected void parla(){} 
	protected void incontra(Animale a) { 
		System.out.println(nome+"<Ciao>"+a.nome);
		parla();
	} 
}

class Topo extends Animale {

	public Topo(String s) {
		super(s);
	}
	
	@Override
	protected void parla(){
		System.out.println("Squit");
	}
	
	@Override
	protected void incontra(Animale a) { 
		if(a instanceof Gatto) 
			System.out.println("Aiuto");
		else
			super.incontra(a);
	} 
	
}

class Gatto extends Animale {
	public Gatto(String s) {
		super(s);
	}
	
	@Override
	protected void parla(){
		System.out.println("Miao");
	}
	
	@Override
	protected void incontra(Animale a) { 
		if(a instanceof Topo) 
			System.out.println("Mo' te magno");
		else
			super.incontra(a);
	} 
}

class Mucca extends Animale {
	public Mucca(String s) {
		super(s);
	}
	
	@Override
	protected void parla(){
		System.out.println("Muuuuu");
	}
	
}