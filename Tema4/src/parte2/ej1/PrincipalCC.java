package parte2.ej1;

import java.util.Scanner;

public class PrincipalCC {
	public static void main(String[] args) {
		// instanciar 3 CC
		CuentaCorriente c1; // cuenta per1
        CuentaCorriente c2 = new CuentaCorriente("12345678A", "Juan Pérez", 1000); // cuenta per2
        CuentaCorriente c3 = new CuentaCorriente("87654321B", "María López", 200, CuentaCorriente.Nacionalidad.EXTRANJERA); // cuenta per3
        CuentaCorriente c4 = new CuentaCorriente("87654321B", "María López", 200, CuentaCorriente.Nacionalidad.EXTRANJERA); // cuenta per4
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// constante para almacenar dni del titular de la cuenta
		final String dni;

		// variable para almacenar nombre del titular de la cuenta
		String nombre;

		// variable para almacenar saldo inicial del titular de la cuenta
		double saldoInic;

		// variable para almacenar nacionalidad del titular de la cuenta
		String nacion;

		// pedir dni a usuario
		System.out.print("Introduce tu DNI: ");
		dni = sc.nextLine();

		//pedir nombre a usuario
		System.out.print("\nIntroduce tu nombre: ");
		nombre = sc.nextLine();

		// pedir saldo inicial a usuario
		System.out.print("\nIntroduce tu saldo inicial: ");
		saldoInic = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer

		// pedir nacionalidad a usuario
		System.out.print("\nIntroduce tu nacionalidad (ESPAÑOLA/EXTRANJERA): ");
		nacion = sc.nextLine().toUpperCase();

		// convertir nacionalidad introducida por usuario en un String en un valor del enum Nacionalidad
		CuentaCorriente.Nacionalidad nacionalidad;
		if (nacion.equals("ESPAÑOLA")) {
			nacionalidad = CuentaCorriente.Nacionalidad.ESPAÑOLA;
		} else {
			nacionalidad = CuentaCorriente.Nacionalidad.EXTRANJERA;
		}

		// ingresar datos en cuenta corriente
		c1 = new CuentaCorriente(dni, nombre, saldoInic, nacionalidad);

		// mostrar cuenta creada
		System.out.println("\nCuenta creada con éxito:");
		System.out.println(c1);

		// pedir a usuario cuánto dinero desea ingresar
		System.out.print("\n¿Cuánto dinero deseas ingresar?: ");
		double ingreso = sc.nextDouble();
		// condicional if -> comprobar si titular ha introducido una cantidad correcta de dinero a ingresar
		if (c1.ingresarDinero(ingreso)) {
			System.out.println("Ingreso exitoso. Nuevo saldo: " + c1.getSaldo() + "€");
		} else {
			System.out.println("No se pudo realizar el ingreso.");
		}

		// pedir a usuario cúanto dinero desea extraer
		System.out.print("\n¿Cuánto dinero deseas retirar?: ");
		double retiro = sc.nextDouble();
		// condicional if -> comprobar si titular ha introducido una cantidad correcta (no superior a la cantidad en la cuenta / < 0) de dinero a extraer
		if (c1.sacarDinero(retiro)) {
			System.out.println("Retiro exitoso. Nuevo saldo: " + c1.getSaldo() + "€");
		} else {
			System.out.println("No hay suficiente saldo.");
		}
		
	    // comparar cuentas usando equals
        System.out.println("\n¿Cuenta1 es igual a Cuenta2? " + c1.equals(c2)); //
        System.out.println("¿Cuenta3 es igual a Cuenta4? " + c3.equals(c4)); //
        System.out.println("¿Cuenta1 es igual a Cuenta3? " + c1.equals(c3)); //


		sc.close();

	}
}
