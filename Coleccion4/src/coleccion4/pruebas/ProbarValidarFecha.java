package coleccion4.pruebas;

import coleccion4.Utilidades;

/**
 * Clase de prueba para la función validarFecha, que comprueba si una fecha pasada como año, mes, día es correcta
 * @author Carlos H
 *
 */
public class ProbarValidarFecha {

	public static void main(String[] args) {
		// en las siguientes fechas, la validación debe fallar
		
		System.out.println("Casos de prueba que deben fallar: \n");
		System.out.println(Utilidades.validarFecha(-100, 1, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");  //año negativo
		System.out.println(Utilidades.validarFecha(0, 1, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");		//año 0 no existe
		System.out.println(Utilidades.validarFecha(10000, 1, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");	// año > 9999
		System.out.println(Utilidades.validarFecha(2020, 0, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA"); // mes 0
		System.out.println(Utilidades.validarFecha(2020, -6, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");  //mes negativo
		System.out.println(Utilidades.validarFecha(2020, 13, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");  // mes 13 no existe
		System.out.println(Utilidades.validarFecha(2020, 1, 0)? "Fecha CORRECTA" : "Fecha INCORRECTA");   // dia 0
		System.out.println(Utilidades.validarFecha(2020, 1, -10)? "Fecha CORRECTA" : "Fecha INCORRECTA"); //día negativo
		System.out.println(Utilidades.validarFecha(2020, 4, 31)? "Fecha CORRECTA" : "Fecha INCORRECTA");  //abril tiene 30 días
		System.out.println(Utilidades.validarFecha(2020, 12, 32)? "Fecha CORRECTA" : "Fecha INCORRECTA"); //diciembre tiene 31 días
		System.out.println(Utilidades.validarFecha(2020, 2, 30)? "Fecha CORRECTA" : "Fecha INCORRECTA"); //febrero nunca tiene 30 días
		System.out.println(Utilidades.validarFecha(1900, 2, 29)? "Fecha CORRECTA" : "Fecha INCORRECTA"); // 1900 no fue bisiesto
		System.out.println(Utilidades.validarFecha(2019, 2, 29)? "Fecha CORRECTA" : "Fecha INCORRECTA"); // 2019 no fue bisiesto
		
		// en las siguientes fechas, la validación debe ser correcta
		System.out.println("\n\nCasos de prueba que deben aceptarse: \n");
		System.out.println(Utilidades.validarFecha(2020, 1, 1)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2020, 1, 31)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2020, 2, 29)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2000, 2, 29)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2020, 12, 31)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2020, 4, 30)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		System.out.println(Utilidades.validarFecha(2020, 6, 30)? "Fecha CORRECTA" : "Fecha INCORRECTA");
		

	}

}
