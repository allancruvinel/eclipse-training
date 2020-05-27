package Strategy;
public class Cliente {
	private String nome;
	private double renda;
	private Status estrategia;
	
	public Cliente(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
	}
	
	public void setEstrategia(Status estrategia) {
		this.estrategia = estrategia;
	}
	public void mostrarInfo() {
		System.out.println("nome: "+nome);
		System.out.printf("Anuidade: %.2f",estrategia.calcularAnuidade(renda));
	}
	
}
