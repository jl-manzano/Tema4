package parte1.ej4;

public class Articulo {
	/**
	 * Clase artículo en la que vamos a tener los atributos nombre, precio, iva y
	 * cuantosQuedan
	 */

	private String nombre;
	private double precio;
	private double iva;
	private int cuantosQuedan;

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

	/**
	 * Devuelve nombre de artículo
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Definir nombre del artículo
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve precio del artículo
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Definir precio del artículo
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Devuelve el IVA aplicado sobre el producto
	 * @return
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * Definir IVA aplicado sobre el producto
	 * @param iva
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * Devuelve el stock del producto
	 * @return
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Definir stock del producto
	 * @param cuantosQuedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	

}
