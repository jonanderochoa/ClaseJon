package ilerna.utiles;

import java.util.Random;

public class UtilesArrays {

	/**
	 * M�todo que dado un n�mero n, un l�mite inferior y un l�mite superior, devuelva un array con n n�meros 
	 * enteros aleatorios con valores comprendidos entre el l�mite inferior y el l�mite superior INCLUSIVE.
	 * @param num Numero de elementos a mostrar
	 * @param max Valor maximo del rango INCLUIDO
	 * @param min Valor minimo del rango INCLUIDO
	 * @return array con el numero de elementos num y entre con valores entre min y max incluidos.
	 */
	public int[] arrayAleatorio(int num, int max, int min) {
		//Instanciamos un array 
		int[] resultado = new int[num];
		//Instanciamos la clase random para crear numeros aleatorios
		Random aleatorio = new Random();
		try {
			//Bucle 
			for(int i = 0; i < num; i++) {
				//Se crea un numero aleatorio y se introduce en el array
				resultado[i] = aleatorio.nextInt((max - min) + 1) + min;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//Devolvemos el array
		return resultado;
	}
	
	/**
	 * M�todo que dado un array devuelva el mismo array, pero invertido.
	 * @param arrayEntregado Array inicial.
	 * @return Array invertido.
	 */
	public int[] invierteArray(int[] arrayEntregado) {
		//Array inicial
		int[] inicial = arrayEntregado;
		//Creamos otro array con la misma longitud que el anterior
		int[] resultado = new int[arrayEntregado.length];
		int contador = 0;
		//Recorremos el array entregado
		for(int i = inicial.length -1; i >= 0; i--) {
			//
			resultado[contador] =  inicial[i];
			contador++;
		}
		return resultado;
	}
	
	/**
	 * M�todo que reciba un n�mero entero tam y devuelva un array de enteros de tama�o tam donde cada elemento
	 * sea igual a su posici�n natural (1 para la primera posici�n, 2 para la segunda, y as� sucesivamente)
	 * @param tam Tama�o del array
	 * @return Devuelve un array incremental con el tama�a indicado por tam
	 */
	public int[] arrayPorTamano(int tam) {

		//Se instancia el array
		int[] array = new int[tam];
		//Se crea un bucle que llene el array 
		for(int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		return array;
	}
	
	/**
	 * M�todo que dados dos arrays del mismo tama�o devuelva otro array que contenga en cada posici�n el resultado
	 * de multiplicar los elementos situados en la misma posici�n de ambos arrays.
	 * @param array1 Primer array 
	 * @param array2 Segundo array
	 * @return resultado array que contiene en cada indice el valor de la multiplicacion de los valores de los arrays 
	 * en el mismo indice
	 */
	public int[] multiplicaValoresArray(int[] array1, int[] array2) {
		//Se instancia un nuevo array de la misma longitud que el array1
		int[] resultado = new int[array1.length];
		//Comprobamos que los arrays miden lo mismo
		if(array1.length != array2.length) {
			System.out.println();
			System.out.println("Los array deben tener la misma medida");
			return null;
		}else {
			try {
				//Recorremos el array resultado asignando como valor el resultado de la multiplicacion de los valores indice
				for(int i = 0; i < resultado.length; i++) {
					resultado[i] = array1[i] * array2[i]; 
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return resultado;
	}
}
