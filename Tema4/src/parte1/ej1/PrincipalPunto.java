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
		System.out.println("Punto 1: " + p1.getX() + "," + p1.getY());
		System.out.println("Punto 2: " + p2.getX() + "," + p2.getY());
		System.out.println("Punto 3: " + p3.getX() + "," + p3.getY());

		// modificar coordenadas
		// punto 1
		p1.setX(p1.getX() - 2);
		p1.setY(p1.getY() + 10);

		// punto 2
		p2.setX(p2.getX() * 2);
		p2.setY(p2.getY() / 10);

		// punto 3
		p3.setX(p3.getX() + 4);
		p3.setY(p3.getY() - 2);

		System.out.println("\nCOORDENADAS MODIFICADAS POR PUNTO");

		// mostrar coordenadas modificadas por punto
		System.out.println("Punto 1: " + p1.getX() + "," + p1.getY());
		System.out.println("Punto 2: " + p2.getX() + "," + p2.getY());
		System.out.println("Punto 3: " + p3.getX() + "," + p3.getY());
		
		// modificar coordenadas
		// punto 1
		p1.setXY(3, 5);

		// punto 2
		p2.setXY(-5, 10);
		
		// modificar coordenadas
		// punto 3
		p3.setXY(3, 9);
		
		System.out.println("\nCOORDENADAS MODIFICADAS POR PUNTO (Setter Doble)");

		// mostrar coordenadas modificadas por punto
		System.out.println("Punto 1: " + p1.getX() + "," + p1.getY());
		System.out.println("Punto 2: " + p2.getX() + "," + p2.getY());
		System.out.println("Punto 3: " + p3.getX() + "," + p3.getY());
		
		// llamar a método distancia para calcular distancia entre 2 puntos
		System.out.println("\nDISTANCIA ENTRE 2 PUNTOS");
		System.out.println(p1.distancia(p3));
		
		// llamar a método toString para devolver cadena con las coordenadas de un punto
		System.out.println("\nCOORDENADAS PUNTO 1: " + p1.toString());

	}
}
