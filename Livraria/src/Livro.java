public class Livro {
	private String titulo;
	private String autor;
	
	public Livro() {}
	public Livro(String mensagem) {
		System.out.println(mensagem);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void consultaLivro() {
		System.out.println("Livro: Autor = "
		+this.getAutor()
		+". Titulo = "
		+this.getTitulo());
		
	}	
}
