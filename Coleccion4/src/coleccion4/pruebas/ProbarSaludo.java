package coleccion4.pruebas;



import java.util.Scanner;

import coleccion4.Utilidades;
//solución de Jorge Alvarez


public class ProbarSaludo {
	
	

    public static void main(String[] args) {

        String nombre;
        int hora;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("¿Cómo te llamas");
        nombre = entrada.nextLine();
        
        System.out.println ("¿Qué hora es?");
        hora = Integer.parseInt(entrada.nextLine());
        
       String resultado = (hora>=0 && hora <24) ? ( Utilidades.saludarSegunHora(hora)+ " ,"  + nombre) : "Esta hora no es válida";
       
       System.out.println(resultado);
        
//        if (Utilidades.validarHora(hora)) {
//        
//        		System.out.println(Utilidades.saludarSegunHora(hora)+ " ," + nombre);
//        } else {
//        	 System.out.println("Esa hora no existe");
//        }
        
        

    }

}
