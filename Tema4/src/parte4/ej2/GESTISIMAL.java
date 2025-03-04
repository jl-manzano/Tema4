package parte4.ej2;

import java.util.HashSet;

import parte4.ej1.Alumno;

public class GESTISIMAL {

	// Creamos el conjunto articulos para almacenar todos los articulos
	private static HashSet<Articulo> articulos = new HashSet<Articulo>();

	public static void listado() {

		if (articulos.isEmpty()) {
			System.out.println("No hay artículos en el almacén");
		} else {
			for (Articulo a : articulos) {
				System.out.println(a);
			}
		}

	}
	
	public static void alta(Articulo articulo) {
		articulos.add(articulo);
		System.out.println("Artículo añadido con éxito");
	}

//	public static void baja(String nombre) {
//		articulos.remove(articulo);
//		System.out.println("Artículo añadido con éxito");
//	}
	
}
