package Es3;

public class Main {
	public static void main(String[] args) {
	
		Animale m= new Animale("Mucca");
		
		Topo t= new Topo("Mickey mouse");
		
		Gatto g= new Gatto("Silvestro");
		
		t.incontra(g);
		g.incontra(t);
	}
}
