package inicio;
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
	private TipoPrestamo prestamo;
	
	//CONSTRUCTORES
	/**
	 * Constructor sin parámetros. Este constructor implica que el ISBN siempre
	 * estará en blanco ya que no tiene setter para el mismo y el atributo es private.
	 * Por defecto este constructor tendra un valor mensual para su variable prestamo.
	 * 
	 * IMPORTANTE: El ISBN SIEMPRE ESTARÁ EN BLANCO Y NUNCA SE PODRÁ MODIFICAR!
	 */
	public Libro() {
		this.titulo = "";
		this.ISBN = "";
		this.autor = "";
		this.numeroPaginas = 0;
		this.editorial = "";
		this.prestamo = TipoPrestamo.MENSUAL;
	}
	
	/**
	 * Constructor solo con el parámetro ISBN. Como ISBN no tiene metodo getter, no 
	 * será posible modificarlo posteriormente. Por lo que creamos un constructor con 
	 * un único parámetro: el ISBN.
	 * Si se elige este constructor, por defecto, su tipo de prestamo será DIARIO
	 * 
	 * @param ISBN ISBN del libro.
	 */
	public Libro(String ISBN) {
		this.titulo = "";
		this.ISBN = ISBN;
		this.autor = "";
		this.numeroPaginas = 0;
		this.editorial = "";
		this.prestamo = TipoPrestamo.DIARIO;
	}
	
	/** 
	 * Constructor con parámetros.
	 * 
	 * @param titulo Título del libro.
	 * @param ISBN ISBN del libro.
	 * @param autor Autor del libro.
	 * @param numeroPaginas Número de páginas del libro.
	 * @param editorial Editorial del libro.
	 * @param prestamo Tipo de prestamos establecido para este Libro.
	 */
	public Libro(String titulo, String ISBN, String autor, int numeroPaginas, String editorial, TipoPrestamo prestamo) {
		super();
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editorial = editorial;
		this.prestamo = prestamo;
	}

	//METODOS
	/**
	 * Método getter que devuelve el título del libro.
	 * @return titulo Título del libro.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método setter que modifica el valor del título.
	 * 
	 * @param titulo Título del libro.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Método getter que devuelve el ISBN del libro.
	 * 
	 * @return ISBN del Libro.
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Método getter que devuelve el Autor del libro.
	 * 
	 * @return author Autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método setter que modifica el autor del libro.
	 * 
	 * @param autor Autor del libro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Método getter que devuelve el número de páginas del libro.
	 * 
	 * @return Número de páginas del libro.
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * Método setter que modifica el número de páginas del libro.
	 * 
	 * @param numeroPaginas Número de páginas del libro.
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * Método getter que devuelve la Editorial del libro.
	 * 
	 * @return editorial Editorial del libro.
	 */
	public String getEditorial() {
		return editorial;
	}
	
	/**
	 * Método setter que modifica la Editorial del libro.
	 * 
	 * @param editorial Editorial del libro.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo que devuelve el tipo de prestamos del libro
	 * @return TipoPrestamo Devuelve el tipo de prestamos entre los elementos del Enum
	 */
	public TipoPrestamo getPrestamo() {
		return prestamo;
	}

	/**
	 * Metodo que modifica el tipo de prestamo
	 * @param prestamo Indica un tipo de prestamo
	 */
	public void setPrestamo(TipoPrestamo prestamo) {
		this.prestamo = prestamo;
	}

	/**
	 * Metodo Sobreescrito que muestra todos los atributos como una cadena.
	 */
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", editorial=" + editorial + ", prestamo=" + prestamo + "]";
	}
	
}
