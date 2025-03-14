package parte4.ej2;

import java.util.Scanner;

public class PrincipalArticulo {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable opcion para almacenar la opcion introducida por el
		// usuario
		int opcion = 0;

		// Creamos la variable nombre para almacenar el nombre del artículo que introduzca
		// el usuario
		String nombre;

		// Creamos el booleano res para almacenar los resultados de las funciones
		boolean res = false;

		// Creamos la variable precio para almacenar el precio que introduzca el
		// usuario
		double precio;
		
		// Creamos la variable cantidad para almacenar la cantidad de stock que introduzca
		// el usuario
		int cantidad;

		do {

			// Pintamos el menu
			menu();

			// Pedimos al usuario que introduzca una opcion
			System.out.println("Introduzca una opcion");
			opcion = reader.nextInt();

			// Limpiamos el buffer del scanner
			reader.nextLine();

			// Acciones del menu
			switch (opcion) {

			// Opcion 1
			case 1 -> {

				// Imprimimos todos los artículos que se encuentran en la lista
				GESTISIMAL.listado();

			}
			// Opcion 2
			case 2 -> {

				// Creamos el artículo solicitando a usuario que introduzca valores por consola
				Articulo articulo = crearArticulo();

				// Damos de alta al artículo
				res = GESTISIMAL.alta(articulo);

				// Si se ha añadido correctamente
				if (res) {
					System.out.println("El artículo se ha añadido correctamente" + "\n");

					// Si no se ha podido añadir
				} else {
					System.err.println("El artículo no se ha podido añadir" + "\n");
				}

			}
			// Opcion 3
			case 3 -> {

				// Pedimos al usuario que introduzca el nombre del artículo a eliminar
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				
				// Damos de baja el artículo
				res = GESTISIMAL.baja(nombre);

				// Si se ha eliminado correctamente
				if (res) {
					System.out.println("El artículo se ha eliminado correctamente" + "\n");

					// Si no se ha podido eliminar
				} else {
					System.err.println("El artículo no se ha podido eliminar" + "\n");
				}

			}
			// Opcion 4
			case 4 -> {

				// Pedimos al usuario que introduzca el nombre del artículo a modificar
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				
				// Pedimos al usuario que introduzca el precio del articulo
				System.out.println("Introduzca el nuevo precio del articulo");
				precio = reader.nextDouble();
				
				// Modificamos el precio de un artículo
				res = GESTISIMAL.modificar(precio, nombre);

				// Si se ha modificado correctamente
				if (res) {
					System.out.println("El precio del artículo se ha modificado correctamente" + "\n");

					// Si no se ha podido modificar
				} else {
					System.err.println("El precio del artículo no se ha podido eliminar" + "\n");
				}

			}
			
			// Opcion 5
			case 5 -> {

				// Pedimos al usuario que introduzca el nombre del artículo a incrementar el stock
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				
				// Pedimos al usuario que introduzca el stock a reponer de un artículo
				System.out.println("Introduzca el stock a reponer del articulo");
				cantidad = reader.nextInt();
				
				// Incrementamos el stock de un artículo
				res = GESTISIMAL.entradaDeMercancia(cantidad, nombre);

				// Si se ha modificado correctamente
				if (res) {
					System.out.println("El stock del artículo se ha modificado correctamente" + "\n");

					// Si no se ha podido modificar
				} else {
					System.err.println("El stock del artículo no se ha podido modificar" + "\n");
				}

			}
			
			// Opcion 6
			case 6 -> {

				// Pedimos al usuario que introduzca el nombre del artículo a decrementar el stock
				System.out.println("Introduzca el nombre del artículo");
				nombre = reader.nextLine();
				
				// Pedimos al usuario que introduzca el stock a decrementar de un artículo
				System.out.println("Introduzca el stock a decrementar del articulo");
				cantidad = reader.nextInt();
				
				// Incrementamos el stock de un artículo
				res = GESTISIMAL.salidaDeMercancia(cantidad, nombre);

				// Si se ha modificado correctamente
				if (res) {
					System.out.println("El stock del artículo se ha modificado correctamente" + "\n");

					// Si no se ha podido modificar
				} else {
					System.err.println("El stock del artículo no se ha podido modificar" + "\n");
				}

			}
			
			// Opcion 7
			case 7 -> {
				System.out.println("Fin del programa" + "\n");
			}
			// Opcion no valida
			default -> {
				System.out.println("Introduzca una opción válida" + "\n");
			}
			}

			// Mientras que el usuario no introduzca la opcion 7 no saldra del menu
		} while (opcion != 7);

	}

	static void menu() {
		System.out.println("GESTISIMAL");
		System.out.println("----------");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificación");
		System.out.println("5. Entrada de mercancía");
		System.out.println("6. Salida de mercancía");
		System.out.println("7. Salir" + "\n");
	}

	static Articulo crearArticulo() {

		// Creamos la variable nombre
		String nombre;
		
		// Creamos la variable precio
		double precio;
		
		// Creamos la variable stock
		int stock;

		// Pedimos al usuario que introduzca el nombre del artículo
		System.out.println("Introduzca el nombre del artículo");
		nombre = reader.nextLine();
		
		// Pedimos al usuario que introduzca el precio del artículo
		System.out.println("Introduzca el precio del artículo");
		precio = reader.nextDouble();
		
		// Pedimos al usuario que introduzca el stock del artículo
		System.out.println("Introduzca el stock del artículo");
		stock = reader.nextInt();
		
		// Creamos el artículo con los valores almacenados introducidos por el usuario
		Articulo a = new Articulo(nombre, precio, stock);

		// Devolvemos el articulo que ha creado el usuario
		return a;
	}

}
