package Factory;

public abstract class Produto {
	
	private String nome;
	private double preco;
	private Origem origem;
	
	Produto(String nome, double preco, Origem origem) {
		this.nome = nome;
		this.origem = origem;
		this.preco = preco;
	}
	
	public void mostrarInfo() {
		System.out.println(nome);
		System.out.println(preco);
		System.out.println(origem);
	}

}
