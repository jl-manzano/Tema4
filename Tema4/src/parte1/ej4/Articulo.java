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
	 * Getter que devuelve nombre de artículo
	 * 
	 * @return Devuelve el nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para definir nombre del artículo
	 * 
	 * @param nombre Nombre del artículo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter que devuelve el precio del artículo
	 * 
	 * @return Devuelve el precio del artículo
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter para definir precio del artículo
	 * 
	 * @param precio Precio del artículo
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Getter que devuelve el IVA aplicado sobre el producto
	 * 
	 * @return Devuelve el IVA aplicado sobre el producto
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * Setter para definir IVA aplicado sobre el producto
	 * 
	 * @param iva IVA aplicado sobre el producto
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * Getter que devuelve el stock del producto
	 * 
	 * @return Devuelve el stock del producto
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Setter para definir stock del producto
	 * 
	 * @param cuantosQuedan Stock del producto
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Getter que devuelve el precio de un producto con IVA incluido
	 * @return Devuelve el precio de un producto con IVA incluido
	 */
	public double getPVP() {
		// variable para calcular el precio con IVA de un producto
		double precioPVP;

		// calcular precio con pvp incluido
		precioPVP = (this.precio * this.iva);

		// devolver precio con PVP incluido
		return precioPVP;
	}

	/**
	 * Getter que devuelve el PVP con un descuento incluido pasado como parámetro
	 * @param descuento Descuento aplicado sobre el producto
	 * @return Devuelve el PVP con un descuento incluido
	 */
	public double getPVPDescuento(double descuento) {
		// variable para calcular el precio con IVA de un producto
		double precioConDescuento;

		// calcular precio con pvp incluido
		precioConDescuento = (this.precio * this.iva * (1 - descuento / 100));

		// devolver precio con descuento
		return precioConDescuento;
	}

	/**
	 * Método para actualizar el stock de un producto tras vender cantidad 'x' pasada como parámetro
	 * @param cantidad Cantidad que se desea vender / desea comprar un cliente
	 * @return Devuelve si ha sido posible vender esa cantidad de ejemplares de un producto
	 */
	public boolean vender(int cantidad) {
		// variable boolean para almacenar si es posible vender x cantidad de productos
		boolean posible = true;
		
		// condicional if -> comparar cantidad de artículos que se quieren vender con el stock
		if (cantidad > this.cuantosQuedan) {
			posible = false;
		} else {
			this.cuantosQuedan = this.cuantosQuedan - cantidad;
		}
		
		// devolver resultado de evaluación si es posible o no vender x cantidad de productos
		return posible;

	}
	
	/**
	 * Método para actualizar el stock de un producto tras almacenar una cantidad 'x' pasada como parámetro
	 * @param cantidad Cantidad nueva que se va a sumar a la restante en el almacén
	 */
	public void almacenar(int cantidad){
		this.cuantosQuedan += cantidad;
	}
	
	/**
	 * Método para devolver los datos de un producto
	 * @return Devuelve los datos de un producto en formato String
	 */
	public String toString() {
		return ("Nombre del producto: " + this.nombre + ", Precio: " + this.precio + "€, Stock: " + this.cuantosQuedan);
	}

}
