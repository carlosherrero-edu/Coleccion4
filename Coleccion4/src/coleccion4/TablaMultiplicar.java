package coleccion4;

/**
 * Clase para imprimir las tablas de multiplicar del 1 al 10 
 * @author Carlos H
 *
 */
public class TablaMultiplicar {

	public static void main(String args[]) {
        //imprimir la cabecera de la tabla
        System.out.print("\n      ");   //dejamos 6 espacios al principio
        for (int i=1; i<=10; i++){
            System.out.format("%3d   ",i); //imprimimos cada factor en 6 espacios, rellenando con blancos
        }
        
        //imprimir la tabla de multipilizar
      for (int i=1; i<=10; i++){
          System.out.format("%n%3d   ",i); //imprimimos el primer factor en 6 espacios, rellenando con blancos
          for (int j=1; j<=10; j++){
              System.out.format("%3d   ",i*j); //imprimimos el producto en 6 espacios, con blancos
          }
      }

    
    }//fin del main

}
