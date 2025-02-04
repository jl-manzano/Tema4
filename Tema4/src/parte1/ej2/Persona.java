package parte1.ej2;

public class Persona {
	/*
	 * Crea un programa con una clase llamada Persona que representará los datos
	 * principales de una persona: dni, nombre, apellidos y edad.
	 */

	int edad;
	String dni;
	String nombre;
	String apellidos;

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
		if (dni != null && !dni.isEmpty()) { // comprobamos que los datos introducidos son correctos
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

		if (edad >= 0) { // comprobamos que los datos introducidos son correctos
			this.edad = edad;
		}
	}

}
