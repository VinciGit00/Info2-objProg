package Azienda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Stud {
	
	private String cognome;
	private String nome;
	private ArrayList <Integer> voti; //Posso mettere Int o Integer nei simboli
	
	public Stud(String cognome, String nome) {
		this.cognome= cognome;
		this.nome=nome;
		voti= new ArrayList<>();
	}
	
	public String getCognome() {
		return this.cognome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void aggiungiVoto(int voto) {
		if(voto<0 ||voto>30)
			System.out.println("Voto non valido");
		else
			voti.add(voto);
	}

	public float calcolaMedia() {
		float media=0;
		int i=0;
		for(int index: voti) {
			media+=index;
			i++;
		}
		media/=i;
		return media;
	}
	
	public String toString() {
		return "Cognome: "+this.cognome+" nome: "+this.nome+" Voti: "+voti;
	}
}

class comparatorByName implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
		return o1.getCognome().compareTo(o2.getCognome());
	}
}