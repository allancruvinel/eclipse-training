package Factory;

public class Montadora {
	
	public static Fabrica montarFabrica(Origem origem) {
		switch(origem) {
			case USA:
				return new FabricaUSA();
			case CHINA:
				return new FabricaCHN();
		}
		return null;
	}
	
}
