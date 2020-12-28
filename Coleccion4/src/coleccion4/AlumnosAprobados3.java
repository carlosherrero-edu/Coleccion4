package coleccion4;

import java.util.Scanner;

public class AlumnosAprobados3 {
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
        

        double nota = 0;
        int numCont = 0;
        int totAprob = 0;
        
        //pedimos la primera nota
        System.out.println( "Nota del alumno número  " + (numCont+1)+ " >");
        nota = teclado.nextDouble();
       
        
        while(nota>=0){
        	
        	//la nota es válida 
        	numCont ++;   //aumentamos en 1 el número de alumnos
        	 
        	if (nota >= 5) {
                 totAprob++;
             }
        	 
        	 //pedimos la siguiente nota
        	 System.out.println( "Nota del alumno número  " + (numCont+1)+ " >");
             nota = teclado.nextDouble();
          
        } //fin del bucle while
        
        System.out.println("El total de alumnos aprobados es " + totAprob);
        System.out.println("Calificaciones introducidas " + (numCont));
        
        System.out.format(" Porcentaje de alumnos aprobados:  %5.2f " ,((totAprob*100.0)/(numCont)));
        
        teclado.close();
    }
    
}
