import javafx.scene.chart.PieChart.Data;

public class Auto {

	private String targa;
	private Data dataimmatricolazione;
	public categoria cat;
	
	public Auto(String targa, Data dataimmatricolazione, categoria cat) {
		this.targa=targa;
		this.dataimmatricolazione=dataimmatricolazione;
		this.cat=cat;
	}
	
	public Auto(String targa, Data dataimmatricolazione) {
		this(targa, dataimmatricolazione, categoria.ECONOMICA);
	}
	
}
