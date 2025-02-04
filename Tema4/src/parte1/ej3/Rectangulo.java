package parte1.ej3;

public class Rectangulo {
	/*
	 * Crea un programa con una clase llamada Rectangulo que representará un
	 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
	 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
	 */

	int x1;
	int y1;
	int x2;
	int y2;

	/*
	 * Añade a Rectangulo un constructor con los 4 parámetros. Incluye un if que
	 * compruebe los valores. Si son válidos guardará los parámetros en el objeto.
	 * En caso contrario, los atributos se quedarán con los valores por defecto.
	 */
	
	/**
	 * 
	 * @param x1 Representa la coordenada X de la esquina inferior izquierda
	 * @param y1 Representa la coordenada Y de la esquina inferior izquierda
	 * @param x2 Representa la coordenada X de la esquina superior derecha
	 * @param y2 Representa la coordenada Y de la esquina superior derecha
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

}
