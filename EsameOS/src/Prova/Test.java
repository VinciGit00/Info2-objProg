package Prova;

import Aeroporto.Aereo;
import Aeroporto.Aeroporto;
import Aeroporto.Aeroportoif;

public class Test {
	static final int val=5;
	public static void main(String[] args) {
		Aeroportoif Malpensa= new Aeroporto();
		
		for(int i=0; i<5; i++) {
			Aereo k= new Aereo(Malpensa, i+" ");
			k.start();
		}
	}
}
