
public class Financeiro extends Rede {
	private String ordemServico;
	private int qtdeClientes;
	private double balanco;
	
	public Financeiro() {
		super();
		ordemServico = "Controle de Finanças";
		qtdeClientes = super.getQtdeQuartosOcupados();
		balanco = super.getQtdeQuartosOcupados()*100;
	}
	
	public String financeiroToString() {
		return "Financeiro " + ordemServico + ", qtdeClientes=" + qtdeClientes + ", balanco=" + balanco;
	}

	public void movimentarBalanco(double valor) {
		this.balanco += valor;
	}
	
	public void adicionarClientes() {
		this.qtdeClientes++;
	}

	public void removerClientes() {
		this.qtdeClientes--;
	}
	
	public String getOrdemServico() {
		return ordemServico;
	}


	public int getQtdeClientes() {
		return qtdeClientes;
	}


	public double getBalanco() {
		return balanco;
	}

	
}
