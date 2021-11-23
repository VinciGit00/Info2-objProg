import javafx.scene.chart.PieChart.Data;

public class ClienteAbituale extends Noleggio {

	public ClienteAbituale(Data inizio, Data fine, Auto au) {
		super(inizio, fine,  au);
		
	}

	@Override
	public void calcolaCosto() {
		this.costo=(double) (45*tempo);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
