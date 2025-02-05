package parte1.ej4;

public class Articulo {
	/**
	 * Clase artículo en la que vamos a tener los atributos nombre, precio, iva y
	 * cuantosQuedan
	 */

	String nombre;
	double precio;
	double iva;
	int cuantosQuedan;

	/*
	 * Añade un constructor con 4 parámetros que asigne valores a nombre, precio,
	 * iva y cuantosQuedan. Dicho constructor deberá comprobar que los datos
	 * introducidos son válidos, modificando el valor del atributo cuando el valor
	 * de entrada sea válido y dejándolo con el valor por defecto cuando no lo es.
	 */

	/**
	 * 
	 * @param nombre        Nombre de la persona
	 * @param precio        Precio del artículo
	 * @param iva           IVA aplicado sobre el producto
	 * @param cuantosQuedan Stock
	 */

	public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
		// condicional if -> comprobar que valores son válidos
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (precio >= 0) {
			this.precio = precio;
		}

		if (iva >= 0) {

			this.iva = iva;
		}

		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}

	}

}
