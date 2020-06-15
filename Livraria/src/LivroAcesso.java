public class LivroAcesso {

	public static void main(String[] args) {
		Livro l = new TipoEspirita("Livro Espirita Criado");
		l.setAutor("Allan Cardek");
		l.setTitulo("Minha Vida Meu Amor.");
		l.consultaLivro();
		
		Livro l2 = new TipoRomance("Livro de Romance Criado");
		l2.setAutor("Joanne Catlyn Roaling");
		l2.setTitulo("Harry Potter and the Globet of Fire.");
		l2.consultaLivro();
		
		Livro l3 = new Livro("Livro Criado");
		l3.setAutor("Tennenbaum");
		l3.setTitulo("Projeto de Banco de Dados.");
		l3.consultaLivro();
	}
}
