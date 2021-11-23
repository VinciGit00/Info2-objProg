import javafx.scene.chart.PieChart.Data;

public class Giornaliero extends Noleggio{

	public Giornaliero(Data inizio, Data fine, Auto au) {
		super(inizio, fine, au);
	}

	@Override
	public void calcolaCosto() throws CategoriaSbagliataException, dataSbagliataException {
		if(tempo>1)
			throw new dataSbagliataException();
		if(!au.cat.equals(categoria.ECONOMICA))
			throw new CategoriaSbagliataException();
	
		this.costo=50.0;
		
	}

	@Override
	public String toString() {
		return "Inizio"+this.getInizio()+" fine: "+this.getFine();
	
	}

}
