package parte1.ej3;

public class PrincipalRectangulo {
	/*
	 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
	 * y (7,9)(2,3). Muestra por pantalla sus coordenadas, perímetros (suma de
	 * lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
	 * y vuelve a imprimir coordenadas, perímetros y áreas.
	 */
	
	public static void main(String[] args) {
		// instanciamos 2 objetos de la clase rectángulo y asignar coordenadas pasándolas como parámetros al constructor
		Rectangulo rect1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo rect2 = new Rectangulo(7, 9, 14, 11);

		// imprimir resultado en pantalla (coordenadas)
		System.out.println("Coordenadas 1er rectángulo:" + "(" + rect1.getX1() + "," + rect1.getY1() + ") y (" + rect1.getX2() + ","
				+ rect1.getY2() + ")");
		System.out.println("Coordenadas 2º rectángulo:" + "(" + rect2.getX1() + "," + rect2.getY1() + ") y (" + rect2.getX2() + ","
				+ rect2.getY2() + ")");

		// imprimir resultado en pantalla (perímetro)
		System.out.println("\nPerímetro 1er rectángulo: "
				+ (Math.abs(rect1.getX1() - rect1.getX2()) * 2 + Math.abs(rect1.getY1() - rect1.getY2()) * 2));
		System.out.println(
				"Perímetro 2º rectángulo: " + (Math.abs(rect2.getX1() - rect2.getX2()) * 2 + Math.abs(rect2.getY1() - rect2.getY2()) * 2));

		// imprimir resultado pantalla áreas
		System.out.println("\nÁrea 1er rectángulo: " + (Math.abs(rect1.getX1() - rect1.getX2()) * Math.abs(rect1.getY1() - rect1.getY2())));
		System.out
				.println("Área del 2º rectángulo: " + (Math.abs(rect2.getX1() - rect2.getX2()) * Math.abs(rect2.getY1() - rect2.getY2())));
	
        // Modificar coordenadas con setX1Y1 y setX2Y2
        rect1.setX1Y1(2, 2);
        rect1.setX2Y2(6, 7);

        rect2.setX1Y1(3, 4);
        rect2.setX2Y2(10, 12);

        // Mostrar coordenadas modificadas
        System.out.println("\nCoordenadas modificadas con setX1Y1 y setX2Y2:");
        System.out.println("Rectángulo 1: " + rect1);
        System.out.println("Rectángulo 2: " + rect2);

        // Modificar todas las coordenadas con setAll
        rect1.setAll(1, 1, 4, 6);
        rect2.setAll(5, 5, 12, 10);

        // Mostrar coordenadas después de setAll
        System.out.println("\nCoordenadas tras setAll:");
        System.out.println("Rectángulo 1: " + rect1);
        System.out.println("Rectángulo 2: " + rect2);

        // Mostrar perímetro y área después de modificaciones
        System.out.println("\nPerímetro y área tras modificaciones:");
        System.out.println("\nPerímetro rectángulo 1: " + rect1.getPerimetro());
        System.out.println("Área rectángulo 1: " + rect1.getArea());
        System.out.println("\nPerímetro rectángulo 2: " + rect2.getPerimetro());
        System.out.println("Área rectángulo 2: " + rect2.getArea());
		
	}

}