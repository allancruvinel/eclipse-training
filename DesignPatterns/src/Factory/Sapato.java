package Factory;

public class Sapato extends Produto{

	Sapato(String nome, double preco, Origem origem) {
		super(nome, preco, origem);
	}
	
	public String toString() {
		return "É um sapato";
	}

}
