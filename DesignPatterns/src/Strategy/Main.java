package Strategy;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Rudolf",800);
		c.setEstrategia(new Gold());
		c.mostrarInfo();
		c.setEstrategia(new Black());
		c.mostrarInfo();
		c.setEstrategia(new Silver());
		c.mostrarInfo();

	}

}
