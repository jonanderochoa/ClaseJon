package uf6pac2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Clase que contiene los metodos necesarios para el control de la dase de datos
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class CocheCRUD {

	//Constantes
	private static final String DRIVER = "com.mysql.jdbc.Driver"; 
	//Cadena que contiene el driver:protocolo_driver:puerto/ nombre de la bd
	private static final String BBDD = "jdbc:mysql://localhost:3306/Concesionario";
	private static final String USUARIO = "root"; 
	private static final String PASSWORD = "";
	
	/**
	 * Metodo privado que realiza la conexion con la BBDD
	 * @return
	 */
	private Connection conectar() {
		Connection conexion = null;
		try {
			//Registramos el driver
			Class.forName(DRIVER);
			//Creamos la conexion introduciendo los datos de la BD
			conexion = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
			
		}catch(Exception e) {
			System.out.println("Error al conectar con la BBDD: "+e.getMessage());
		}
		return conexion;
	}
	
	/**
	 * Metodo encargado de, entregandole un objeto coche, inserta ese coche en la base de datos
	 * @param Objeto Coche que le entregamos
	 * @return Objeto coche creado. Si no se inserta devuelve null.
	 */
	public Coche create(Coche coche) {
		Connection conexion = conectar();
		//Creamos la sentencia SQL
		String sql ="INSERT INTO coche(bastidor, matricula, marca, modelo) VALUES (?, ?, ?, ?)";
		try {
			//Ejecutamos la consulta preparada
			PreparedStatement miConsulta = conexion.prepareStatement(sql);
			//Establecemos los parametros de la consulta
			miConsulta.setString(1, coche.getBastidor());
			miConsulta.setString(2, coche.getMatricula());
			miConsulta.setString(3, coche.getMarca());
			miConsulta.setString(4, coche.getModelo());
			//Ejecutar la consulta
			miConsulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("ERROR: "+e.getMessage());
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return coche;
	}
	
	/**
	 * Metodo que pasandole el bastidor del coche nos devuelve el objeto coche
	 * que contiene ese bastidor junto con sus datos
	 * @param bastidor Numero de bastidor del coche
	 * @return Coche Objeto coche
	 */
	public Coche read(String bastidor) {
		Connection conexion = conectar();
		//Inicializamos un coche con valor null
		Coche coche = null;
		//Creamos la sentencia SQL
		String sql ="SELECT * FROM coche WHERE bastidor=? AND activo=1";
		try {
			//Ejecutamos la consulta preparada
			PreparedStatement miConsulta = conexion.prepareStatement(sql);
			//Establecemos el parametro de la consulta
			miConsulta.setString(1, bastidor);
			//Ejecutar y recorrer la consulta
			ResultSet rs = miConsulta.executeQuery();
			if(rs.next()) {
				//Si tiene resultados creamos una instanciade la clase coche
				coche = new Coche();
				//Rellenamos la instancia coche con los datos de la BBDD
				coche.setBastidor(rs.getString("bastidor"));
				coche.setMatricula(rs.getString("matricula"));
				coche.setMarca(rs.getString("marca"));
				coche.setModelo(rs.getString("modelo"));
			}else {
				System.out.println("No existe ningun coche con ese bastidor");
			}
		} catch (SQLException e) {
			System.out.println("ERROR: "+e.getMessage());
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		//Devolvemos el objeto coche
		return coche;
	}
	
	/**
	 * Muestra todos los coches activos de la BBDD
	 * @return ArrayList<Coche> lista de coches
	 */
	public ArrayList<Coche> listaCoches(){
		Connection conexion = conectar();
		//Inicializamos una lista de coches
		ArrayList<Coche> lista = new ArrayList<Coche>();
		//Creamos la sentencia SQL
		String sql ="SELECT * FROM coche WHERE activo=1";
		try {
			//Ejecutamos la consulta preparada
			PreparedStatement miConsulta = conexion.prepareStatement(sql);
			//Ejecutar y recorrer la consulta
			ResultSet rs = miConsulta.executeQuery();
			//Bucle que se repite mientras exista otra tupla
			while(rs.next()) {
				//Creamos un objeto coche
				Coche coche = new Coche();
				//Rellenamos la instancia coche con los datos de la BBDD
				coche.setBastidor(rs.getString("bastidor"));
				coche.setMatricula(rs.getString("matricula"));
				coche.setMarca(rs.getString("marca"));
				coche.setModelo(rs.getString("modelo"));
				//Añadimos el objeto coche a la lista
				lista.add(coche);
			}
		} catch (SQLException e) {
			System.out.println("ERROR: "+e.getMessage());
		}finally{
			//Cerrar la conexion
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		//Devolvemos la lista
		return lista;
	}
	
	/**
	 * Borrado logico de un coche. Esto quiere decir que en lugar de borrarlo, cambiamos el 
	 * valor del campo activo a 0 para que no aparezca en las busquedas. Pero no se elimina 
	 * realmente.
	 * @param bastidor numero de bastidor del coche que queremos eliminar
	 */
	public void delete(String bastidor) {
		
		Connection conexion = conectar();
		//Creamos la sentencia SQL
		String sql ="UPDATE coche SET activo=0 WHERE bastidor=?";
		try {
			//Ejecutamos la consulta preparada
			PreparedStatement miConsulta = conexion.prepareStatement(sql);
			//Establecemos el parametro de la consulta
			miConsulta.setString(1, bastidor);
			//Ejecutar la consulta
			miConsulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("ERROR: "+e.getMessage());
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	/**
	 * Borrando completo y real de todos los registros de la BBDD
	 */
	public void deleteAll() {
		
		Connection conexion = conectar();
		//Creamos la sentencia SQL
		String sql ="DELETE FROM coche";
		try {
			//Ejecutamos la consulta preparada
			PreparedStatement miConsulta = conexion.prepareStatement(sql);
			//Ejecutar la consulta
			miConsulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("ERROR: "+e.getMessage());
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("bd limpiada");
		System.out.println();
	
	}
}