package ProvaTemadesame;

import java.util.ArrayList;
import java.util.Collections;

public class Prova {
	
	public static void main(String[] args) {
		ArrayList<Persona> pers= new ArrayList<>();
		
		Persona p1=	 new Persona("Marco", "Vinciguerra", 20);
		
		Persona p2=	 new Persona("Franco", "Ranghetti", 80);
		
		Persona p3=	 new Persona("Mauro", "Ranghetti", 40);
		pers.add(p1);
		pers.add(p2);
		pers.add(p3);
		
		System.out.println(pers.toString());
		
		ordina(pers);
		
		System.out.println(pers.toString());
		
		ricercaDicotomica(pers, p3);
		
	}
	
	public static void ordina(ArrayList<Persona> pers) {
		boolean flag=true;
		do {
			flag=true;
			for(int i=0; i<pers.size()-1; i++) {
				if(pers.get(i).getCognome().compareTo(pers.get(i+1).getCognome())>0) {
					Collections.swap(pers, i, i+1);
					flag=false;
				}
			}
			
		}while(!flag);
	}
	
	public static void ricercaDicotomica(ArrayList<Persona> pers, Persona p) {
		int i=0;
		int j=pers.size()-1;

		while(i<=j) {
			int m=(i+j)/2;
			if(pers.get(m).getCognome().compareTo(p.getCognome())==0 && pers.get(i).getNome().compareTo(p.getCognome())==0)
				System.out.println("Trovato");
			if(pers.get(m).getCognome().compareTo(p.getCognome())<0)
				i=m+1;
			else
				j=m-1;
		}
	
	}
}
