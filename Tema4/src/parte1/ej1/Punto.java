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

}
