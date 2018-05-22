package ilerna.utiles;

public class Cadenas {
	
	/**
	 * EJERCICIO 2A
	 * Método que reciba una cadena de texto y devuelva el número de vocales que contiene la cadena. 
	 * Tengan en cuenta que las vocales pueden aparecer en minúsculas o en mayúsculas. No tenga en 
	 * cuenta las posibles vocales con tildes, diéresis u otros signos ortográficos. 	 
	 * @param cadena Cadena a la que queremos contar sus vocales
	 * @return Devuelve el numero de vocales.
	 */
	public static int contadorVocales(String cadena) {
		//Variable que cuenta el numero de vocales
		int contador = 0;
		//Se crea una instancia de un array de caracteres con las vocales.
		char[] vocales = new char[]{'a','e','i','o','u'};
		//Ponemos la cadena en minusculas
		cadena = cadena.toLowerCase();
		//Se recorre la cadena buscando los caracteres
		for(int i = 0; i < cadena.length(); i++) {
			//Por cada letra de la cadena se compara con cada una de las vocales
			for(int j = 0; j < vocales.length; j++) {
				if(vocales[j] == cadena.charAt(i) ) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	/**
	 * EJERCICIO 2B
	 * Método que dado un número y un carácter indique si el DNI formado por la unión de ambos es correcto.
	 * @param numero Se entrega en numero del DNI a comprobar
	 * @param letra Se entrega la letra del DNI a comprobar
	 * @return Boolean. Devuelve true si la letra es correcta y false sino.
	 */
	public static boolean validarDNI(int numero, char letra) {
		boolean valor = false;
		//array de cadenas
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		//Comprobamos que el dni tenga 8 numeros
		if(Integer.toString(numero).length() == 8) {
			//Calculamos el numero de letra
			int numeroLetra = numero % 23;
			
			//Ponemos la letra en mayusculas
			letra = Character.toUpperCase(letra);
			//Se comprueba si la letra introducida coincide con la letra calculada
			if(letras[numeroLetra] == letra) {
				valor = true;
			}
		}
		return valor;
	}
	
	/**
	 * EJERCICIO 2C
	 * Un método que reciba una cadena de texto y devuelva otra cadena igual a la primera, pero con 
	 * los caracteres en orden inverso.
	 * @param cadenaInicial Recibe una cadena de texto
	 * @return cadenaFinal La cadena inicial en orden inverso
	 */
	public static String invertirCadena(String cadenaInicial) {
		//Creamos la cadena final
		String cadenaFinal ="";
		//Recorremos la cadenaInicial en orden inverso añadiendola en ese orden a la cadenaFinal
		for( int i = cadenaInicial.length() - 1; i >= 0 ; i--) {
			cadenaFinal += cadenaInicial.charAt(i); 
		}
		return cadenaFinal;
	}
	
	/**
	 * EJERCICIO 2D
	 * método que recibe una cadena de texto y un carácter y devuelve el número de apariciones del 
	 * carácter en la cadena. Utilice los métodos indexOf y lasIndexOf de la clase String para acotar 
	 * la búsqueda.
	 * @param cadena Introduce una cadena
	 * @param letra Introduce la letra que queremos buscar en la cadena
	 * @return int Devuelve un entero con el numero de veces que le letra esta en la cadena.
	 */
	public static int cuentaLetras(String cadena, char letra) {
		int contador = 0;
		
		//Mientras eistan coincidencias..
		while(cadena.indexOf(letra) > -1) {
			//La cadena se iguala a la subcadena entre la posicion max y min donde hay coincidencias
			cadena = cadena.substring(cadena.indexOf(letra),cadena.lastIndexOf(letra));
			//Se incrementa la variable contador
			contador++;
		}
		return contador;
	}
}
