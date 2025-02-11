package parte2.ej1;

public class CuentaCorriente {
	/*
	 * Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre, saldo y
	 * nacionalidad, el cual tendrá 2 valores: Española y Extranjera.
	 * 
	 * Añade los siguientes constructores: Con el DNI del titular de la cuenta y un
	 * saldo inicial. Con el DNI, nombre y el saldo inicial. Con el DNI, nombre, el
	 * saldo inicial y nacionalidad.
	 * 
	 */

	/**
	 * enumerado para la nacionalidad a la que pertenece la persona
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * DNI de la persona a la que pertenece la cuenta corriente
	 */
	private String dni;

	/**
	 * Nombre de la persona a la que pertenece la cuenta corriente
	 */
	private String nombre;

	/**
	 * Saldo de la persona a la que pertenece la cuenta corriente
	 */
	private double saldo;

	/**
	 * Constructor que inicializa una cuenta corriente con un DNI y un saldo
	 * inicial.
	 * 
	 * @param dni   DNI del titular de la cuenta
	 * @param saldo Saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}
	}

	/**
	 * Constructor que inicializa una cuenta corriente con un DNI, un nombre y un
	 * saldo inicial.
	 * 
	 * @param dni    DNI del titular de la cuenta
	 * @param nombre Nombre del titular de la cuenta
	 * @param saldo  Saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}
	}

	/**
	 * Constructor que inicializa una cuenta corriente con un DNI, un nombre, un
	 * saldo inicial y una nacionalidad.
	 * 
	 * @param dni    DNI del titular de la cuenta
	 * @param nombre Nombre del titular de la cuenta
	 * @param saldo  Saldo inicial de la cuenta
	 * @param nacion Nacionalidad del titular de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, Nacionalidad nacion) {

		if (dni != null && !dni.isEmpty()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (saldo > 100) {
			this.saldo = saldo;
		}

		switch (nacion) {
		case ESPAÑOLA -> nacion = Nacionalidad.ESPAÑOLA;
		case EXTRANJERA -> nacion = Nacionalidad.EXTRANJERA;
		default -> nacion = Nacionalidad.EXTRANJERA;
		}

	}

	/**
	 * Añade los getters/setters que consideres oportunos.
	 */

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sacar dinero: se extraerá una cantidad de dinero introducida por parámetro.
	 * Sólo se puede sacar dinero si existe saldo suficiente. Si es posible llevar a
	 * cabo la operación se resta la cantidad a sacar al saldo de la cuenta y
	 * devolverá true. En caso contrario, no se podrá sacar dinero y devolverá
	 * false.
	 * 
	 * Ingresar dinero: se incrementa el saldo. Hay que comprobar que el saldo a
	 * ingresar es una cantidad positiva. Devolverá true si se puede llevar a cabo
	 * la operación y false en caso contrario.
	 * 
	 * toString: Devuelve una cadena con la información de la cuenta corriente.
	 * equals: Dos cuentas corrientes se consideran iguales si coinciden el DNI y el
	 * nombre.
	 */

}
