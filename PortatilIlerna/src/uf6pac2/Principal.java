package uf6pac2;

import java.util.ArrayList;

import ilerna.utiles.Utiles;

public class Principal {

	public static void main(String[] args) {
		
		Utiles.titulo("BORRADO DE LA BD", "Limpieza de la base de datos");
		//Creamos una instancia de la clase CocheCrud
		CocheCRUD cocheUtil = new CocheCRUD();
		//Primero comprobamos que la BBDD esta vacia y de no estarlo, borramos todos los datos
		cocheUtil.deleteAll();
		
		Utiles.titulo("PASOS REALIZADOS", "");
		System.out.println("1. CREAMOS LOS OBJETOS DE TIPO COCHE");
		//Creamos los 5 coches 
		Coche nuevoCoche1 = new Coche("234567654ASE3434", "1234QWE", "OPEL", "ASTRA K");
		Coche nuevoCoche2 = new Coche("45576834564RED22", "4321RTY", "BMW", "320D");
		Coche nuevoCoche3 = new Coche("425578YF565HTW456", "5678UIO", "MERCEDES", "C220");
		Coche nuevoCoche4 = new Coche("FGG5456577U8I8H6H7", "9009POI", "SEAT", "EXEO");
		Coche nuevoCoche5 = new Coche("BTRY4563T6U7U7JJJ7", "7654DFG", "JAGUAR", "X-TYPE");
		
		System.out.println("2. GUARDAMOS LOS OBJETOS DE TIPO COCHE EN LA BD");
		//guardamos los coches en BD
		cocheUtil.create(nuevoCoche1);
		cocheUtil.create(nuevoCoche2);
		cocheUtil.create(nuevoCoche3);
		cocheUtil.create(nuevoCoche4);
		cocheUtil.create(nuevoCoche5);
		
		System.out.println("3. RECOGEMOS EL CONTENIDO DE LA BD");
		//Recogemos la lista de coches de la BBDD
		ArrayList<Coche> miLista = cocheUtil.listaCoches();
		
		Utiles.titulo("COCHES CREADOS", "Muestra los coches que contiene la BD");
		
		//Recorremos la lista y mostramos sus valores
		for(int i = 0; i < miLista.size(); i++) {
			//Guardamos
			Coche coche = miLista.get(i);
			System.out.println(coche);
		}
		
		Utiles.titulo("PRUEBA DE BORRADO LÓGICO", "Prueba de borrado lógico");
		System.out.println("RECOGEMOS EL COCHE CON BASTIDOR: 234567654ASE3434");
		//Se busca un coche por un numero de bastidor
		System.out.println(cocheUtil.read("234567654ASE3434"));
		System.out.println("ELIMINAMOS DE FORMA LÓGICA EL COCHE CON BASTIDOR: 234567654ASE3434");
		//Se realiza el borrado logico de un coche
		cocheUtil.delete("234567654ASE3434");	
		System.out.println("RECOGEMOS EL COCHE CON BASTIDOR: 234567654ASE3434");
		//Se vuelve a busca el mismo coche para comprobar si se ha borrado
		System.out.println(cocheUtil.read("234567654ASE3434"));
	}
}
