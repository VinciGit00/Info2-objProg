import javafx.scene.chart.PieChart.Data;

public class MediaDurata extends Noleggio {

	public MediaDurata(Data inizio, Data fine, Auto au) throws dataSbagliataException {
		super(inizio, fine, au);
		if(tempo<1)
			throw new dataSbagliataException();
	}

	@Override
	public void calcolaCosto() {
		
		
			if(au.cat.equals(categoria.ECONOMICA))
				this.costo=(double) (15*tempo);
			else if(au.cat.equals(categoria.COMPATTA))
				this.costo=(double) (20*tempo);
			else if(au.cat.equals(categoria.LUSSO))
				this.costo=(double) (50*tempo);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
