package inicio;

public abstract class Persona {

	//ATRIBUTOS
	private String dni;
	private String nombre;
	private String apellidos;
	

	/**
	 * Constructor con parámetros.
	 * 
	 * @param dni dni de la Persona.
	 * @param nombre Nombre de la Persona.
	 * @param apellidos Apellidos de la Persona.
	 */
	public Persona(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//METODOS
		/**
		 *  Método getter que devuelve el dni de la Persona.
		 *  
		 * @return dni dni de la persona.
		 */
		public String getDni() {
			return dni;
		}

		/**
		 *  Método getter que devuelve el nombre de la Persona.
		 * 
		 * @return nombre Nombre del Persona.
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 *  Método setter que modifica el nombre de la Persona.
		 *  
		 * @param nombre Nombre de la Persona.
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * Método getter que devuelve los apellidos de la Persona.
		 * 
		 * @return apellidos Apellidos de la Persona.
		 */
		public String getApellidos() {
			return apellidos;
		}
		
		/**
		 * Método setter que modifica los apellidos de la Persona.
		 * 
		 * @param apellidos Apellidos de la Persona.
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
	
}
