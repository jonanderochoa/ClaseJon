package ilerna.utiles;

import java.util.ArrayList;
import java.util.Random;

import inicio.Libro;

public class Listas {

		
		/**
		 * Método que dada una lista con nombres de personas y otra lista con apellidos, devuelva una lista de cadenas de tamaño n que se 
		 * genere con combinaciones aleatorias de un nombre y dos apellidos tomados de las dos listas de entrada.
		 * @param nombres ArrayList que contiene un listado de nombres
		 * @param apellidos ArrayList que contiene un listado de apellidos
		 * @param cantidad Numero de nombres completos que se desean
		 * @return ArrayList con un numero n de nombres completos de combinacion de 2 apellidos y un nombre
		 */
		public static ArrayList<String> combinacionNombresApellidos(ArrayList<String> nombres, ArrayList<String> apellidos, int cantidad) {
			
			//Se instancia la clase random
			Random aleatorio = new Random();
			
			//Creamos una lista que contenga la combinacion de nombres y apellidos
			ArrayList<String> listaCombinacion = new ArrayList<String>();
			
			//Se crea un bucle que genere la cantidad de cadenas pedidas
			for(int i = 0; i < cantidad; i++) {
				
				String nombreCompleto ="";
				
				//Creamos array de valores para guardar los aleatorios
				int[] ale = new int[3];
				
				//Se crea un bucle para crear 3 aleatorios que se guardan en el array
				for(int j = 0; j < ale.length; j++) {
					//Se genera un numero aleatorio entre 0 y el tamaño maximo de la lista y se guarda en el array en la posicion j
					ale[j] = aleatorio.nextInt(nombres.size());
				}
				
				//Se genera el nombre completo
				nombreCompleto = apellidos.get(ale[0]) + " " + apellidos.get(ale[1]) + " " + nombres.get(ale[2]);
				
				//Añadimos la combinacion de nombres y apellidos a la lista
				listaCombinacion.add(nombreCompleto);	
			}		
			return listaCombinacion;
		}
		
				
		/**
		 * Este metodo recibe una Lista de libros y devuelve de cada tipo de prestamo, la cantidad del mismo.
		 * Calcula la cantidad de todos y lo devulve como array en el siguiente orden: prestamo[diario,semanal,mensual]
		 * @param lista ArrayList de Libros. Recibe una lista de libros 
		 * @return array resultante con las cantidades de prestamo[diario,semanal,mensual]
		 */
		public static int[] mostrarArrayPrestamos(ArrayList<Libro> listaLibros) {
			
			//Se instancia un array con 3 elementos
			int[] tipoPrestamo = new int[3];
			
			//Se crean e inicializan a 0, 3 variables que almacenaran las veces que se da cada tipo de prestamo
			int diario = 0;
			int semanal = 0;
			int mensual = 0;
			
			for(int i = 0; i < listaLibros.size(); i++) {
				//Guardame el libro x como objeto libro
				Libro l = listaLibros.get(i);
				//Vemos el tipo de prestamos que tiene
				switch (l.getPrestamo()) {
				case DIARIO:
					diario++;
					break;
				case SEMANAL:
					semanal++;
					break;
				case MENSUAL:
					mensual++;
					break;
				}
				//Almacenamos los valores en el array
				tipoPrestamo[0] = diario;
				tipoPrestamo[1] = semanal;
				tipoPrestamo[2] = mensual;
			}
			//Devolvemos el array
			return tipoPrestamo;
		}
}
