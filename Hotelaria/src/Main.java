
public class Main {

	public static void main(String[] args) {
		Almoxarifado almoxarife = new Almoxarifado();
		Rh rh = new Rh();
		System.out.println("Informações da rede");
		System.out.println(almoxarife.redeToString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informações do financeiro");
		System.out.println(almoxarife.financeiroToString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informações do almoxarifado");
		System.out.println(almoxarife.toString());
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informações do RH");
		System.out.println(rh.toString());

	}

}
