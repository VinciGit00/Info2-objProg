
/*Si utilizzano delle convenzioni*/
public class Frazione implements Comparable <Frazione>{ /*Camel case: solo l'inizio delle parole maiuscole*/
	
	/*campi della classe*/
	/*Stato della classe*/
	/*Numeratore e denominatore*/
	/*TIPO NOME*/
	int num;
	int den;
	
	/*Costruttori*/
	
	/*Versione che non semplifica*/
	 /*public Frazione(int n, int d )
	 {
		 num= n;
		 den=d;
	 }*/
	 
	 /*Segnatura= nome + tipi*/
	 public Frazione(int  v) //Stesso nome ma segnatura diversa, tipi di parametri divesi
	 {
		 //num=v; 
		// den=1;
		 /*Per evitare duplicati*/
		 this(v,1);
	 }
	 
	 /*Cambia la segnatura perchè stesso nome ma diverso tipo*/
	 public Frazione(String x)
	 {
		// String[]data= x.split("/");
		 //num=Integer.parseInt(data[0]);
		// den=Integer.parseInt(data[1]);
		 
		 /*This deve essere sempre la prima istruzione*/
		 this(Integer.parseInt(x.split("/")[0]), Integer.parseInt(x.split("/")[1]));
		 
		 /*Attenzione potresti avere ambiguità*/
		 //public Frazione( long j, int k){}
		 //public Frazione( int j, long k){}
	 }
	 	
	 /*Versione che semplifica*/
		public Frazione(int num, int d) {
			// semplifico con euclide ...
			int m = mcd(num, d);
			this.num = num/m;
			this.den = d/m;
		}
		
		/* calcola il massimo comun divisore tra a e b*/
		/*Algoritmo di Euclide*/ 
		static public int mcd(int a, int b) {
			int resto;
			do {
				resto = a %b;
				a = b;
				b = resto;
			} while(resto!=0);
			return a;
		} 
	 
	 //Metodi
	 public Frazione per(Frazione a)
	 {
		int numProdotto= a.num*this.num;//this.num è il valore prima della parentesi
		int denProdotto= a.den*this.den;//a.den è il numero dentro la parentesi
		return new Frazione (numProdotto, denProdotto);
	 }
	 
	 public Frazione per(int a)
	 {
		int numProdotto= a*this.num;//this.num è il valore prima della parentesi
		int denProdotto= a*this.den;//a.den è il numero dentro la parentesi
		return new Frazione (numProdotto, denProdotto);
	 }
	 
	 public boolean isMinore(Frazione a)
	 {
		 //this isMinore than a
		 /*Ritorna un boolean in automatico con il return*/
		 return(this.num/this.den<a.num/a.den);
	 }
	 
	 public boolean isMaggiore(Frazione b)
	 {
		//this isMaggiore than a
		 /*Ritorna un boolean in automatico con il return*/
 		 return(this.num/this.den>b.num/b.den);
	 }
	 
	 /*Override riscrive un metodo che esiste in una superclasse*/
	 /*Riscrittura del metodo toString()*/
	 @Override//Controlla che il metodo faccia override
	 public String toString(){
		 return num+"/"+den;
	 }
	 
	 public boolean equals( Object obj)
	 {
		 /*Se obj non è una frazione sono sicuro che non sono uguali*/
		if(!( obj instanceof Frazione)) return false;
		Frazione f= (Frazione) obj; //Cast per trasformarlo in frazione 
		//No divisione intera
		//Se faccio la divisione posso avere piccoli errori
		//Faccio l'mcd 
		//ritorna un true o un false
		return(f.num*this.den==this.num*f.den);
	 }
	 
	 /*main*/
	 public static void main(String[] args) {
		Frazione f= new Frazione(4,5);
		Frazione f1= new Frazione(4);
	}
	 
	 public int compareTo(Frazione o)
	 {
		 //Non serve un cast perchè è una frazione
		 
		 int prodottomisto= this.num*o.den-o.num*this.den;
		if(this.den*o.den>0)
			return prodottomisto;
		else
			return -prodottomisto;	 	
	 }
	
}

