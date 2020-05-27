
public class Rede {
	private String nomeRede;
	private int qtdeHoteis;
	private int qtdeQuartos;
	private int qtdeQuartosOcupados;
	
	public Rede() {
		this.nomeRede = "Paraiso";
		this.qtdeHoteis = 512;
		this.qtdeQuartos = 19851;
		this.qtdeQuartosOcupados = 7854;
	}

	public String getNomeRede() {
		return nomeRede;
	}

	public void setNomeRede(String nomeRede) {
		this.nomeRede = nomeRede;
	}

	public int getQtdeHoteis() {
		return qtdeHoteis;
	}

	public void setQtdeHoteis(int qtdeHoteis) {
		this.qtdeHoteis = qtdeHoteis;
	}

	public int getQtdeQuartos() {
		return qtdeQuartos;
	}

	public void setQtdeQuartos(int qtdeQuartos) {
		this.qtdeQuartos = qtdeQuartos;
	}

	public int getQtdeQuartosOcupados() {
		return qtdeQuartosOcupados;
	}

	public void setQtdeQuartosOcupados(int qtdeQuartosOcupados) {
		this.qtdeQuartosOcupados = qtdeQuartosOcupados;
	}

	public String redeToString() {
		return "Rede " + nomeRede + ", qtdeHoteis=" + qtdeHoteis + ", qtdeQuartos=" + qtdeQuartos
				+ ", qtdeQuartosOcupados=" + qtdeQuartosOcupados;
	}
	
	
	
	
	
	

}
