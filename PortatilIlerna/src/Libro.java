/**
 * Prueba cambio git
 * Clase que genera el molde de un Libro.
 * @author Jon Ander Ochoa Ruiz.
 *
 */
public class Libro {

	//ATRIBUTOS
	private String titulo;
	private String ISBN;
	private String autor;
	private int numeroPaginas;
	private String editorial;
	
	//CONSTRUCTORES
	/**
	 * Constructor sin par�metros. Este constructor implica que el ISBN siempre
	 * estar� en blanco ya que no tiene setter para el mismo y el atributo es private.
	 * 
	 * IMPORTANTE: El ISBN SIEMPRE ESTAR� EN BLANCO Y NUNCA SE PODR� MODIFICAR!
	 */
	public Libro() {
		this.titulo = "";
		this.ISBN = "";
		this.autor = "";
		this.numeroPaginas = 0;
		this.editorial = "";
	}
	
	/**
	 * Constructor solo con el par�metro ISBN. Como ISBN no tiene metodo getter, no 
	 * ser� posible modificarlo posteriormente. Por lo que creamos un constructor con 
	 * un �nico par�metro: el ISBN.
	 * 
	 * @param ISBN ISBN del libro.
	 */
	public Libro(String ISBN) {
		this.titulo = "";
		this.ISBN = ISBN;
		this.autor = "";
		this.numeroPaginas = 0;
		this.editorial = "";
	}
	
	/** 
	 * Constructor con par�metros.
	 * 
	 * @param titulo T�tulo del libro.
	 * @param ISBN ISBN del libro.
	 * @param autor Autor del libro.
	 * @param numeroPaginas N�mero de p�ginas del libro.
	 * @param editorial Editorial del libro.
	 */
	public Libro(String titulo, String ISBN, String autor, int numeroPaginas, String editorial) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editorial = editorial;
	}

	//METODOS
	/**
	 * M�todo getter que devuelve el t�tulo del libro.
	 * @return titulo T�tulo del libro.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * M�todo setter que modifica el valor del t�tulo.
	 * 
	 * @param titulo T�tulo del libro.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * M�todo getter que devuelve el ISBN del libro.
	 * 
	 * @return ISBN del Libro.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * M�todo getter que devuelve el Autor del libro.
	 * 
	 * @return author Autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * M�todo setter que modifica el autor del libro.
	 * 
	 * @param autor Autor del libro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * M�todo getter que devuelve el n�mero de p�ginas del libro.
	 * 
	 * @return N�mero de p�ginas del libro.
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * M�todo setter que modifica el n�mero de p�ginas del libro.
	 * 
	 * @param numeroPaginas N�mero de p�ginas del libro.
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * M�todo getter que devuelve la Editorial del libro.
	 * 
	 * @return editorial Editorial del libro.
	 */
	public String getEditorial() {
		return editorial;
	}
	
	/**
	 * M�todo setter que modifica la Editorial del libro.
	 * 
	 * @param editorial Editorial del libro.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo Sobreescrito que muestra todos los atributos como una cadena.
	 */
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", editorial=" + editorial + "]";
	}
	
}
