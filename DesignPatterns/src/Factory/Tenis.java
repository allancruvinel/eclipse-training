package Factory;

public class Tenis extends Produto{

	Tenis(String nome, double preco, Origem origem) {
		super(nome, preco, origem);
	}

	public String toString() {
		return "É um Tenis";
	}
}
