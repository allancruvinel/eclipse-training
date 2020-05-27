package Factory;


public class Cliente {

	public static void main(String[] args) {
		//Sapato s = new Sapato("...",155,Origem.USA);
		//OU FABRICAS COMO enum OU FABRIAS PARA AS FABRICAS
		Fabrica f = Montadora.montarFabrica(Origem.USA);
		Produto p = f.criarSapato();
		p.mostrarInfo();
		System.out.println(p);
	}

}
