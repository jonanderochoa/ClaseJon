package inicio;
import java.util.Scanner;

/**
 * Clase principal.
 * @author Jon Ander Ochoa Ruiz
 *
 */
public class Principal {

	/**
	 * La entrada salida de datos solo se produce en el main.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo una instancia de la clase Scanner para introducir valores por teclado.
		Scanner entrada = new Scanner(System.in);
		
		//Mostramos la cabecera.
		cabecera("BIBLIOTECA OCHOA");
		
		/**********************************************************************************/
		/*	INSTANCIAMOS LOS LIBROS														  */
		/**********************************************************************************/
		
		cabecera("NUEVO LIBRO");
		//Recogemos los valores del nuevo libro.
		System.out.println("Vamos a crear nuestro primer Libro: ");
		System.out.println();
		System.out.print("Introduce el ISBN del libro: ");
		String ISBN = entrada.nextLine();
		
		//Instanciamos el primer libro solo con el valor del ISBN.
		Libro libro1 = new Libro(ISBN);
		
		cabecera("NUEVO LIBRO");
		//Recogemos los valores del nuevo libro.
		System.out.println("Vamos a crear nuestro segundo Libro: ");
		System.out.println();
		System.out.print("Introduce el título del libro: ");
		String titulo = entrada.nextLine();
		System.out.print("Introduce el ISBN del libro: ");
		String ISBN2 = entrada.nextLine();
		System.out.print("Introduce el autor del libro: ");
		String autor = entrada.nextLine();
		System.out.print("Introduce el número de páginas del libro: ");
		int numeroPaginas = Integer.parseInt(entrada.nextLine());
		System.out.print("Introduce la editorial del libro: ");
		String editorial = entrada.nextLine();
		
		//Instanciamos el segundo libro con todos los valores.
		Libro libro2 = new Libro(titulo, ISBN2, autor, numeroPaginas, editorial, TipoPrestamo.DIARIO);
		
		//Instanciamos el tercer libro con el constructor vacio.
		Libro libro3 = new Libro();
		
		
		/**********************************************************************************/
		/*	INSTANCIAMOS LOS SOCIOS														  */
		/**********************************************************************************/
		
		cabecera("NUEVO SOCIO");
		//Recogemos los valores del nuevo socio.
		System.out.println("Vamos a crear nuestro primer Socio: ");
		System.out.println();
		System.out.print("Introduce el DNI del Socio: ");
		String DNI = entrada.nextLine();
		//Instanciamos el primer socio solo con el valor del DNI.
		Socio socio1 = new Socio(DNI);
		
		cabecera("NUEVO SOCIO");
		//Recogemos los valores del nuevo socio.
		System.out.println("Vamos a crear nuestro segundo Socio: ");
		System.out.println();
		System.out.print("Introduce el DNI del Socio: ");
		String DNI2 = entrada.nextLine();
		System.out.print("Introduce el nombre del Socio: ");
		String nombre = entrada.nextLine();
		System.out.print("Introduce los apellidos del Socio: ");
		String apellidos = entrada.nextLine();
		//Instanciamos el segundo Socio con todos los valores.
		Socio socio2 = new Socio(DNI2, nombre, apellidos);
		
		//Instanciamos el tercer Socio con el constructor vacio.
		Socio socio3 = new Socio();
		
		cabecera("DATOS ALMACENADOS");
		
		/**********************************************************************************/
		/*	MOSTRAMOS LOS LIBROS														  */
		/**********************************************************************************/
		
		System.out.println("Datos del primer Libro: ");
		System.out.println(libro1);
		System.out.println();
		System.out.println("Datos del segundo Libro: ");
		System.out.println(libro2);
		System.out.println();
		System.out.println("Datos del tercer Libro: ");
		System.out.println(libro3);
		System.out.println();
		
		/**********************************************************************************/
		/*	MOSTRAMOS LOS SOCIOS														  */
		/**********************************************************************************/
		
		System.out.println("Datos del primer Socio: ");
		System.out.println(socio1);
		System.out.println();
		System.out.println("Datos del segundo Socio: ");
		System.out.println(socio2);
		System.out.println();
		System.out.println("Datos del tercer Socio: ");
		System.out.println(socio3);
		System.out.println();
		
		/**********************************************************************************/
		/*	MODIFICAMOS LOS LIBROS														  */
		/**********************************************************************************/
		
		cabecera("MODIFICANDO LIBROS");
		//Recogemos los valores del libro modificado.
		System.out.println("Vamos a modificar nuestro primer Libro: ");
		System.out.println();
		System.out.print("Introduce el nuevo autor del libro: ");
		String autorLibro1 = entrada.nextLine();
		libro1.setAutor(autorLibro1);
		System.out.print("Introduce la nueva editorial del libro: ");
		String editorialLibro1 = entrada.nextLine();
		libro1.setEditorial(editorialLibro1);
		System.out.print("Introduce el nuevo número de páginas del libro: ");
		int numeroPaginasLibro1 = Integer.parseInt(entrada.nextLine());
		libro1.setNumeroPaginas(numeroPaginasLibro1);
		System.out.print("Introduce el nuevo título del libro: ");
		String tituloLibro1 = entrada.nextLine();
		libro1.setTitulo(tituloLibro1);
		
		//Recogemos los valores del libro modificado.
		System.out.println();
		System.out.println("Vamos a modificar nuestro segundo Libro: ");
		System.out.println();
		System.out.print("Introduce la nueva editorial del libro: ");
		String editorialLibro2 = entrada.nextLine();
		libro2.setEditorial(editorialLibro2);
		
		//Recogemos los valores del libro modificado.
		System.out.println();
		System.out.println("Vamos a modificar nuestro tercer Libro: ");
		System.out.println();
		System.out.print("Introduce el nuevo título del libro: ");
		String tituloLibro3 = entrada.nextLine();
		libro3.setTitulo(tituloLibro3);
		

		/**********************************************************************************/
		/*	MODIFICAMOS LOS SOCIOS														  */
		/**********************************************************************************/
		
		cabecera("MODIFICANDO SOCIOS");
		//Recogemos los valores del Socio modificado.
		System.out.println("Vamos a modificar nuestro primer Socio: ");
		System.out.println();
		System.out.print("Introduce el nuevo nombre del Socio: ");
		String nombreSocio1 = entrada.nextLine();
		socio1.setNombre(nombreSocio1);
		System.out.print("Introduce las nuevos apellidos del Socio: ");
		String apellidosSocio1 = entrada.nextLine();
		socio1.setApellidos(apellidosSocio1);
		
		//Recogemos los valores del Socio modificado.
		System.out.println();
		System.out.println("Vamos a modificar nuestro segundo Socio: ");
		System.out.println();
		System.out.print("Introduce el nuevo nombre del Socio: ");
		String nombreSocio2 = entrada.nextLine();
		socio2.setNombre(nombreSocio2);
		
		//Recogemos los valores del Socio modificado.
		System.out.println();
		System.out.println("Vamos a modificar nuestro tercer Socio: ");
		System.out.println();
		System.out.print("Introduce los nuevos apellidos del Socio: ");
		String apellidosSocio3 = entrada.nextLine();
		socio3.setApellidos(apellidosSocio3);
		
		entrada.close();
		
		cabecera("MOSTRANDO DATOS FINALES");
		
		/**********************************************************************************/
		/*	MOSTRAMOS LOS LIBROS														  */
		/**********************************************************************************/
		
		System.out.println("Datos del primer Libro: ");
		System.out.println(libro1);
		System.out.println();
		System.out.println("Datos del segundo Libro: ");
		System.out.println(libro2);
		System.out.println();
		System.out.println("Datos del tercer Libro: ");
		System.out.println(libro3);
		System.out.println();
		
		/**********************************************************************************/
		/*	MOSTRAMOS LOS SOCIOS														  */
		/**********************************************************************************/
		
		System.out.println("Datos del primer Socio: ");
		System.out.println(libro1);
		System.out.println();
		System.out.println("Datos del segundo Socio: ");
		System.out.println(libro2);
		System.out.println();
		System.out.println("Datos del tercer Socio: ");
		System.out.println(libro3);
		System.out.println();
	}
	
	
	/**
	 * Metodo que genera la cabecera con el título pasado como parámetro
	 * @param titulo Título que se mostrará.
	 */
	private static void cabecera(String titulo) {
		System.out.println();
		System.out.println("################################################");
		System.out.println("################################################");
		System.out.println("               " + titulo + "                   ");
		System.out.println("################################################");
		System.out.println("################################################");
		System.out.println();
	}
}
