package ilerna.utiles;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class PruebaExcepciones {

	public static void main(String[] args) {
		Archivo nuevoArchivo = new Archivo();
		UtilesArrays utiles = new UtilesArrays();
		
		//Ejercici 1c
		Utiles.titulo("Ejercicio 1c", "M�todo que reciba un n�mero entero tam y devuelva un array de enteros de tama�o tam donde cada elemento\r\n sea igual a su posici�n natural (1 para la primera posici�n, 2 para la segunda, y as� sucesivamente)");
		try {
			
			int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o de devolucion del array"));
			int[] arrayIncremental;
			arrayIncremental = utiles.arrayPorTamano(tam);
			Utiles.imprimirArray("Array posici�n", arrayIncremental);
			
		} catch (NumberFormatException e) {
			System.out.println("ERROR: " + e.getMessage());
			nuevoArchivo.escribirArchivo("Error: "+ e.getMessage());
		}
		
		
		//Ejercicio 1d
		Utiles.titulo("Ejercicio 1d", "M�todo que dados dos arrays del mismo tama�o devuelva otro array que contenga en cada posici�n el resultado\r\n de multiplicar los elementos situados en la misma posici�n de ambos arrays.");
		int[] array1 = new int[] {2,4,6,8};
		int[] array2 = new int[] {1,3,5,7,9,7};
		int[] multi = utiles.multiplicaValoresArray(array1, array2);
		//Si no es null imprimimos el resultado
		if(multi != null) {
			Utiles.imprimirArray("Array 1  ", array1);
			Utiles.imprimirArray("Array 2  ", array2);
			System.out.println("----------------------------");
			Utiles.imprimirArray("Resultado", multi);
		}
		
		
		//Ejemplo ejercicio 2b
		Utiles.titulo("Ejercicio 2b", "M�todo que dado un n�mero y un car�cter indique si el DNI formado por la\r\n" + 
				"uni�n de ambos es correcto.");
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el n�mero del DNI"));
			String l = JOptionPane.showInputDialog("Introduce la letra");
			char letra = l.charAt(0);
			System.out.println("N�mero inicial: " + numero);
			System.out.println("Letra inicial: " + letra);
			System.out.println("V�lido: " + Cadenas.validarDNI(numero, letra));
			nuevoArchivo.escribirArchivo("N�mero inicial: " + numero);
			nuevoArchivo.escribirArchivo("Letra inicial: " + letra);
			nuevoArchivo.escribirArchivo("V�lido: " + Cadenas.validarDNI(numero, letra));
		} catch (NumberFormatException e) {
			System.out.println("ERROR: " + e.getMessage());
			nuevoArchivo.escribirArchivo("Error: "+ e.getMessage());
		} catch (HeadlessException e) {
			System.out.println("ERROR: " + e.getMessage());
			nuevoArchivo.escribirArchivo("Error: "+ e.getMessage());
		}
	}
	
	
	
}
