package parte1.ej2;

public class Persona {
	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad.
	 */

	/*
	 * Aplica el encapsulamiento básico a la clase Persona: Declara todos sus
	 * atributos como private y crea todos los getters y setters necesarios (un get
	 * y un set por atributo).
	 */

	private int edad;
	private String dni;
	private String nombre;
	private String apellidos;

	/*
	 * Añadir a la clase Persona un constructor con todos los parámetros. Modificar
	 * el main para utilizar el constructor con parámetros en vez de modificar
	 * directamente los atributos.
	 */

	/**
	 * 
	 * @param dni       DNI de la persona
	 * @param nombre    Nombre de la persona
	 * @param apellidos Apellidos de la persona
	 * @param edad      Edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		// comprobar que datos introducidos son correctos
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}

		if (edad >= 0) {
			this.edad = edad;
		}
	}

	// Getters
	/**
	 * Getter que devuelve el DNI de una persona
	 * 
	 * @return Devuelve el DNI de una persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Getter que devuelve el nombre de una persona
	 * 
	 * @return Devuelve el nombre de una persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Getter que devuelve los apellidos de una persona
	 * 
	 * @return Devuelve los apellidos de una persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Getter que devuelve la edad de una persona
	 * 
	 * @return Devuelve la edad de una persona
	 */
	public int getEdad() {
		return edad;
	}

	// Setters
	/**
	 * Setter para definir nombre de la persona
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Setter para definir los apellidos de la persona
	 * 
	 * @param apellidos Apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Setter para definir la edad de la persona
	 * 
	 * @param edad Edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método que comprueba si una persona es mayor de edad o no
	 * 
	 * @return Devuelve si la persona es mayor de edad / no
	 */
	public boolean esMayorEdad() {

		// variable boolean para almacenar si persona es > edad / no
		boolean isAdult;

		// comprobar si persona es > de edad
		isAdult = edad >= 18 ? true : false;

		// devolver si persona es adulta / no
		return isAdult;
	}

	/**
	 * Método que comprueba si una persona es jubilada o no (65 años / +)
	 * 
	 * @return Devuelve si la persona es jubilada / no
	 */
	public boolean esJubilado() {
		// variable boolean para almacenar si persona tiene 65 años / +
		boolean isRetired;

		// comprobar si persona es jubilado o no
		isRetired = edad >= 65 ? true : false;

		// devolver si persona es jubilada o no
		return isRetired;

	}

	/**
	 * Método que calcula la diferencia de edad entre 2 personas
	 * 
	 * @param p Persona nueva
	 * @return Devuelve el resultado de la diferencia de edad entre 2 personas
	 */
	public int diferenciaEdad(Persona p) {
		// variable para almacenar la diferencia de edad entre 2 personas
		int diferencia;

		// realizar diferencia de edades entre 2 personas
		diferencia = Math.abs(this.edad - p.edad);

		// devolver resultado de la diferencia de edad entre 2 personas
		return diferencia;

	}

	/**
	 * Método para devolver los datos correspondientes de una persona
	 * @return Devuelve los datos de una persona en formato String
	 */
	public String toString() {
		return "DNI: " + this.dni + "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: "
				+ this.edad;
	}

}
