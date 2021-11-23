import prog.io.FileInputManager;

public class Esercizio4_rifatto {

	public static void main(String[] args) {

		String filename= "name";
		
		if(FileInputManager.exists(filename))
		{
			String temp;
			
			FileInputManager fin= new FileInputManager(filename);
			
			int  ca=0, ce=0, ci=0, co=0, cu=0;
			
			while(true)
			{
				temp= fin.readLine();
				if(temp==null)
					break;
				for(int i=0; i<temp.length(); i++)
				{
					char lettera= temp.charAt(i);
					switch(lettera)
					{
					case 'a':
					case 'A':
						ca++;
						break;
					case 'e':
					case 'E':
						ce++;
						break;
					case 'i':
					case 'I':
						ci++;
						break;
					case 'o':
					case 'O':
						co++;
						break;
					case 'u':
					case 'U':
						cu++;
						break;
					
					}
				}
			}
		}
		
		else
			System.out.println("File insesistente");
	}

}
