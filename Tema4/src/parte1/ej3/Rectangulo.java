package parte1.ej3;

public class Rectangulo {
	/*
	 * Crea un programa con una clase llamada Rectangulo que representará un
	 * rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano, por lo que
	 * la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
	 */

	private int x1;
	private int y1;
	private int x2;
	private int y2;

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
		// condicional if - else -> comprobar que valores son válidos
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
	}
	/**
	 * Devuelve coordenada X1
	 * @return
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Definir coordenada X1
	 * @param x1
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * Devuelve coordenada Y1
	 * @return
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Definir coordenada Y1
	 * @param y1
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * Devuelve coordenada X2
	 * @return
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Definir coordenada X2
	 * @param x2
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * Devuelve coordenada Y2
	 * @return
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Definir coordenada Y2
	 * @param y2
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

}
