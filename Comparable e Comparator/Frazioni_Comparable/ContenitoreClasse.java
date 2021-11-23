import java.util.ArrayList;
import java.util.Collections;

public class ContenitoreClasse {

	private String nome;
	ArrayList <Fraz> insieme= new ArrayList();
	
	public ContenitoreClasse(String nome) {
		this.nome= nome;
	}
	
	public void addFrazione(Fraz p) {
		insieme.add(p);
	}
	//Non funziona BB
	public void eliminaFrazione(Fraz p) {
			int flag=0;
			for(int i=0; i<=insieme.size()-1; i++) {
				Fraz j=insieme.get(i);
				if(p.compareTo(j)==0){ //Non so come mai ne toglie solo uno
					insieme.remove(i);
					flag=1;
				}
			}
			
			if(flag==0)
				System.out.println("Elemento selezionato inesistente");
	}
	
	public void ordina() {
		Collections.sort(insieme, new Cumpa());
	}
	
	public void stampaFrazioni() {
		for(Fraz p: insieme) {
			System.out.println(p.toString());
		}
	}
}
