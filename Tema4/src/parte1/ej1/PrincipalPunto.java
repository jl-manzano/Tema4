package parte1.ej1;

public class PrincipalPunto {
	public static void main(String[] args) {
		/*
		 * En el main de la clase principal instancia 3 objetos Punto con las
		 * coordenadas (5,0), (10,10) y (-3,7). Muestra por pantalla sus coordenadas
		 * (utiliza un println para cada punto). Modifica todas las coordenadas (prueba
		 * distintos operadores como = + - += *=...) y vuelve a imprimirlas por
		 * pantalla.
		 */

		// instanciamos los puntos y asignar valores pasándolos como parámetros al constructor
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(-3, 7);

		System.out.println("COORDENADAS POR PUNTO");
		// mostrar coordenadas por punto
		System.out.println("Punto 1: " + p1.x + "," + p1.y);
		System.out.println("Punto 2: " + p2.x + "," + p2.y);
		System.out.println("Punto 3: " + p3.x + "," + p3.y);

		// modificar coordenadas
		// punto 1
		p1.x -= 2;
		p1.y += 10;

		// punto 2
		p2.x *= 2;
		p2.y /= 2;

		// punto 3
		p3.x += 4;
		p3.y -= 2;

		System.out.println("\nCOORDENADAS MODIFICADAS POR PUNTO");

		// mostrar coordenadas modificadas por punto
		System.out.println("Punto 1: " + p1.x + "," + p1.y);
		System.out.println("Punto 2: " + p2.x + "," + p2.y);
		System.out.println("Punto 3: " + p3.x + "," + p3.y);

	}
}
