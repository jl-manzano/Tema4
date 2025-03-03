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
	 * Nacionalidad de la persona a la que pertenece la cuenta corriente
	 */
	private Nacionalidad nacion;

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
		
	    this.nacion = (nacion != null) ? nacion : Nacionalidad.EXTRANJERA; 


//		switch (nacion) {
//		case ESPAÑOLA -> nacion = Nacionalidad.ESPAÑOLA;
//		case EXTRANJERA -> nacion = Nacionalidad.EXTRANJERA;
//		default -> nacion = Nacionalidad.EXTRANJERA;
//		}

	}

	/**
	 * Añade los getters/setters que consideres oportunos.
	 */

	/**
	 * Getter que devuelve el nombre del titular de la cuenta
	 * 
	 * @return Devuelve el nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter para definir el nombre del titular de la cuenta
	 * 
	 * @param nombre Nombre del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Getter que devuelve el saldo de la cuenta corriente
	 * 
	 * @return Devuelve el saldo de la cuenta corriente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setter para definir el saldo de la cuenta corriente
	 * 
	 * @param saldo Saldo de la cuentas corriente
	 */
	public void setSaldo(double saldo) {
		if (saldo > 100) {
			this.saldo = saldo;
		}

	}

	/**
	 * Getter que devuelve el DNI del titular de la cuenta
	 * 
	 * @return Devuelve el DNI del titular de la cuenta
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

	/**
	 * Método sacarDinero que tiene como objeto sacar una cantidad de dinero pasada
	 * como parámetro de la cuenta corriente. Para ello, comprueba si existe saldo
	 * suficiente para llevar a cabo la operacion o no.
	 * 
	 * @param dinero Dinero que se desea extraer de la cuenta corriente
	 * @return Devuelve si es posible / no llevar a cabo la operación
	 */
	public boolean sacarDinero(double dinero) {
		// variable booleana -> almacenar si es posible sacar dinero de la cuenta
		// corriente o no
		boolean posible = true;

		// condicional if -> determinar si el saldo es >= al dinero que se quiere
		// extraer del cajero
		if (this.saldo < dinero && this.saldo > 0) {
			posible = false;
		} else {
			this.saldo -= dinero;
		}

		// devuelve si es posible o no sacar dinero que se desea extraer de la cuenta
		// corriente
		return posible;
	}

	/**
	 * Método ingresarDinero que tiene como objeto ingresar una cantidad de dinero
	 * pasada como parámetro a la cuenta corriente. Para ello, comprueba si la
	 * cantidad de dinero es > 0 para llevar a cabo la operacion o no.
	 * 
	 * @param dinero Dinero que se desea ingresar en la cuenta corriente
	 * @return Devuelve si es posible / no llevar a cabo la operación
	 */
	public boolean ingresarDinero(double dinero) {
		// variable para almacenar si es posible ingresar una cantidad de dinero (es
		// decir, es positiva)
		boolean posible = true;

		// condicional if -> determinar si el dinero que se desea ingresar en el cajero
		// es > 0
		if (dinero <= 0) {
			posible = false;
		} else {
			this.saldo += dinero;
		}

		// devuelve si es posible o no ingresar una cantidad de dinero (es +)
		return posible;
	}

	/**
	 * Método que devuelve un string con todos los atributos del objeto
	 * 
	 * @return Devuelve todos los atributos de la Cuenta Corriente
	 */
	@Override
	public String toString() {
		return "DNI: " + dni + ", nombre: " + nombre + ", saldo: " + saldo + "€, nacionalidad: " + nacion;
	}

	/**
	 * Método equals que compara 2 objetos
	 * 
	 * @return Devuelve si el DNI y el nombre de 2 personas (objetos) son iguales
	 */
	@Override
	public boolean equals(Object obj) {
		// variable booleana para almacenar si el DNI y nombre de 2 personas son iguales
		boolean sonIguales = false;

		// hacer parámetro obj un CuentaCorriente (castear) -> comparar y no de error
		CuentaCorriente objeto = (CuentaCorriente) obj;

		// condicional if -> determinar si Dni y nombre de 2 personas son iguales
		if (this.dni.equals(objeto.dni) && this.nombre.equals(objeto.nombre)) {
			sonIguales = true;
		}

		// devuelve si el DNI y nombre de 2 personas son iguales
		return sonIguales;
	}

}
