package parte1.ej2;

import java.util.Scanner;

public class PrincipalPersona {
	/*
	 * En el main de la clase principal instancia dos objetos de la clase Persona.
	 * Luego, pide por teclado los datos de ambas personas (guárdalos en los
	 * objetos). Por último, imprime dos mensajes por pantalla (uno por objeto) con
	 * un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de
	 * edad”.
	 */

	public static void main(String[] args) {
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// instanciamos dos objetos de clase Persona (1 por persona)
		Persona p1;
		Persona p2;

		// variable para almacenar edad
		int edad;
		
		// variable para almacenar dni
		String dni;
		
		// variable para almacenar nombre
		String nombre;
		
		// variable para almacenar apellidos
		String apellidos;
		
		System.out.println("PERSONA 1");
		// pedir datos a persona 1
		System.out.println("Introduzca su DNI: ");
		dni = sc.nextLine();
		
		System.out.println("\nIntroduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("\nIntroduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		System.out.println("\nIntroduzca su edad: ");
		edad = sc.nextInt();
		// limpiar buffer
		sc.nextLine();
		
		// asignar valores pasándolos como parámetros al constructor
		p1 = new Persona(dni, nombre, apellidos, edad);
		
		// mostrar mensaje por pantalla 'p1'
		System.out.println("\n" + p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + (p1.getEdad() >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		
		
		System.out.println("\nPERSONA 2");
		
		// pedir datos a persona 2
		System.out.println("Introduzca su DNI: ");
		dni = sc.nextLine();
		
		System.out.println("\nIntroduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("\nIntroduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		System.out.println("\nIntroduzca su edad: ");
		edad = sc.nextInt();
		// limpiar buffer
		sc.nextLine();
		
		// asignar valores pasándolos como parámetros al constructor
		p2 = new Persona(dni, nombre, apellidos, edad);
		
		// mostrar mensaje por pantalla 'p2'
		System.out.println("\n" + p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + (p2.getEdad() >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		// cerrar scanner
		sc.close();
	}

}
