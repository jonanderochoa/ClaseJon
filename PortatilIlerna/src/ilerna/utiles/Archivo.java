package ilerna.utiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Archivo {
	
	private final String ARCHIVO = "logs.txt";
	private File archivo;
	/**
	 * Constructor. Inicializa el archivo. Si no existe lo crea
	 */
	public Archivo() {
		this.archivo = new File(ARCHIVO);
		//Si el archivo no existe
		if(!archivo.exists()) {
			try {
				//Creamos un nuevbo archivo 
				archivo.createNewFile();

			} catch (IOException e) {
				System.out.println("ERROR: "+e.getMessage());
			}	
		}
	}
	
	/**
	 * Metodo que recoge todo el contenido del fichero logs.txt y lo muestra por pantalla
	 */
	public void leerArchivo() {
		//Inicializamos el objeto FileReader
		FileReader entrada = null;
		
		try {
			//Instanciamos el objeto, apuntamos el lector al archivo logs.txt
			entrada = new FileReader(ARCHIVO);
			
			//Instanciamos la clase BufferedReader para poder usar el buffer de lectura
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			//Inicializamos la variable
			String linea = "";
			
			//Mientras no sea null. 
			while(linea != null) {
				linea = mibuffer.readLine();
				
				//Asi no nos aparece el null cuando llega al final del fichero
				if(linea != null) {
					System.out.println(linea);
				}
			}	
			//Cierra la conexion del buffer y la entrada
			mibuffer.close();
			entrada.close();
		} catch (FileNotFoundException e) {	
			System.out.println( "El fichero no se ha podido encontrar, contacte con el administrador");
			System.out.println("ERROR: "+ e.getMessage());
		}catch(IOException e) {
			System.out.println("ERROR: "+ e.getMessage());
		}
		
		
	}
	
	/**
	 * Metodo al que le pasaremos una cadena y la introducira en el fichero logs.txt
	 * @param cadena Cadena a introducir en el fichero.
	 */
	public void escribirArchivo(String cadena) {
		
		FileWriter entrada = null;
		try {
			//Apuntamos el lector al archivo logs.txt
			entrada = new FileWriter(ARCHIVO, true);

			//Inicializamos el buffer
			BufferedWriter mibuffer = new BufferedWriter(entrada);
			//Escribimos el contenido del buffer añadiendole saltos de linea
			mibuffer.write(cadena + "\n");
			
			//Cerramos la conexion del buffer y el lector
			mibuffer.close();
			entrada.close();
		} catch (IOException e) {
			System.out.println( "El fichero no se ha podido encontrar, contacte con el administrador");
			System.out.println("ERROR: "+ e.getMessage());
		}
	}
}
