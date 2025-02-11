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
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para definir nombre del artículo
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter que devuelve el precio del artículo
	 * 
	 * @return
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter para definir precio del artículo
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Getter que devuelve el IVA aplicado sobre el producto
	 * 
	 * @return
	 */
	public double getIva() {
		return iva;
	}

	/**
	 * Setter para definir IVA aplicado sobre el producto
	 * 
	 * @param iva
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * Getter que devuelve el stock del producto
	 * 
	 * @return
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Setter para definir stock del producto
	 * 
	 * @param cuantosQuedan
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * 
	 * @return
	 */
	public double getPVP() {
		// variable para calcular el precio con IVA de un producto
		double precioPVP;

		// calcular precio con pvp incluido
		precioPVP = (this.precio * this.iva);

		// devolver precio con PVP incluido
		return precioPVP;
	}

	public double getPVPDescuento(double descuento) {
		// variable para calcular el precio con IVA de un producto
		double precioConDescuento;

		// calcular precio con pvp incluido
		precioConDescuento = (this.precio * this.iva * (1 - descuento / 100));

		// devolver precio con descuento
		return precioConDescuento;
	}

	/**
	 * 
	 * @param cantidad
	 * @return
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
	 * 
	 * @param cantidad
	 */
	public void almacenar(int cantidad){
		this.cuantosQuedan += cantidad;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return ("Nombre del producto: " + this.nombre + ", Precio: " + this.precio + "€, Stock: " + this.cuantosQuedan);
	}

}
