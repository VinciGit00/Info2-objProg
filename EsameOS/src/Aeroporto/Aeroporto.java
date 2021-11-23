package Aeroporto;

public class Aeroporto implements Aeroportoif {

	private static final int capienzamax=3;
	
	int gateliberi;
	String aereoinPista;
	int aereiAttesa;
	
	public Aeroporto() {
		gateliberi=capienzamax;
		aereoinPista="Pista vuota"; //Pista inizialmente vuota
		aereiAttesa=0; //0 aerei in attesa all'inizio
	}
	
	@Override
	public synchronized void richiestaAtterraggio(String idaeromobile) {
		aereiAttesa++;
		while(gateliberi<=0) {//Fase di attesa di un gate libero
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		aereiAttesa--;
		
		aereoinPista=idaeromobile; //Il nome dell'aereo del gate viene inserito in una String
		

		System.out.println("Un aereo sta entrando nella pista, gate liberi: "+this.gateliberi+", gate occupati: "+(capienzamax-gateliberi));

		gateliberi--;	
	}

	@Override
	public synchronized void liberaPista() { //Procedura di liberamento del gate
		gateliberi++;
		
		System.out.println("Un aereo sta uscendo nella pista, gate liberi: "+this.gateliberi+", gate occupati: "+(capienzamax-gateliberi));
	
		if(gateliberi>0|| aereiAttesa>0)
			notify(); //Solo un aereo per volta può entrare, quindi ne avviso solamente uno
	}

}
