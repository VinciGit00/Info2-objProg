package Es7;
public class Prova {

	public static void main(String[] args) {
		Acquario mioAcquario = new Acquario("Acq");
		Vasca v1 = new Vasca("V1");
		Vasca v2 = new Vasca("V2");
		Vasca v3 = new Vasca("V3");
		
		
		v1.aggiungiPesce(new Pesce("P001",1,100));
		v1.aggiungiPesce(new Pesce("P002",1,1000));
		v1.aggiungiPesce(new Pesce("P003",12,100));
		v2.aggiungiPesce(new Pesce("P004",1,100));
		v2.aggiungiPesce(new Pesce("P005",1,1000));
		v2.aggiungiPesce(new Pesce("P006",12,100));
		v3.aggiungiPesce(new Pesce("P007",1,100));
		v3.aggiungiPesce(new Pesce("P008",1,100));
		v3.aggiungiPesce(new Pesce("P009",1,1000));
		
		/*v1.stampaPesci();
		v1.eliminaPesce("P002");*/
		
		mioAcquario.addVasca(v1);
		mioAcquario.addVasca(v2);
		mioAcquario.addVasca(v3);
		mioAcquario.stampaVasche();
		//System.out.println(mioAcquario.toString());
		
		
	}
}

