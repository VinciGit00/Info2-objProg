package Aeroporto;
public class Aereo extends Thread {
	Aeroportoif A;
	String ID;
	
	public Aereo(Aeroportoif A, String ID) {
		this.A=A;
		this.ID=ID;
	}
	
	public void run() {
		
		while(true) {
			A.richiestaAtterraggio(ID);
			try {
				sleep((int) (Math.random()*1000)); //Simulo l'atterraggio + la permanenza nel gate
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			A.liberaPista();
			try {
				sleep((int) (Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
}
