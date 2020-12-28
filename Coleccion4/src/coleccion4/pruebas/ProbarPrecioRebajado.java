package coleccion4.pruebas;

import coleccion4.Utilidades;

public class ProbarPrecioRebajado {

	public static void main(String[] args) {
		double precioInicial=1000;
		double porcRebaja=20;
		
		System.out.println("El precio rebajado es de  " + Utilidades.calcularPrecioRebajado(precioInicial, porcRebaja));

	}

}
