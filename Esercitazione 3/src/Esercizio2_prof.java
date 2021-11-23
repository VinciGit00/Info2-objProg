
import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.*;

public class Esercizio2_prof {

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String str = "Q,3.8; R,5,8.7; C,0.5";
        getElencoFigure(str);
    }

    private static void  printFigureMax(Vector<Figura> elencoFigure)
    {
    	/*Passaggio importante*/
        Figura perimetroMax = elencoFigure.get(0);
        /*Passaggio importante*/
        Figura areaMax = elencoFigure.get(0);
        for(int i=1; i<elencoFigure.size(); i++)
        {
            if(elencoFigure.get(i).getArea()> areaMax.getArea())
                areaMax = elencoFigure.get(i);
            if(elencoFigure.get(i).getPerimetro()>perimetroMax.getPerimetro())
                perimetroMax = elencoFigure.get(i);
        }   
    }
    
    
    private static void  getElencoFigure(String x)
    {
        StringTokenizer figura = new StringTokenizer(x, ";");
        Vector<Figura> elencoFigure = new Vector<>();
        String[] elementi;
        while(figura.hasMoreTokens())
        {
            elementi = figura.nextToken().split(",");
            if(elementi[0].equalsIgnoreCase("Q")) //con lo switch dovrei fare Q q
                elencoFigure.add(new Quadrato(Double.parseDouble(elementi[1])));
            else if(elementi[0].equalsIgnoreCase("R"))
                elencoFigure.add(new Rettangolo(Double.parseDouble(elementi[1]),Double.parseDouble(elementi[2])));
                
            else if(elementi[0].equalsIgnoreCase("R"))
                elencoFigure.add(new Cerchio(Double.parseDouble(elementi[1])));
        }
        
    	
		for(int i=0; i<elencoFigure.size(); i++)
			System.out.println(elencoFigure.get(i));
        
    }
    
    
    
}
