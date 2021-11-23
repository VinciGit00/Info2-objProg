package Fatti_da_me;

public class Generonumcasuali {
	
	public static void main(String[] args) {
	  String characters="ABCDEFGILMOPQRSTUVZ0103456789";   
	  int Rand;
	  String ID="";
		
	  for(int i=0; i<6; i++) {
			Rand=(int)(Math.random()*characters.length());
			char lettera= characters.charAt(Rand);
			ID=ID+lettera;
	  }
		System.out.println(ID);
	}
}
