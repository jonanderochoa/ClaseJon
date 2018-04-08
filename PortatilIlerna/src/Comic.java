
public class Comic extends Libro {

	private String ilustrador;

	public Comic(String ilustrador, String titulo, String ISBN, String autor, int numeroPaginas, String editorial) {
		super(titulo, ISBN, autor, numeroPaginas, editorial);
		this.ilustrador = ilustrador;
	}

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

	@Override
	public String toString() {
		return "Comic [ilustrador=" + ilustrador + ", getTitulo()=" + getTitulo() + ", getISBN()=" + getISBN()
				+ ", getAutor()=" + getAutor() + ", getNumeroPaginas()=" + getNumeroPaginas() + ", getEditorial()="
				+ getEditorial() + "]";
	}
	
}
