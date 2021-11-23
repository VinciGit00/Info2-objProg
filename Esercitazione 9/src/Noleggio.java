import javafx.scene.chart.PieChart.Data;

public abstract class Noleggio {
	
	private static final String alfabeto="abcdefgilmonpqrstuvz0123456789";
	private static int Rand;
	protected static int tempo;
	
	private String targa;
	private Data inizio;
	private Data fine;  
	private Auto car;
	protected Double costo;
	protected Auto au;
	
	public Noleggio(Data inizio, Data fine, Auto au) {
		
		this.inizio=inizio;
		this.fine=fine;
		
		for(int i=0; i<10; i++) {
			Rand=(int)(Math.random()*alfabeto.length());
			char lettera= alfabeto.charAt(Rand);
			this.targa=targa+lettera;
		}
		
		this.au=au;
		//tempo=fine.quantoManca(inizio);
	}
		
	public Noleggio(Data inizio, Data fine, String nome, Auto au) {
		
		try {
			this.inizio=inizio;
			this.fine=fine;
			
			if(nome.length()>10) {
				throw new RuntimeException();
			}
			
			this.targa=nome;
			this.au=au;
		} catch (RuntimeException e) {
			System.out.println("Id inserito non valido ");
		}
	}
	
	public abstract void calcolaCosto() throws CategoriaSbagliataException, dataSbagliataException;
	
	public abstract String toString();
	
	public Data getInizio() {
		return this.inizio;
	}
	
	public Data getFine() {
		return this.fine;
	}
}
