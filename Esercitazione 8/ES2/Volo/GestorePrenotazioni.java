package Volo;

import java.util.ArrayList;
import java.util.Collections;

import Eccezioni.AereoPienoException;
import Eccezioni.ValorenonValidoException;
import prog.io.FileInputManager;

public class GestorePrenotazioni {
	
	ArrayList<Volo> ListaVoli; 
	
	public GestorePrenotazioni() {
		  
	}
	  
	public void InserisciVolo(String partenza, String arrivo, String data, String ora) {
		ListaVoli.add(new Volo(partenza, arrivo, data, ora));
	}
  
	public void InserisciPrenotazione(Prenotazione pre, int ID) throws AereoPienoException {
		for(int i=0; i<ListaVoli.size(); i++) {
			if(ID==ListaVoli.get(i).getId() && ListaVoli.get(i).passeggeriprenotati>=pre.npersone) {
				ListaVoli.get(i).passeggeriprenotati-=pre.npersone;
				ListaVoli.get(i).setPrenotazione(pre);
				break;
			}
			
			if(ID==ListaVoli.get(i).getId() && ListaVoli.get(i).passeggeriprenotati-ListaVoli.get(i).numeromaxpasseggeri==0) {
				throw new AereoPienoException();
			}
		}
	}

	public void stampa1(){
		Collections.sort(ListaVoli);
		for(Volo v: ListaVoli )
			System.out.println(v.toString());
	}
	
	public void stampa2(){
		sort1(ListaVoli);
		for(Volo v: ListaVoli )
			System.out.println(v.toString());
	}
	
	public static void sort1(ArrayList<Volo> n) { //Uso un bubble sorter
		boolean ordinato=true;
		do {
			ordinato= true;
			for(int i=0; i<=n.size()-1; i++) {
				if(n.get(i).getId()<n.get(i+1).getId()) { //Compara
					Collections.swap(n, i, i+1); //Il Collections.swap scambia le due posizioni
					ordinato=false;
				}
			}	
		}while(!ordinato);
	}

	public void Cerca(String partenza) {
		boolean f=true;
		
		do {
			f=true;
			for(int i=0; i<ListaVoli.size()-1; i++) {
				if(ListaVoli.get(i).partenza.compareTo(ListaVoli.get(i+1).partenza)>0) {
					Collections.swap(ListaVoli, i, i+1);
					f=false;
				}
			}
			
		}while(!f);
		
		int i=0;
		int j=ListaVoli.size()-1;
		int m;
		boolean flag=false;
		while(i<=j) { //Faccio una ricerca dicatomica
			m=(i+j)/2;
			if(ListaVoli.get(m).partenza.compareTo(partenza)==0) {
				flag=true;
				System.out.println("Trovato");
			}
			if(ListaVoli.get(m).partenza.compareTo(partenza)<0)
					i=m+1;
			else
				j=m-1;
		}
		if(flag=false)
			System.out.println("Partenza non trovata");
	}

	public void spostaprenotazione(Prenotazione pre, int IDvecchio, int IDnuovo) {
		boolean flag=false;
		for(int i=0; i<ListaVoli.size(); i++) {
			if(ListaVoli.get(i).getId()==IDvecchio) {
				ListaVoli.get(i).prenotazioni.remove(pre);
				ListaVoli.get(i).passeggeriprenotati+=pre.npersone;
				flag=true;
			}
		}
		
		for(int i=0; i<ListaVoli.size(); i++) {
			try {
					if(ListaVoli.get(i).getId()==IDnuovo && flag==true &&  ListaVoli.get(i).passeggeriprenotati>=pre.npersone) {
						ListaVoli.get(i).prenotazioni.add(pre);
						ListaVoli.get(i).passeggeriprenotati-=pre.npersone;
					}
					else if(ListaVoli.get(i).getId()==IDnuovo && flag==true &&  (ListaVoli.get(i).passeggeriprenotati<pre.npersone || ListaVoli.get(i).passeggeriprenotati==ListaVoli.get(i).numeromaxpasseggeri)) {
						throw new RuntimeException();
				} 	}catch (RuntimeException e) {
					System.out.println("Numero di posti non disponibile per il gruppo selezionato");
				}
			}
	}
	
	static GestorePrenotazioni inseriscivolodafile() throws ValorenonValidoException  {
		
		GestorePrenotazioni GP= new GestorePrenotazioni();
		FileInputManager fin= new FileInputManager("Foglio prenotazioni.txt");
		ArrayList<Prenotazione> prentemp= new ArrayList<>();
		
		for(;;) {
			
			String line=fin.readLine();
			if(line==null)
				break;
			String[] data= line.split(";");
			switch(data[0]) {
			case "S":
				PrenotazioneIndividuale p= new PrenotazioneIndividuale(data[0], Double.parseDouble(data[1]), Preferenza.valueOf(data[2]));
				prentemp.add(p);
				
			case "G":
				ArrayList<String> AL= new ArrayList();
				for(int i=2; i<(data.length); i++) {
					
					AL.add(data[i]);
				}
				PrenotazioneGruppo pg= new  PrenotazioneGruppo(AL, Integer.parseInt(data[1]), Double.parseDouble(data[2]));
				prentemp.add(pg);
			case "V":
				Volo vol= new Volo(data[1], data[2], data[3], data[4], Integer.parseInt(data[5]), Integer.parseInt(data[6]) );
				vol.setPrenotazione(prentemp);
			for(int i=0; i<prentemp.size(); i++) {
				prentemp.remove(i);
			}
			default:
				throw new ValorenonValidoException();
			}
		}
		
		
		return GP;
		
	}

}
