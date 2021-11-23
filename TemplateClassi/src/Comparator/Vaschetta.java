package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vaschetta {
	private String nome;
	ArrayList <Pescetto> vas= new ArrayList();

	public Vaschetta(String nome) {
		this.nome=nome;
	}
	
	public void add(Pescetto j) {
		vas.add(j);
	}
	
	public void ordina() {
		Collections.sort(vas, new ComparatorByName());
	}
	
	public void stampa() {
		for(Pescetto p: vas) {
			System.out.println(p.toString());
		}
	}
}