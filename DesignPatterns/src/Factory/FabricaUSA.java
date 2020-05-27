package Factory;

public class FabricaUSA implements Fabrica{
	
	FabricaUSA(){}
	
	@Override
	public Sapato criarSapato() {
		return new Sapato("Sapato fancy",85,Origem.USA);
	}

	@Override
	public Tenis criarTenis() {
		return new Tenis("Snicker Air ultra",350,Origem.USA);
	}

}
