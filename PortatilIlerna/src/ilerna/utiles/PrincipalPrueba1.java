package ilerna.utiles;

public class PrincipalPrueba1 {

	public static void main(String[] args) {
		UtilesArrays utiles = new UtilesArrays();
		try {

			// ################################### EJERCICIO 1 #####################################
			
			//Ejemplo ejercicio 1a
			Utiles.titulo("Ejercicio 1a", "M�todo que dado un n�mero n, un l�mite inferior y un l�mite superior, devuelva un array con n n�meros \r\n enteros aleatorios con valores comprendidos entre el l�mite inferior y el l�mite superior.");
			int[] resultado = utiles.arrayAleatorio(6, 15, 5);
			Utiles.imprimirArray("N�meros aleatorios", resultado);
			
			//Ejemplo 1b
			Utiles.titulo("Ejercicio 1b", "M�todo que dado un array devuelva el mismo array, pero invertido.");
			int[] ejemplo = new int[]{1,2,3,4,5,6,7,8};
			Utiles.imprimirArray("Array entrada", ejemplo);
			int[] arrayInvertido = utiles.invierteArray(ejemplo);
			Utiles.imprimirArray("Array invertido", arrayInvertido);
			
			//Ejemplo 1c
			Utiles.titulo("Ejercicio 1c", "M�todo que reciba un n�mero entero tam y devuelva un array de enteros de tama�o tam donde cada elemento\r\n sea igual a su posici�n natural (1 para la primera posici�n, 2 para la segunda, y as� sucesivamente)");
			int[] arrayIncremental = utiles.arrayPorTamano(10);
			Utiles.imprimirArray("Array posici�n", arrayIncremental);
			
			//Ejercicio 1d
			Utiles.titulo("Ejercicio 1d", "M�todo que dados dos arrays del mismo tama�o devuelva otro array que contenga en cada posici�n el resultado\r\n de multiplicar los elementos situados en la misma posici�n de ambos arrays.");
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
			Utiles.titulo("Ejercicio 2a", "M�todo que reciba una cadena de texto y devuelva el n�mero de vocales que\r\n" + 
					"contiene la cadena. Tengan en cuenta que las vocales pueden aparecer en\r\n" + 
					"min�sculas o en may�sculas. No tenga en cuenta las posibles vocales con tildes,\r\n" + 
					"di�resis u otros signos ortogr�ficos.");
			String cadena = "Esta cadena debe tener 12 vocales";
			System.out.println(cadena);
			int numVoc = Cadenas.contadorVocales(cadena);
			System.out.println("N�mero de vocales: " + numVoc);
			
			//Ejemplo ejercicio 2b
			Utiles.titulo("Ejercicio 2b", "M�todo que dado un n�mero y un car�cter indique si el DNI formado por la\r\n" + 
					"uni�n de ambos es correcto.");
			int numero = 16080781;
			char letra = 'd';
			System.out.println("N�mero inicial: " + numero);
			System.out.println("Letra inicial: " + letra);
			System.out.println("V�lido: " + Cadenas.validarDNI(numero, letra));
			
			//Ejemplo ejercicio 2c
			Utiles.titulo("Ejercicio 2c", "M�todo que reciba una cadena de texto y devuelva otra cadena igual a la\r\n" + 
					"primera, pero con los caracteres en orden inverso.");
			String cadena2 = "Cadena de prueba";
			System.out.println("Cadena inicial: " + cadena2);
			System.out.println("Cadena invertida: " + Cadenas.invertirCadena(cadena2));
			
			//Ejemplo ejercicio 2d
			Utiles.titulo("Ejercicio 2d", "M�todo que reciba una cadena de texto y un car�cter y devuelva el n�mero de\r\n" + 
					"apariciones del car�cter en la cadena. Utilice los m�todos indexOf y lasIndexOf de\r\n" + 
					"la clase String para acotar la b�squeda.");
			String cadenaD = "Contaremos el n�mero de veces que esta frase tiene la letra 'r'";
			System.out.println("Cadena inicial: " + cadenaD);
			System.out.println("N�mero de 'r': " + Cadenas.cuentaLetras(cadenaD, 'r'));
			
		}catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
