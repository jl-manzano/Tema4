package parte3.ej1;

public class SumaNumeros {
	/*
	 * Diseña una clase que contenga dos funciones de nombre suma que hagan lo
	 * siguiente: La primera de las funciones recibirá dos argumentos de tipo entero
	 * y devolverá la suma de ambos. El valor a devolver también será entero. La
	 * segunda de las funciones recibirá dos argumentos de tipo double y devolverá
	 * la suma de ambos. El tipo a devolver debe ser también double.
	 */

	/**
	 * Función en que se pasan 2 nºs enteros como parámetro y devolverá la suma de
	 * ambos
	 * 
	 * @param num1 Número 1
	 * @param num2 Número 2
	 * @return Devuelve el resultado de la suma entre los dos números
	 */
	static int suma(int num1, int num2) {

		// devuelve el resultado de la suma entre los dos nºs
		return num1 + num2;
	}
	
	/**
	 * Función en que se pasan 2 nºs decimales como parámetro y devolverá la suma de
	 * ambos
	 * @param num1 Número 1
	 * @param num2 Número 2
	 * @return Devuelve el resultado de la suma entre los dos números
	 */
	static double suma(double num1, double num2) {

		// devuelve el resultado de la suma entre los dos nºs
		return num1 + num2;
	}

}
