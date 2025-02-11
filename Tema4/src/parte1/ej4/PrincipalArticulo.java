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
		Articulo pijama = new Articulo("pijama", 24.5, 1.21, 50);

		// mostrar resultado con iva incluido
		System.out.println("Pijama - Precio:" + pijama.getPrecio() + "€ - IVA: " + pijama.getIva() + "% - " + "PVP:"
				+ String.format("%.2f", (pijama.getPrecio() + (pijama.getPrecio() * pijama.getIva()))) + "€");

		// cambiar precio
		pijama.setPrecio(10);

		// volver a mostrar resultado con iva incluido (precio cambiado)
		System.out.println("Pijama - Precio:" + pijama.getPrecio() + "€ - IVA: " + pijama.getIva() + "% - " + "PVP:"
				+ String.format("%.2f", (pijama.getPrecio() + (pijama.getPrecio() * pijama.getIva()))) + "€");
		
        // Mostrar precio con un 10% de descuento
        System.out.println("PVP con 10% de descuento: " + String.format("%.2f", pijama.getPVPDescuento(10)) + "€");

        // Intentar vender 20 unidades
        boolean venta1 = pijama.vender(20);
        System.out.println("\nIntento de vender 20 unidades: " + (venta1 ? "Venta realizada" : "Stock insuficiente"));
        System.out.println("Stock actual: " + pijama.getCuantosQuedan());

        // Intentar vender 40 unidades (no debería ser posible)
        boolean venta2 = pijama.vender(40);
        System.out.println("\nIntento de vender 40 unidades: " + (venta2 ? "Venta realizada" : "Stock insuficiente"));
        System.out.println("Stock actual: " + pijama.getCuantosQuedan());

        // Almacenar 30 unidades más
        pijama.almacenar(30);
        System.out.println("\nSe almacenan 30 unidades.");
        System.out.println("Stock actual: " + pijama.getCuantosQuedan());

        // Cambiar el precio del artículo
        pijama.setPrecio(30);
        System.out.println("\nNuevo precio: " + pijama.getPrecio() + "€");
        System.out.println("Nuevo PVP: " + String.format("%.2f", pijama.getPVP()) + "€");

        // Mostrar información final del artículo
        System.out.println("\nDATOS FINALES:");
        System.out.println(pijama);
	}

}