package temaesame;

class SquadradiCalcio implements Comparable<SquadradiCalcio> {
	
	String name;
	
	SquadradiCalcio(String name) {
		name.toUpperCase();
		this.name=name;
	}
	
	@Override
	public int compareTo(SquadradiCalcio arg0) {
		return this.name.compareTo(arg0.name);
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}

public class VinciguerraMarco0 {
	public static void main(String[] args) {
		SquadradiCalcio [] squadra= new SquadradiCalcio[2];
		squadra[0]= new SquadradiCalcio("Napoli");
		squadra[1]= new SquadradiCalcio("Atalanta");
		
		System.out.println("Prima della modifica: ");
		stampa(squadra);
		System.out.println("");

		ordina(squadra);
		System.out.println("Dopo la modifica: ");	
		stampa(squadra);

	}
	
	public static void stampa(SquadradiCalcio [] squadra) {
		for(int i=0; i<squadra.length; i++) {
			System.out.println(squadra[i]);
		}
	}
	
	public static void ordina(SquadradiCalcio [] squadra) {
		boolean flag=true;
		do {
			flag=true;
			for(int i=0; i<squadra.length-1; i++) {
				if(squadra[i].compareTo(squadra[i+1])>0) {
					SquadradiCalcio temp= squadra[i];
					squadra[i]=squadra[i+1];
					squadra[i+1]= temp;
					
					flag=false;
				}
			}

		}while(!flag);
	}
	
	
	public static void cerca(SquadradiCalcio [] squadra, SquadradiCalcio s) {
		int i=0;
		int j=squadra.length-1;
		while(i<=j) {
			int m= (i+j)/2;
			if(squadra[m].compareTo(s)==0)
				System.out.println("Trovato");
			else if (squadra[m].compareTo(s)<0)
				i=m+1;
			else 
				j=m-1;
		}
	}
}




