package coleccion4;

/**
 * Clase que imprime los caracteres ASCII del 33 al 126, con filas de 8 caracteres
 * Corresponde a Ejercicio 3.6 de la colección 4
 * @author Carlos H.
 *
 */
public class MostrarCaracteresAscii {

	 public static void main(String args[]) {
	        
	        for (int i=33; i<=126; i++){
	          System.out.format("%s ", (char)i);
	          if (i%8 ==0 ){
	              System.out.println();
	          }
	        }

	    
	    }//fin del main

}
