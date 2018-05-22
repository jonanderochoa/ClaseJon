package inicio;

public abstract class Persona {

	//ATRIBUTOS
	private String dni;
	private String nombre;
	private String apellidos;
	

	/**
	 * Constructor con par�metros.
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
		 *  M�todo getter que devuelve el dni de la Persona.
		 *  
		 * @return dni dni de la persona.
		 */
		public String getDni() {
			return dni;
		}

		/**
		 *  M�todo getter que devuelve el nombre de la Persona.
		 * 
		 * @return nombre Nombre del Persona.
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 *  M�todo setter que modifica el nombre de la Persona.
		 *  
		 * @param nombre Nombre de la Persona.
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * M�todo getter que devuelve los apellidos de la Persona.
		 * 
		 * @return apellidos Apellidos de la Persona.
		 */
		public String getApellidos() {
			return apellidos;
		}
		
		/**
		 * M�todo setter que modifica los apellidos de la Persona.
		 * 
		 * @param apellidos Apellidos de la Persona.
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
	
}
