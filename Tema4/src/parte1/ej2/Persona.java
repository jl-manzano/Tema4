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
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
