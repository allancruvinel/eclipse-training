
public class Main {

	public static void main(String[] args) {
		Almoxarifado almoxarife = new Almoxarifado();
		Rh rh = new Rh();
		System.out.println("Informa��es da rede");
		System.out.println(almoxarife.redeToString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informa��es do financeiro");
		System.out.println(almoxarife.financeiroToString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informa��es do almoxarifado");
		System.out.println(almoxarife.toString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informa��es do RH");
		System.out.println(rh.toString());

	}

}
