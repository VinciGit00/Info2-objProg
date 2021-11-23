package Es3;

import java.util.ArrayList;

public class Ospedale {
	String nome;
	ArrayList <Reparti> lreparti;
	
	public Ospedale(String nome) {
		this.nome=nome;
		lreparti= new ArrayList<>();
	}
	
	public void addReparti(Reparti p) {
		if(lreparti.contains(p))
			throw new RuntimeException("Reparto già presente");
		else
			lreparti.add(p);
	}
	
	public void rimuoviREparti(Reparti p) {
		if(!lreparti.contains(p))
			throw new RuntimeException("Reparto inesistente");
		else
			lreparti.remove(p);
	}
	
	public void stampaOspedale() {
		for(Reparti rep: lreparti) {
			System.out.println(rep.toString());
		}
	}
}
