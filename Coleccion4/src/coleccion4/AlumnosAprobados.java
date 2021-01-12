package coleccion4;

import java.util.Scanner;

//Cambio hecho en GitHub

public class AlumnosAprobados {
	
	 public static void main(String[] args) {
	        
	        Scanner teclado = new Scanner(System.in);

	        double nota;
	        
	        int numCont, totAprob, totAlum;

	        numCont = 0;    //controla el número de alumnos 
	        
	        totAprob = 0;   //cuenta cuántos aprobados tenemos. Hay que iniciarla a cero
	        
	        System.out.println("¿Cuantos alumnos hay en clase?");
	        totAlum = teclado.nextInt();
	        
	        while(numCont < totAlum){
	            numCont = numCont + 1;

	            System.out.println("Introduce nota del alumno número " + numCont);
	            nota = teclado.nextDouble();

	            if (nota >= 5){

	                totAprob++;
	            }

	        
	        } //fin del while
	        
	        teclado.close();
	        System.out.println("El total de alumnos aprobados es " + totAprob);
	        
	    }

}
