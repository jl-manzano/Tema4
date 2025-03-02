package parte4.ej2;

import java.util.HashSet;

public class GESTISIMAL {
	
	// Creamos el conjunto articulos para almacenar todos los articulos
	private static HashSet<Articulo> articulos = new HashSet<Articulo>();
	
	public static void listado() {
		
		for (Articulo a : articulos) {
			System.out.println(a);
			System.out.println();
		}
	}
}