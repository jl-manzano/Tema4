package parte1.ej1;

public class Punto {

	/*
	 * Crea un programa con una clase llamada Punto que representará un punto de dos
	 * dimensiones en un plano. Solo contendrá dos atributos enteros llamados x e y
	 * (coordenadas).
	 */

	int x;
	int y;

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

}
