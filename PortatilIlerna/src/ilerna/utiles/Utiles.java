package ilerna.utiles;

import java.io.File;
import java.util.ArrayList;

/**
 * Clase que contiene metodos utiles generales a varias clases
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Utiles {

	/**
	 * Realiza un bucle para imprimir los valores de un array
	 * @param array Array que queremos imprimir
	 */
	public static void imprimir(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != array.length -1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	/**
	 * Muestra por pantalla los valores del array entre corchetes: Nombre: [1, 2, 3, n]
	 * @param nombre Nombre que dar al array
	 * @param array Array que mostrar
	 */
	public static void imprimirArray(String nombre, int[] array) {
		System.out.print(nombre + ": [");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i != array.length -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();	
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
	}
	
	
	public static void imprimirArrayList(String nombre, ArrayList<String> lista) {
		System.out.print(nombre + "[");
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			if(i != lista.size() -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void imprimirArrayListMultiLine(ArrayList<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
	}
	
	public static void crearFile() {
		
		
		File archivo = new File("");
		if(archivo.exists()) {
			System.out.println("El fichero existe");
		}else {
			System.out.println("El fichero no existe");
		}
	}
}
