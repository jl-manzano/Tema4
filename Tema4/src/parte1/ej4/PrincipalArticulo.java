package parte1.ej4;

public class PrincipalArticulo {
	/*
	 * Crea un programa con una clase llamada Articulo con los siguientes atributos:
	 * nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa
	 * cuántos quedan en el almacén). En el main de la clase principal instancia un
	 * objeto de la clase artículo. Asígnale valores a todos sus atributos (los que
	 * quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
	 * IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el
	 * precio con IVA). Luego, cambia el precio y vuelve a imprimir el mensaje.
	 */

	public static void main(String[] args) {
		// instanciar objeto de clase artículo y asignar valores a atributos pasándolos
		// como parámetros al constructor
		Articulo pijama = new Articulo("pijama", 24.5, 0.21, 50);

		// mostrar resultado con iva incluido
		System.out.println("Pijama - Precio:" + pijama.getPrecio() + "€ - IVA: " + pijama.getIva() + "% - " + "PVP:"
				+ String.format("%.2f", (pijama.getPrecio() + (pijama.getPrecio() * pijama.getIva()))) + "€");

		// cambiar precio
		pijama.setPrecio(10);

		// volver a mostrar resultado con iva incluido (precio cambiado)
		System.out.println("Pijama - Precio:" + pijama.getPrecio() + "€ - IVA: " + pijama.getIva() + "% - " + "PVP:"
				+ String.format("%.2f", (pijama.getPrecio() + (pijama.getPrecio() * pijama.getIva()))) + "€");
	}

}