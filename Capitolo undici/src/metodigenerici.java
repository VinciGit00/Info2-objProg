
public class metodigenerici {

	/*Dà in ingresso un oggetto e restituisce la stringa ripetuta due volte*/
	//1->"11"
	
	static <E> String doubleString(E e) {
		return  e.toString()+" "+e.toString();
	}
}
