package coleccion4.pruebas;

import coleccion4.Utilidades;

/**
 * Clase de prueba para la función dimeParidad()
 * @author Carlos H.
 *
 */
public class ProbarDimeParidad {

	public static void main(String[] args) {
		int prueba1, prueba2;
		
		prueba1 = 100;    //debe dar PAR
		prueba2 = 101;	 //debe dar IMPAR
		
		System.out.println("Paridad de " + prueba1 + " " + Utilidades.dimeParidad(prueba1));
		
		System.out.println("Paridad de " + prueba2 + " " + Utilidades.dimeParidad(prueba2));
		
//		System.out.println("Prueba1 : " +((Utilidades.dimeParidad(prueba1) =="PAR") ? "PASA" : "FALLA"));
//		System.out.println("Prueba2 : " +((Utilidades.dimeParidad(prueba2) =="IMPAR") ? "PASA" : "FALLA"));
	
	}

}
