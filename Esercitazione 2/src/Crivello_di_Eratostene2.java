import java.util.Arrays;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Crivello_di_Eratostene2 {

	

		  public static void main(String[] args) {
		        ConsoleInputManager in = new ConsoleInputManager();
		        ConsoleOutputManager out = new ConsoleOutputManager();
		        int n = in.readInt("inserisci un numero : ");
		        
		        boolean []f = new boolean[n+1];
		        Arrays.fill(f, Boolean.TRUE);
		        
		        setaccia2(n,f);
		        
		        for(int k=2; k<=n; k++)
		        {
		    
		            if(f[k])
		                out.print(k + " ");
		        }

		    }

		    public static void setaccia1(int x, boolean[] fl)
		    {
		        int i;
		        
		        for(int j=2; j<=Math.sqrt(x); j++) //Parte da 2 per sicurezza
		        {
		            i=j;
		            while((i+j)<=x)
		            {
		                fl[j+i]=false;
		                i+=j;
		            }
		        
		        }
		                
		    }
		    
		    public static void setaccia2(int x, boolean[] fl)
		    {
		        int i;
		        for(int j=2; j<=Math.sqrt(x); j++)
		        {
		            i=2;
		            while((i*j)<=x)//Parte da 2 per sicurezza
		            {
		                fl[j*i]=false;
		                i++;
		            }
		        
		        }
		                
		    }
	}
