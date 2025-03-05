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

	public static boolean alta(Articulo articulo) {

		return articulos.add(articulo);
	}

	public static boolean baja(String nombre) {
		Articulo articuloBorrar = null;
		boolean elim = false;

		for (Articulo articulo : articulos) {
			if (articuloBorrar == null && articulo.getNombre().equalsIgnoreCase(nombre)) {
				articuloBorrar = articulo;
			}
		}

		if (articuloBorrar != null) {
			articulos.remove(articuloBorrar);
			elim = true;
		}
		
		return elim;

	}
	
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

}
