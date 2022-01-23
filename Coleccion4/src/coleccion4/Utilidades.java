package coleccion4;




/**
 * Utilidades para los ejercicios de la Colección 4.
 * Clase compuesta de funciones - métodos estáticos- que se invocarán desde otras clases
 * @author Carlos Herrero
 * @version 27-dic-2020
 */



public class Utilidades {
	
	/**
	 * Función que determina si un número entero es par o impar
	 * Corresponde a solución del ejercicio 6 de la colección 3
	 * @param numero valor entero
	 * @return cadena que indica si es par o impar
	 */
	public static String dimeParidad ( int numero  ) {
		
		String resultado;
		
		if (numero % 2 == 0) {
			resultado = "PAR";
		} else {
			resultado = "IMPAR";
		}
		return resultado;		
		
	}
	
	
	/**
	 * Método para convertir una temperatura de grados Celsius a Faretheim
	 * corresponde a ejercicio 2 de la colección 3
	 * @param tempCelsius valor decimal de la temperatura en Celsius
	 * @return valor decimal con la temperatura equivalente en Faretheim
	 */
	public static double celsiusAFaretheim (double tempCelsius ) {
		//solución de Adrián Navarro
		double fahrenheit = (tempCelsius * 9 / 5) + 32;
        return fahrenheit;
	}
	
	/**
	 * Método para calcular el preio de un artículo después de aplicar un porcentaje de descuento
	 * corresponde a ejercicio 5 de la colección 3
	 * @param precioInicial precio del artículo antes de aplicar el descuento
	 * @param porcRebaja porcentaje de descuento, entre 0 y 100
	 * @return precio del artículo una vez aplicado el porcentaje de descuento
	 */
	public static double calcularPrecioRebajado (double precioInicial, double porcRebaja ) {
		//solución de Adrián Navarro
		double precioFinal;
        precioFinal=  precioInicial * (1 - porcRebaja /100.0);
        return precioFinal;
	}
	
	
	
	/**
	 * Método que devuelve un saludo según la hora del día
	 * corresponde a ejercicio 7 de la colección 3
	 * @param hora entero con el valor de la hora entre 0 y 23
	 * @return cadena con el saludo dependiendo de la hora
	 */
	public static String saludarSegunHora (int hora) {
		
		String saludo;			
			//solución de Jorge Alvarez
	        if (hora >= 6 && hora < 12) {
	            saludo = "Buenos días ";
	        } else {
	            if (hora >= 12 && hora < 20)
	            {
	            	saludo = "Buenas tardes ";
	            }
	
	            else {
	            	saludo = "Buenas noches ";
	                
	            }
	        }
		
        
        return saludo;

    }//Fin del método
	
	/**
	 * Conversor de temperaturas entre las escalas Celsius y Faretheim
	 * corresponde a ejercicio 8 de la colección 3
	 * @param temperatura valor de la temperatura de entrada, a convertir
	 * @param escala carácter que indica la escala de la temperatura de entrada: 'C' /'F'
	 * @return valor de la temperatura en la otra escala
	 */
	public static double conversorTemperaturas (double temperatura, char escala ) {
		//solución de Miguel Rodríguez
		double tempFinal = 0;
        
        if (escala == 'C' || escala == 'c' ) {
            tempFinal = 32 + 9 * (temperatura / 5);
        }
        else if(escala == 'F'|| escala == 'f' ) {
            tempFinal = (temperatura - 32) * 5 / 9;
        }
        
        return tempFinal;
	}
	

		/**
		 * Método para calcular el salario bonificado que se percibe según el importe de un salario inicial
		 * corresponde a ejercicio 10 de la colección 3
		 * @param salarioInicial importe del salario antes de aplicar la bonificación
		 * @return importe del salario una vez aplicada la bonificación
		 */
		/**
		 * @param salarioInicial
		 * @return
		 */
		public static double calcularSalarioBonificado(double salarioInicial ) {
			//solución de Jonnhie Herrera
			double bonificacion ;
	        
	        if (salarioInicial <= 1000) {
	            bonificacion = 1.2;
	        }
	        else if (salarioInicial <= 1800) {
	            bonificacion = 1.15;
	        }
	        else {
	            bonificacion = 1.10;
	        }
	        
	        double salarioFinal = (salarioInicial*bonificacion);
	        return (salarioFinal);
	}
		
		//corresponde a ejercicio 11 de la colección 3
		public static double conversorTemperaturas2 (double temperatura, char escala ) {
				return 0;
		}
		
		public static boolean validarEscalaTemperatura (char escala) {
			 boolean esValido = false;
		        if (escala == 'C' || escala == 'c' || escala == 'F' || escala == 'f' ) {
		            esValido = true;
		        }
		        return esValido;
		}
		

		 /**
		  * Método para devolver el importe literal de un billete de euros
		  * corresponde a ejercicio 12 de la colección 3
		  * corresponde a ejercicio 12 de la colección 3
		 * @param importeBillete entero con el valor del billete
		 * @return cadena con el valor del billete en letra
		 */
		public static String devolverImporteLiteral (int importeBillete) {
             
	            String resultado = switch (importeBillete){
	            
	                    case 5 -> 
	                            { yield "Cinco euros"; }
	                    case 10 -> 
	                            { yield "Diez euros"; }
	                    case 20 -> 
	                            { yield "Veinte euros"; }
	                    case 50 -> 
                        		{ yield "Cincuenta euros"; }
	                    case 100 -> 
	                            { yield "Cien euros"; }
	                    case 200 -> 
	                            { yield "Doscientos euros"; }
	                    case 500 -> 
	                            { yield "Quinientos euros"; }                 
	                    default ->
	                            { yield  "Ese billete no existe" ; }
	                    } ;
	                    
	            return resultado ;
	        }
		

		/**
		 * Método que devuelve el número mayor de entre 2 números de entrada
		 * corresponde a ejercicio 13 de la colección 3
		 * @param num1 primer número
		 * @param num2 segundo número
		 * @return valor del número mayor
		 */
		public static double devolverMayor (double num1, double num2 ) {
			
			double numeroMayor;
			
			if (num1> num2) {
				numeroMayor = num1;
			} else {
				numeroMayor = num2;
			}
			
			//   numeroMayor= (num1>num2 ? num1 : num2)  //con condicional ternario 
			
			return numeroMayor;
			
			
		}
		
		/**
		 * Método que devuelve el número mayor de entre 3 números de entrada
		 * corresponde a ejercicio 13 de la colección 3
		 * @param num1 primer número
		 * @param num2 segundo número
		 * @param num3 tercer número
		 * @return valor del número mayor de entre los tres
		 */
		public static double devolverMayor (double num1, double num2, double num3 ) {
			double numeroMayor;
			
			numeroMayor = num1;    //inicialmente suponemos que el número más grande es el primero
			
			if (num2 > numeroMayor) {   //comparo con el segundo número
				numeroMayor = num2; 
			}
			
			if (num3 > numeroMayor) {   //comparo con el tercer número
				numeroMayor = num3; 
			}
			
			return numeroMayor;
			
			
		}
		
		/**
		 * Método que devuelve el número mayor de entre cuatro números de entrada
		 * corresponde a ejercicio 13 de la colección 3
		 * @param num1 primer número
		 * @param num2 segundo número
		 * @param num3 tercer número
		 * @param num4 cuarto número
		 * @return valor del número mayor de entre los cuatro
		 */
		public static double devolverMayor (double num1, double num2, double num3, double num4 ) {
			double numeroMayor;
			
			numeroMayor = num1;    //inicialmente suponemos que el número más grande es el primero
			
			if (num2 > numeroMayor) {   //comparo con el segundo número
				numeroMayor = num2; 
			}
			
			if (num3 > numeroMayor) {   //comparo con el tercer número
				numeroMayor = num3; 
			}
			
			if (num4 > numeroMayor) {   //comparo con el cuarto número
				numeroMayor = num4; 
			}
			
			return numeroMayor;
						
		} //fin del método
		

	/**
	 * Función que cuenta el número de vocales presentes en una frase del alfabeto inglés
	 * corresponde a ejercicio 19 de la colección 3
	 * @param frase Cadena con la frase de entrada
	 * @return  número de vocales presentes en la frase
	 */
	public static int contarVocales(String frase) {
		int vocales=0;
		char letra;
		//obtenemos una frase mejorada eliminando espacios y convirtiendo todo a mayúsculas
		String frase_mayus= frase.trim().toUpperCase();
		//vamos recorriendo la frase mejorada y extrayendo cada carácter
		for (int i=0; i<frase_mayus.length(); i++) {
			letra = frase_mayus.charAt(i);
			if (letra=='A' ||letra=='E' ||letra=='I' ||letra=='O' ||letra=='U' ) {
				vocales++;			
			}
			
		}//fin del recorrido de la frase
		
		return vocales;
	}
	
	
	/**
	 * Función que determina si un a�o es o no bisiesto
	 * corresponde a ejercicio 20 de la colección 3
	 * @param a�o valor del a�o que comprobamos
	 * @return true si el a�o es bisiesto, false en caso contrario
	 */
	public static boolean esAñoBisiesto (int año) {
		
		boolean resultado = false;
		
		if (año%400 ==0) {
			resultado = true;
		
		} else {
			if (año%4 ==0 && año%100 !=0) {
				resultado = true;
			} 
		} 
		// en cualquier otro caso, no es bisiesto
		return resultado;
	}
	

	
}
	
	


