package utilitaries;

public class Imovel {
	private Pessoa pessoa;
	private String numero;
	private String rua;
	private String bloco;
	
	
	public Imovel(Pessoa pessoa,String numero, String rua, String bloco) {
		this.numero = numero;
		this.rua = rua;
		this.bloco = bloco;
		this.pessoa = pessoa;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public String getNumero() {
		return numero;
	}


	public String getRua() {
		return rua;
	}


	public String getBloco() {
		return bloco;
	}
	
	public String toString() {
		return getPessoa().toString()+" Numero "+getNumero()+" Rua "+getRua()+" Bloco "+getBloco();
	}
	
	
	
	
	
}	

