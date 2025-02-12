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
	 * Getter que devuelve coordenada x de la esquina inferior izquierda 
	 * @return Coordenada x de la esquina inferior izquierda
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Setter para definir coordenada x de la esquina inferior izquierda
	 * @param x1 Establecer coordenada x de la esquina inferior izquierda
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Getter que devuelve coordenada y de la esquina inferior izquierda 
	 * @return Coordenada y de la esquina inferior izquierda
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Setter para definir coordenada y de la esquina inferior izquierda
	 * @param y1 Establecer coordenada y de la esquina inferior izquierda
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Getter que devuelve coordenada x de la esquina superior derecha 
	 * @return Coordenada x de la esquina suoerior derecha
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Setter para definir coordenada x de la esquina superior derecha
	 * @param x1 Establecer coordenada x de la esquina superior derecha
	 */
	public void setX2(int x2) {
		if (x1 < x2) {

			this.x2 = x2;
		}
	}

	/**
	 * Getter que devuelve coordenada y de la esquina esquina superior derecha
	 * @return Coordenada y de la esquina superior derecha
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Setter para definir coordenada y de la esquina superior derecha
	 * @param y1 Establecer coordenada y de la esquina superior derecha
	 */
	public void setY2(int y2) {
		if (y1 < y2) {
			this.y2 = y2;
		}
	}
	
	/**
	 * Setter para definir las 2 coordenadas x e y de la esquina inferior izquierda de un rectángulo
	 * @param x1 Coordenada x de la esquina inferior izquierda
	 * @param y1 Coordenada y de la esquina inferior izquierda
	 */
	public void setX1Y1(int x1, int y1) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
		}

	}
	
	/**
	 * Setter para definir las 2 coordenadas x e y de la esquina superior derecha de un rectángulo
	 * @param x2 Coordenada x de la esquina superior derecha
	 * @param y2 Coordenada y de la esquina superior derecha
	 */
	public void setX2Y2(int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x2 = x2;
			this.y2 = y2;
		}

	}
	
	/**
	 * Setter para definir las 4 coordenadas de un rectángulo (x e y esquina inferior izquierda) (x e y esquina superior derecha)
	 * @param x1 Definir coordenada x de la esquina inferior izquierda
	 * @param y1 Definir coordenada y de la esquina inferior izquierda
	 * @param x2 Definir coordenada x de la esquina superior derecha
	 * @param y2 Definir coordenada y de la esquina superior derecha
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}
	
	/**
	 * Método para calcular el perímetro de un rectángulo
	 * @return Devuelve el perímetro del rectángulo
	 */
	public double getPerimetro() {
		// variable para almacenar resultado del cálculo del perímetro del rectángulo
		double perim;
		
		// calcular perímetro del rectángulo
		perim = (Math.abs(this.x1 - this.x2) * 2 + Math.abs(this.y1 - this.y2) * 2);
		
		// devolver perímetro del rectángulo
		return perim;
	}
	
	/**
	 * Método para calcular el área de un rectángulo
	 * @return Devuelve el área del rectángulo
	 */
	public double getArea() {
		// variable para almacenar resultado del cálculo del área del rectángulo
		double area;
		
		// calcular área del rectángulo
		area = (Math.abs(this.x1 - this.x2) * Math.abs(this.y1 - this.y2));
	
		// devolver área del rectángulo
		return area;
	
	}
	
	/**
	 * Método para devolver las coordenadas de ambas esquinas de un rectángulo "(x1,y1)" y "(x2,y2)"
	 * @return Devuelve las coordenadas de ambas esquinas de un rectángulo en formato String
	 */
	public String toString() {
		return ("(" + this.x1 + "," + this.y1 + ")" + " y " + "(" + this.x2 + "," + this.y2 + ")");
	}

}
