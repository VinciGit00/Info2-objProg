package Es4;

public class Esame {
	private String nome;
	private int voto;
	
	public Esame (String nome, int voto) throws votoSbagliatoException {
		this.nome=nome;
		if(voto>30 ||voto <0) {
			throw new votoSbagliatoException();
		}
		else
			this.voto=voto;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getVoto() {
		return this.voto;
	}
	
	@Override
	public String  toString() {
		return "Nome dell'esame: "+this.nome+" voto dell'esame: "+this.voto;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Esame)
			return this.nome.equals(((Esame)obj).nome) ;
		else
			return false;
	}
}

class votoSbagliatoException extends Exception {
	votoSbagliatoException (){
		super();
	}
}