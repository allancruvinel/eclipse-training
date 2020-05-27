
public class Almoxarifado extends Financeiro {
	private int qtdeDepositos;
	private int qtdeItens;
	private double espacoTotal;
	private double espacoOcupado;
	
	public Almoxarifado() {
		super();
		this.qtdeDepositos = 100;
		this.qtdeItens = 18965;
		this.espacoOcupado = 18965;
		this.espacoTotal = 20000;
	}
	
	@Override
	public String toString() {
		return "Almoxarifado Depositos=" + qtdeDepositos + ", qtdeItens=" + qtdeItens + ", espacoTotal="
				+ espacoTotal + ", espacoOcupado=" + espacoOcupado;
	}

	public void adicionarItem() {
		qtdeItens++;
	}
	public void removerItem() {
		qtdeItens--;
	}

	public int getQtdeDepositos() {
		return qtdeDepositos;
	}

	public int getQtdeItens() {
		return qtdeItens;
	}

	public double getEspacoTotal() {
		return espacoTotal;
	}

	public double getEspacoOcupado() {
		return espacoOcupado;
	}
	
	
}
