
public class TipoEspirita extends Livro {
	TipoEspirita(String mensagem){
		super(mensagem);
	}
	@Override
	public void consultaLivro(){
		System.out.println("Livro Esp�rita: Autor = "
		+this.getAutor()
		+". Titulo = "
		+this.getTitulo());
	}

}
