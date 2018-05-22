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
	 * Constructor sin par�metros. Este constructor implica que el DNI siempre
	 * estar� en blanco ya que no tiene setter para el mismo y el atributo es private.
	 * 
	 * IMPORTANTE: El DNI SIEMPRE ESTAR� EN BLANCO Y NUNCA SE PODR� MODIFICAR!
	 */
	public Socio() {
		this.DNI = "";
		this.nombre = "";
		this.apellidos = "";
	}
	
	/**
	 * Constructor solo con el par�metro DNI. Como DNI no tiene metodo getter, no 
	 * ser� posible modificarlo posteriormente. Por lo que creamos un constructor con 
	 * un �nico par�metro: el DNI.
	 * 
	 * @param DNI DNI del Socio.
	 */
	public Socio(String DNI) {
		this.DNI = DNI;
		this.nombre = "";
		this.apellidos = "";
	}
	
	/**
	 * Constructor con par�metros.
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
	 *  M�todo getter que devuelve el DNI del Socio.
	 *  
	 * @return DNI DNI del Socio.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 *  M�todo getter que devuelve el nombre del Socio.
	 * 
	 * @return nombre Nombre del Socio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 *  M�todo setter que modifica el nombre del Socio.
	 *  
	 * @param nombre Nombre del Socio.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo getter que devuelve los apellidos del Socio.
	 * 
	 * @return apellidos Apellidos del Socio.
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * M�todo setter que modifica los apellidos del Socio.
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
