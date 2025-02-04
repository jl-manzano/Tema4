package parte1.ej3;

public class PrincipalRectangulo {
	/*
	 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5)
	 * y (7,9)(2,3). Muestra por pantalla sus coordenadas, perímetros (suma de
	 * lados) y áreas (ancho x alto). Modifica todas las coordenadas como consideres
	 * y vuelve a imprimir coordenadas, perímetros y áreas.
	 */
	
	public static void main(String[] args) {
		// instanciar 2 rectángulos
		Rectangulo rect1 = new Rectangulo();
		Rectangulo rect2 = new Rectangulo();

		// asignar coordenadas del primer rectángulo
		rect1.x1 = 0;
		rect1.y1 = 0;
		rect1.x2 = 5;
		rect1.y2 = 5;

		// asignar coordenadas del segundo rectángulo
		rect2.x1 = 7;
		rect2.y1 = 9;
		rect2.x2 = 2;
		rect2.y2 = 3;

		// imprimir resultado en pantalla (coordenadas)
		System.out.println("Coordenadas 1er rectángulo:" + "(" + rect1.x1 + "," + rect1.y1 + ") y (" + rect1.x2 + ","
				+ rect1.y2 + ")");
		System.out.println("Coordenadas 2º rectángulo:" + "(" + rect2.x1 + "," + rect2.y1 + ") y (" + rect2.x2 + ","
				+ rect2.y2 + ")");

		// imprimir resultado en pantalla (perímetro)
		System.out.println("\nPerímetro 1er rectángulo: "
				+ (Math.abs(rect1.x1 - rect1.x2) * 2 + Math.abs(rect1.y1 - rect1.y2) * 2));
		System.out.println(
				"Perímetro 2º rectángulo: " + (Math.abs(rect2.x1 - rect2.x2) * 2 + Math.abs(rect2.y1 - rect2.y2) * 2));

		// imprimir resultado pantalla áreas
		System.out.println("\nÁrea 1er rectángulo: " + (Math.abs(rect1.x1 - rect1.x2) * Math.abs(rect1.y1 - rect1.y2)));
		System.out
				.println("Área del 2º rectángulo: " + (Math.abs(rect2.x1 - rect2.x2) * Math.abs(rect2.y1 - rect2.y2)));
	}

}