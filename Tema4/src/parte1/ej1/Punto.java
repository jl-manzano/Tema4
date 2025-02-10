package parte1.ej1;

public class Punto {

	/*
	 * Crea un programa con una clase llamada Punto que representará un punto de dos
	 * dimensiones en un plano. Solo contendrá dos atributos enteros llamados x e y
	 * (coordenadas).
	 */

	/*
	 * Modifica los atributos de Punto para que sean private. Fíjate que desde el
	 * main ya no te dejará utilizar ni modificar los atributos x e y de los
	 * objetos.
	 */
	private int x;
	private int y;

	/*
	 * Añadir a la clase Punto un constructor con parámetros que copie las
	 * coordenadas pasadas como argumento a los atributos del objeto.
	 */

	/**
	 * 
	 * @param x Representa la coordenada X
	 * @param y Representa la coordenada Y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getters
	/**
	 * Devuelve la coordenada X
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Devuelve la coordenada Y
	 * @return
	 */
	public int getY() {
		return y;
	}
	
	// Setters
	/**
	 * Definir Coordenada X
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Definir Coordenada Y
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Setter para definir las 2 coordenadas de un punto
	 * @param x Coordenada x del punto
	 * @param y Coordenada y del punto
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método para desplazar un punto
	 * @param dx Desplazamiento en eje X
	 * @param dy Desplazamiento en eje Y
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Método para calcular la distancia entre 2 puntos
	 * @param p Punto con el que se calcula la distancia
	 * @return Devuelve la distancia entre 2 puntos
	 */
	public double distancia(Punto p) {
		// variable para almacenar la distancia entre los dos puntos
		double distanciaP = 0;
		
		// calcular la distancia entre los 2 puntos
		distanciaP = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
		
		// devolver distancia
		return distanciaP;
	}

	/**
	 * Método para devolver las coordenadas de un punto "(x,y)"
	 * @return Devuelve las coordenadas de un punto
	 */
	public String toString() {
		return ("(" + this.x + "," + this.y + ")");
	}
	
}
