package Es1;
public class ContoCorrente {
	/*Campi della classe*/
	Float importoIniziale;
	int numeroConto;
	String proprietario;
	
	/*Costruttori*/
	public ContoCorrente(Float importoIniziale, int numeroConto, String proprietario) {
		this.importoIniziale=importoIniziale;
		this.numeroConto= numeroConto;
		this.proprietario= proprietario;
	}
	
	/*Metodi della classe*/
	public void preleva(float valoredaprelevare) {
		if(valoredaprelevare>=0 && this.importoIniziale>=valoredaprelevare)
			this.importoIniziale= this.importoIniziale-valoredaprelevare; 
		if(valoredaprelevare<=0)
			System.out.println("Valore da prelevare negativo");
		else
			System.out.println("Credito insufficiente, saldo di: " +this.importoIniziale);
	}
	
	public void versa(float valoredaggiungere) {
		if(valoredaggiungere>=0)
		{
			this.importoIniziale=this.importoIniziale+valoredaggiungere; 
			System.out.println("Nuovo saldo: "+this.importoIniziale);
		}
		else
			System.out.println("Valore inserito non valido");
	}
	
	public float calcolainteressi(){
		float interesse=0;
		interesse= (float) (this.importoIniziale*0.0001)/100;
		/*Serve per arrotondare*/
		interesse= (float) Math.round(interesse*100)/100;
		return interesse;
	}
	
	@Override
	public String toString(){
		return this.importoIniziale+" "+this.proprietario+" "+this.numeroConto;
	}
}
