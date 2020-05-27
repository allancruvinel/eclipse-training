
public class Rh extends Financeiro {
	private int qtdeFuncionario;
	private int qtdeSetores;
	
	public Rh() {
		super();
		qtdeFuncionario = 65001;
		qtdeSetores = 9;
	}
	
	
	@Override
	public String toString() {
		return "Rh Funcionarios =" + qtdeFuncionario + ", qtdeSetores=" + qtdeSetores;
	}


	public void pagarFuncionario(double valor) {
		super.movimentarBalanco(valor);
	}
	
	public void contratarFuncionario() {
		this.qtdeFuncionario++;
	}
	
	public void demitirFuncionario() {
		this.qtdeFuncionario--;
	}

	public int getQtdeFuncionario() {
		return qtdeFuncionario;
	}

	public int getQtdeSetores() {
		return qtdeSetores;
	}
	
	
}
