package uf6pac2;

/**
 * Clase pojo coche.
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Coche {

	private String bastidor;
	private String matricula;
	private String marca;
	private String modelo;
	
	/**
	 * Constructor vacio de coche. Inicializa las variables como texto vacio
	 */
	public Coche() {
		this.marca = "";
		this.matricula = "";
		this.bastidor = "";
		this.modelo = "";
	}
	
	/**
	 * Constructor al que se le introducen los datos del coche
	 * @param bastidor numero de bastidor del coche
	 * @param matricula matricula del coche
	 * @param marca marca del coche
	 * @param modelo modelo del coche
	 */
	public Coche(String bastidor, String matricula, String marca, String modelo) {
		this.marca = marca;
		this.matricula = matricula;
		this.bastidor = bastidor;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [bastidor=" + bastidor + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ "]";
	}
}
