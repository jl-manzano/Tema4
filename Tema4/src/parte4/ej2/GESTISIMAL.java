package parte4.ej2;

import java.util.HashSet;

public class GESTISIMAL {

	// Creamos el conjunto articulos para almacenar todos los articulos
	private static HashSet<Articulo> articulos = new HashSet<Articulo>();

	/**
	 * Imprime todos los objetos almacenados en el conjunto
	 */
	public static void listado() {

		if (articulos.isEmpty()) {
			System.out.println("No hay artículos en el almacén");
		} else {
			for (Articulo a : articulos) {
				System.out.println(a);
			}
		}

	}

	/**
	 * Añade un articulo que recibe por parámetro al conjunto
	 * @param articulo
	 * @return Devuelve true si el artículo se ha añadido correctamente; false en case contrario
	 */
	public static boolean alta(Articulo articulo) {

		return articulos.add(articulo);
	}

	/**
	 * Elimina un articulo que recibe por parámetro del conjunto
	 * @param nombre
	 * @return Devuelve true si el artículo se ha eliminado correctamente; false en case contrario
	 */
	public static boolean baja(String nombre) {
		Articulo articulo = null;
		boolean elim = false;

		for (Articulo busqueda : articulos) {
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				articulo = busqueda;
			}
		}

		elim = articulos.remove(articulo);
		
		return elim;

	}
	
	/**
	 * Modifica el precio de un articulo que recibe por parámetro del conjunto
	 * @param precio
	 * @param nombre
	 * @return Devuelve true si el artículo se ha modificado correctamente; false en case contrario
	 */
	public static boolean modificar(double precio, String nombre) {
		boolean res = false;
		Articulo articulo = null;
		
		for (Articulo busqueda : articulos) {
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				articulo = busqueda;
				res = true;
			}
			
			articulo.setPrecio(precio);
			
		}
		
		return res;
	}
	
	/**
	 * Modifica el stock de un articulo que recibe por parámetro del conjunto
	 * @param cantidad
	 * @param nombre
	 * @return Devuelve true si el stock del artículo se ha podido incrementar correctamente; false en case contrario
	 */
	public static boolean entradaDeMercancia(int cantidad, String nombre) {
		boolean res = false;
		
		int stock;
		
		Articulo articulo = null;
		
		for (Articulo busqueda : articulos) {
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				articulo = busqueda;
			}
		}
		
		stock = articulo.getCuantosQuedan();
		
		if (cantidad > 0) {
			stock += cantidad;
			
			articulo.setCuantosQuedan(stock);

			res = true;
		
		}
		
		return res;
		
	}
	
	/**
	 * Modifica el stock de un articulo que recibe por parámetro del conjunto
	 * @param cantidad
	 * @param nombre
	 * @return Devuelve true si el stock del artículo se ha podido decrementar correctamente; false en case contrario
	 */
	public static boolean salidaDeMercancia(int cantidad, String nombre) {
		boolean res = false;
		
		int stock;
		
		Articulo articulo = null;
		
		for (Articulo busqueda : articulos) {
			if (busqueda.getNombre().equalsIgnoreCase(nombre)) {
				articulo = busqueda;
			}
		}
		
		stock = articulo.getCuantosQuedan();
		
		if (cantidad <= stock) {
			stock -= cantidad;
			
			articulo.setCuantosQuedan(stock);

			res = true;
		
		}
		
		return res;
		
	}

}
