package coleccion4.pruebas;

import java.util.Scanner;

import coleccion4.Utilidades;

//solución de Miguel

public class ProbarConversorTemperaturas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(" Introduce la escala y la temperatura. Por ejemplo:  F 212");
		
		char escala = teclado.next().charAt(0);
		
		double temperatura= teclado.nextDouble();
		
		if (Utilidades.validarEscalaTemperatura(escala)) {		
			System.out.println("La temperatura en la otra escala es " + Utilidades.conversorTemperaturas( temperatura, escala));
		} else {
			System.out.println("ESa escala no es válida");
		}
		

	}

}
