package Es1;

import java.util.ArrayList;

public class Volo {
	
	public static char numeroprogressivo=0;
	String ID;
	String partenza;
	String arrivo;
	int postilibprima;
	int postilibecon;
	
	ArrayList <Passeggero> lpass;
	
	public Volo(String ID, String partenza, String arrivo, int postilibprima, int postilibecon) {
		this.ID=ID+(++numeroprogressivo);
		this.partenza=partenza;
		this.arrivo=arrivo;
		this.postilibprima=postilibprima;
		this.postilibecon=postilibecon;
		lpass= new ArrayList<>();
	}
	
	public Volo(String ID, String partenza, String arrivo) {
		this(ID, partenza, arrivo, 180, 180);
	}
	
	public void aggiungiPasseggeri(Passeggero pass) throws ValorevuotoException{
		if(pass==null)
			throw new ValorevuotoException();
		if(lpass.contains(pass))
			throw new ContenitoreEsistente();
		if((pass.c.equals("P") && this.postilibprima>0) ||(pass.c.equals("E") && postilibecon>0 )) 
			lpass.add(pass);
	}
	
	public void rimuoviPasseggeri(String idb)  {
		for(int i=0; i<lpass.size(); i++) {
			Passeggero temp= lpass.get(i);
			if(temp.IdBiglietto.equals(idb)) {
				lpass.remove(i);
			}
		}
	}
	
	public Double calcolaConto() {
		
		Double conto=(double) 0;
		for(int i=0; i<lpass.size(); i++) {
			conto+= lpass.get(i).prezzo;
		}
		return conto;
	}
	
	public void stampaLista() {
		for(Passeggero p: lpass) {
			System.out.println(p.toString());
		}
	}
	
}
