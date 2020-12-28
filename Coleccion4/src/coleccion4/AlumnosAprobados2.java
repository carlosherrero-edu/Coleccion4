package coleccion4;

import java.util.Scanner;

//solución de Miguel

public class AlumnosAprobados2 {
	
	 public static void main(String[] args) {
	        
	        Scanner teclado = new Scanner(System.in);

	        double nota;
	        
	        int numCont, totAprob, totAlum;

	
	        
	        totAprob = 0;   //cuenta cuántos aprobados tenemos. Hay que iniciarla a cero
	        
	        System.out.println("¿Cuantos alumnos hay en clase?");
	        totAlum = teclado.nextInt();
	        
	        for ( numCont = 0; numCont < totAlum; numCont = numCont + 1 ) {
	            

	            System.out.println("Introduce nota del alumno número " + (numCont+1));
	            nota = teclado.nextDouble();

	            if (nota >= 5){

	                totAprob++;
	            }

	        
	        } //fin del for
	        
	        teclado.close();
	        System.out.println("El total de alumnos aprobados es " + totAprob);
	        
	    }

}
