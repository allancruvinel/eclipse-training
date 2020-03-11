package utilitaries;

public class Imovel {
	private Pessoa pessoa;
	private int numero;
	private String rua;
	private String bloco;
	
	
	public Imovel(Pessoa pessoa,int numero, String rua, String bloco) {
		this.numero = numero;
		this.rua = rua;
		this.bloco = bloco;
		this.pessoa = pessoa;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public int getNumero() {
		return numero;
	}


	public String getRua() {
		return rua;
	}


	public String getBloco() {
		return bloco;
	}
	
	
	
	
	
}	

