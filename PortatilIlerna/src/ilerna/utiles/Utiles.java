package ilerna.utiles;
import java.util.ArrayList;

/**
 * Clase que contiene metodos utiles generales a varias clases
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Utiles {
	
	private static Archivo fichero = new Archivo();
	/**
	 * Realiza un bucle para imprimir los valores de un array
	 * @param array Array que queremos imprimir
	 */
	public static void imprimir(int[] array) {

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			fichero.escribirArchivo(Integer.toString(array[i]));
			if(i != array.length -1) {
				System.out.print(", ");
				fichero.escribirArchivo(", ");
			}
		}
		System.out.println();
		fichero.escribirArchivo("");
	}
	
	/**
	 * Muestra por pantalla los valores del array entre corchetes: Nombre: [1, 2, 3, n]
	 * @param nombre Nombre que dar al array
	 * @param array Array que mostrar
	 */
	public static void imprimirArray(String nombre, int[] array) {

		fichero.escribirArchivo(nombre + ": [");
		System.out.print(nombre + ": [");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			//Hacemos la conversion de int a String
			fichero.escribirArchivo(Integer.toString(array[i]));
			if(i != array.length -1) {
				System.out.print(", ");
				fichero.escribirArchivo(", ");
				
			}
		}
		System.out.print("]");
		fichero.escribirArchivo("]");
		System.out.println();
		fichero.escribirArchivo("");
	}
	
	/**
	 * Metodo al que le entregas el titulo y el enunciado y lo muestra por pantalla
	 * @param titulo Titulo principal
	 * @param enunciado Enunciado del ejercicio
	 */
	public static void titulo(String titulo, String enunciado) {

		System.out.println();
		System.out.println("*********************************************");
		System.out.println("            " + titulo + "                   ");
		System.out.println("*********************************************");
		System.out.println(enunciado);
		System.out.println();
		//Para el fichero logs
		fichero.escribirArchivo("");
		fichero.escribirArchivo("*********************************************");
		fichero.escribirArchivo("            " + titulo + "                   ");
		fichero.escribirArchivo("*********************************************");
		fichero.escribirArchivo(enunciado);
		fichero.escribirArchivo("");
	}
	
	
	public static void imprimirArrayList(String nombre, ArrayList<String> lista) {

		System.out.print(nombre + "[");
		fichero.escribirArchivo("[");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			fichero.escribirArchivo(lista.get(i));
			if(i != lista.size() -1) {
				System.out.print(", ");
				fichero.escribirArchivo(", ");
			}
		}
		System.out.print("]");
		fichero.escribirArchivo("]");
		System.out.println();
		fichero.escribirArchivo("");
	}
	
	public static void imprimirArrayListMultiLine(ArrayList<String> lista) {

		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			fichero.escribirArchivo(lista.get(i));
		}
		System.out.println();
		fichero.escribirArchivo("");
	}
}
