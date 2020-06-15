public class TipoRomance extends Livro {
	TipoRomance(String mensagem){
		super(mensagem);
	}
	@Override
	public void consultaLivro(){
		System.out.println("Livro de Romance: Autor = "
	+this.getAutor()
	+". Titulo = "
	+this.getTitulo());
	}	
}
