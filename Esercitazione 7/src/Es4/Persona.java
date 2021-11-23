package Es4;

import java.util.ArrayList;

public class Persona {
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
}

class Studente extends Persona {

	private Integer nmatricola;
	private ArrayList <Esame> ESAMI;
	private Double mediavoti;
	
	Studente(String nome, String cognome) {
		super(nome, cognome);
		ESAMI= new ArrayList<>();
	}
	
	public void calcolamedia() {
		int i=0;
		int somma=0;
		
		for(Esame e: ESAMI) {
			somma+=e.getVoto();
			i++;
		}
		
		try {
			mediavoti=(double) (somma/i);
		} catch (ArithmeticException e) {
			System.out.println("Lo studente ha fatto 0 esami ");
		}
	}
	
	public Integer getnMatricola() {
		return nmatricola;
	}

	public Double getMedia() {
		return mediavoti;
	}

	public ArrayList<Esame> getLista() {
		return ESAMI;
	}
	
	public double getTasse(double taxmax, int fascia) {
		try {
			switch(fascia) {
			case '1':
				return taxmax=taxmax*0.5;
			case '2':
				return taxmax-=taxmax*0.35;
			case '3':
				return taxmax-=taxmax*0.25;
			case '4':
				return taxmax-=taxmax*0.10;
			case '5':
				return taxmax=taxmax;
			default:
				throw new RuntimeException();
		}
		} catch (Exception e) {
			System.out.println("Fascia inserita non valida");
		}
		return 0;
	}
	
	public double getTasse(double taxmax) {
		if(mediavoti==30)
			return taxmax-=taxmax*0.1;
		else if(mediavoti==29)
			return taxmax-=taxmax*0.08;
		else if(mediavoti==28)
			return taxmax-=taxmax*0.06;
		else if(mediavoti==27)
			return taxmax-=taxmax*0.04;

		return taxmax;
	}
	
	public void addEsame(Esame e) throws EsamegiamessoException {
		if(ESAMI.contains(e))
			throw new EsamegiamessoException();
		else 
			ESAMI.add(e);
	}
	
}
