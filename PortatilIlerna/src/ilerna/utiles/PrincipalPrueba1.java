package ilerna.utiles;

public class PrincipalPrueba1 {

	public static void main(String[] args) {
		UtilesArrays utiles = new UtilesArrays();
		try {

			// ################################### EJERCICIO 1 #####################################
			
			//Ejemplo ejercicio 1a
			Utiles.titulo("Ejercicio 1a", "Método que dado un número n, un límite inferior y un límite superior, devuelva un array con n números \r\n enteros aleatorios con valores comprendidos entre el límite inferior y el límite superior.");
			int[] resultado = utiles.arrayAleatorio(6, 15, 5);
			Utiles.imprimirArray("Números aleatorios", resultado);
			
			//Ejemplo 1b
			Utiles.titulo("Ejercicio 1b", "Método que dado un array devuelva el mismo array, pero invertido.");
			int[] ejemplo = new int[]{1,2,3,4,5,6,7,8};
			Utiles.imprimirArray("Array entrada", ejemplo);
			int[] arrayInvertido = utiles.invierteArray(ejemplo);
			Utiles.imprimirArray("Array invertido", arrayInvertido);
			
			//Ejemplo 1c
			Utiles.titulo("Ejercicio 1c", "Método que reciba un número entero tam y devuelva un array de enteros de tamaño tam donde cada elemento\r\n sea igual a su posición natural (1 para la primera posición, 2 para la segunda, y así sucesivamente)");
			int[] arrayIncremental = utiles.arrayPorTamano(10);
			Utiles.imprimirArray("Array posición", arrayIncremental);
			
			//Ejercicio 1d
			Utiles.titulo("Ejercicio 1d", "Método que dados dos arrays del mismo tamaño devuelva otro array que contenga en cada posición el resultado\r\n de multiplicar los elementos situados en la misma posición de ambos arrays.");
			int[] array1 = new int[] {2,4,6,8};
			int[] array2 = new int[] {1,3,5,7};
			int[] multi = utiles.multiplicaValoresArray(array1, array2);
			//Si no es null imprimimos el resultado
			if(multi != null) {
				Utiles.imprimirArray("Array 1  ", array1);
				Utiles.imprimirArray("Array 2  ", array2);
				System.out.println("----------------------------");
				Utiles.imprimirArray("Resultado", multi);
			}
			
			// ################################### EJERCICIO 2 #####################################
			
			//Ejemplo ejercicio 2a
			Utiles.titulo("Ejercicio 2a", "Método que reciba una cadena de texto y devuelva el número de vocales que\r\n" + 
					"contiene la cadena. Tengan en cuenta que las vocales pueden aparecer en\r\n" + 
					"minúsculas o en mayúsculas. No tenga en cuenta las posibles vocales con tildes,\r\n" + 
					"diéresis u otros signos ortográficos.");
			String cadena = "Esta cadena debe tener 12 vocales";
			System.out.println(cadena);
			int numVoc = Cadenas.contadorVocales(cadena);
			System.out.println("Número de vocales: " + numVoc);
			
			//Ejemplo ejercicio 2b
			Utiles.titulo("Ejercicio 2b", "Método que dado un número y un carácter indique si el DNI formado por la\r\n" + 
					"unión de ambos es correcto.");
			int numero = 16080781;
			char letra = 'd';
			System.out.println("Número inicial: " + numero);
			System.out.println("Letra inicial: " + letra);
			System.out.println("Válido: " + Cadenas.validarDNI(numero, letra));
			
			//Ejemplo ejercicio 2c
			Utiles.titulo("Ejercicio 2c", "Método que reciba una cadena de texto y devuelva otra cadena igual a la\r\n" + 
					"primera, pero con los caracteres en orden inverso.");
			String cadena2 = "Cadena de prueba";
			System.out.println("Cadena inicial: " + cadena2);
			System.out.println("Cadena invertida: " + Cadenas.invertirCadena(cadena2));
			
			//Ejemplo ejercicio 2d
			Utiles.titulo("Ejercicio 2d", "Método que reciba una cadena de texto y un carácter y devuelva el número de\r\n" + 
					"apariciones del carácter en la cadena. Utilice los métodos indexOf y lasIndexOf de\r\n" + 
					"la clase String para acotar la búsqueda.");
			String cadenaD = "Contaremos el número de veces que esta frase tiene la letra 'r'";
			System.out.println("Cadena inicial: " + cadenaD);
			System.out.println("Número de 'r': " + Cadenas.cuentaLetras(cadenaD, 'r'));
			
		}catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
