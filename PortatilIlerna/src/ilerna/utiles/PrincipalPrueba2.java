package ilerna.utiles;

import java.util.ArrayList;

import inicio.Libro;
import inicio.TipoPrestamo;

public class PrincipalPrueba2 {

	public static void main(String[] args) {
		// ##################################################   EJERCICIO 4A  ########################################################## 
		//Se crea las lista de nombres
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Laura");
		nombres.add("Manuel");
		nombres.add("Jon Ander");
		nombres.add("Paco");
		nombres.add("Loli");
		nombres.add("María Jesús");
		nombres.add("Puri");
		nombres.add("Unai");
		
		//Se crea la lista de apellidos
		ArrayList<String> apellidos = new ArrayList<String>();
		apellidos.add("Rodriguez");
		apellidos.add("Lopez");
		apellidos.add("Sanchez");
		apellidos.add("García");
		apellidos.add("Pérez");
		apellidos.add("Ochoa");
		apellidos.add("Campaña");
		apellidos.add("Sobrino");
		
		//Mostramos titulo
				Utiles.titulo("Ejercicio 4A", "Método que dada una lista con nombres de personas y otra lista con apellidos,\r\n" + 
						"devuelva una lista de cadenas de tamaño n que se genere con combinaciones\r\n" + 
						"aleatorias de un nombre y dos apellidos tomados de las dos listas de entrada." );
				
		//Mostramos las listas
		System.out.println();
		System.out.println("ENTRADA:");
		Utiles.imprimirArrayList("Nombres", nombres);
		Utiles.imprimirArrayList("Apellidos", apellidos);
		
		//Se llama al metodo estatico de la clase Listas para que mezcle aleatoriamenten un nombre con 2 apellidos
		ArrayList<String> nombreCompleto = Listas.combinacionNombresApellidos(nombres, apellidos, 5);
		
		//Mostramos los nombres completos combinados
		System.out.println();
		System.out.println("SALIDA:");
		Utiles.imprimirArrayListMultiLine(nombreCompleto);

		// ##################################################   EJERCICIO 4B  ########################################################## 
		//Se instancian los libros 
		Libro l1 = new Libro("La historia interminable", "FAN-1432524543", "Michael Ende" , 419, "	Alfaguara", TipoPrestamo.DIARIO);
		Libro l2 = new Libro("El niño con el pijama de rayas", "DRAM-4543234545", "John Boyne" , 217, "	Salamandra", TipoPrestamo.SEMANAL);
		Libro l3 = new Libro("Patria", "HIS-9788490663196", "Fernando Aramburu" , 648, "Tusquets Editores", TipoPrestamo.MENSUAL);
		Libro l4 = new Libro("El diario de Anne Frank", "ADU-9788466340564", "Ana Frank" , 160, "Debolsillo", TipoPrestamo.SEMANAL);
		Libro l5 = new Libro("El resplandor", "TER-9788490328729", "Stephen King" , 	599, "Pomaire", TipoPrestamo.DIARIO);
		Libro l6 = new Libro("Teo va al zoo", "INF-8498158273", "Violeta Denou" , 32, "Diario El País, S.A.", TipoPrestamo.DIARIO);
		
		//Se instancia un nuevo ArrayList
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		
		//Se añaden los libros al ArraylList
		listaLibros.add(l1);
		listaLibros.add(l2);
		listaLibros.add(l3);
		listaLibros.add(l4);
		listaLibros.add(l5);
		listaLibros.add(l6);
		
		//Mostramos titulo
		Utiles.titulo("Ejercicio 4B", "Método que, dada una lista de libros, devuelva un array de enteros con tres\r\n" + 
				"elementos que indiquen cuántos libros de préstamo diario, semanal, o mensual,\r\n" + 
				"respectivamente, hay en la lista de entrada." );
		
		System.out.println();
		System.out.println("ENTRADA:");
		//Se muestra la lista de libros
		for(int i = 0; i < listaLibros.size(); i++) {
			//Mostramos cada libro
			System.out.println(listaLibros.get(i));
		}
		
		//Llamamos al metodo estatico mostrarArrayPrestamos de la clase Listas pasandole la lista de libros y devuelve un array de 3 elementos
		int[] prestamo = Listas.mostrarArrayPrestamos(listaLibros);
		
		//Mostramos el array
		System.out.println();
		System.out.println("SALIDA: [DIARIO, SEMANAL, MENSUAL]");
		Utiles.imprimirArray("Prestamos", prestamo);
	}
	
	

}
