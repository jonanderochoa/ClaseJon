package inicio;
/**
 * Clase que genera el molde de un Socio.
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Socio {

	//ATRIBUTOS
	private String DNI;
	private String nombre;
	private String apellidos;
	
	//CONSTRUCTORES
	/**
	 * Constructor sin parámetros. Este constructor implica que el DNI siempre
	 * estará en blanco ya que no tiene setter para el mismo y el atributo es private.
	 * 
	 * IMPORTANTE: El DNI SIEMPRE ESTARÁ EN BLANCO Y NUNCA SE PODRÁ MODIFICAR!
	 */
	public Socio() {
		this.DNI = "";
		this.nombre = "";
		this.apellidos = "";
	}
	
	/**
	 * Constructor solo con el parámetro DNI. Como DNI no tiene metodo getter, no 
	 * será posible modificarlo posteriormente. Por lo que creamos un constructor con 
	 * un único parámetro: el DNI.
	 * 
	 * @param DNI DNI del Socio.
	 */
	public Socio(String DNI) {
		this.DNI = DNI;
		this.nombre = "";
		this.apellidos = "";
	}
	
	/**
	 * Constructor con parámetros.
	 * 
	 * @param DNI DNI del Socio.
	 * @param nombre Nombre del Socio.
	 * @param apellidos Apellidos del Socio.
	 */
	public Socio(String DNI, String nombre, String apellidos) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//METODOS
	/**
	 *  Método getter que devuelve el DNI del Socio.
	 *  
	 * @return DNI DNI del Socio.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 *  Método getter que devuelve el nombre del Socio.
	 * 
	 * @return nombre Nombre del Socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *  Método setter que modifica el nombre del Socio.
	 *  
	 * @param nombre Nombre del Socio.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método getter que devuelve los apellidos del Socio.
	 * 
	 * @return apellidos Apellidos del Socio.
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * Método setter que modifica los apellidos del Socio.
	 * 
	 * @param apellidos Apellidos del Socio.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo Sobreescrito que muestra todos los atributos como una cadena.
	 */
	@Override
	public String toString() {
		return "Socio [DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
}
