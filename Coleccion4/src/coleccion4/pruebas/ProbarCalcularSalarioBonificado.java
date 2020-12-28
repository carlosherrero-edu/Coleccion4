package coleccion4.pruebas;

import java.util.Scanner;
import coleccion4.Utilidades;

public class ProbarCalcularSalarioBonificado {
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Salario inicial: ");
        double salarioInicial = entrada.nextDouble();
        if (salarioInicial >0) {
        	System.out.println("Salario final: " + 
        			Utilidades.calcularSalarioBonificado(salarioInicial));
	    } else {
	    	System.out.println("El salario debe ser mayor de 0");
	    }
	}

}
