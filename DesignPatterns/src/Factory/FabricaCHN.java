package Factory;

public class FabricaCHN implements Fabrica{
	
	FabricaCHN(){}
	
	@Override
	public Sapato criarSapato() {
		return new Sapato("Sapato cópia",10,Origem.CHINA);
	}

	@Override
	public Tenis criarTenis() {
		return new Tenis("Znickerz ultra",15,Origem.CHINA);
	}

}
