package coleccion4;

/**
* Tipo enumerado con los posibles cuadrantes o ejesen que se encuentra un punto en el plano
* 
*/
enum Cuadrantes {
	PRIMERO,
	SEGUNDO,
	TERCERO, 
	CUARTO,
	EJE_HORIZONTAL,
	EJE_VERTICAL,
	ORIGEN
};


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
	public static boolean esA�oBisiesto (int a�o) {
		
		boolean resultado = false;
		
		if (a�o%400 ==0) {
			resultado = true;
		
		} else {
			if (a�o%4 ==0 && a�o%100 !=0) {
				resultado = true;
			} 
		} 
		// en cualquier otro caso, no es bisiesto
		return resultado;
	}
	
	/**
	 * Función que comprueba si un triángulo es válido a partir de las longitudes de sus tres lados.
	 * Se verifica si las longitudes son positivas y si cumplen las condiciones de desigualdad para formar un triángulo
	 * Corresponde al ejercicio 3.1 de la colección 4
	 * @param ladoA longitud del primer lado
	 * @param ladoB longitud del segundo lado
	 * @param ladoC longitud del tercer lado
	 * @return true si cumple las condiciones para ser triángulo válido, false en otro caso
	 */
	public static boolean esTrianguloValido (double ladoA, double ladoB, double ladoC) {
		
		boolean resultado = false;
		
		//comprobamos una a una todas las condiciones  de validación en una estructura condicional anidada
		if (ladoA >0 && ladoB >0 && ladoC >0) {      //1ª condición: lados positivos
			if (ladoA + ladoB > ladoC) {   //2ª condición: la suma de cada par de lados es mayor que el tercer lado
				if (ladoB + ladoC > ladoA) {
					if (ladoA + ladoC > ladoB) {
						//sólo si llegamos hasta aquí el triángulo es válido
						resultado=true;
					}
				}
			}
		} //si falla cualquiera de las condiciones anteriores, no es triángulo válido
		
		return resultado;
	}
	
	
	/**
	 * Función que determina el cuadrante o eje al que pertenece un punto en el plano
	 * Corresponde al ejercicio 3.2 de la colección 4
	 * @param posX valor de la coordenada horizontal del punto
	 * @param posY valor de la coordenada vertical del punto
	 * @return elemento de la enumeración Cuadrantes con el cuadrante o eje al que pertenece
	 */
	public static Cuadrantes dameCuadrante (double posX, double posY) {
		Cuadrantes resultado;
		
		// la comparación se efectúa mediante condicionales anidados, pero puede quedar más claro si se usan if /else if/else if...
		if (posX > 0 && posY>0) {
			resultado = Cuadrantes.PRIMERO;
		} else {
			if (posX < 0 && posY>0) {
				resultado = Cuadrantes.SEGUNDO;
			} else {
				if (posX < 0 && posY< 0) {
					resultado = Cuadrantes.TERCERO;
					
				} else {
					if (posX > 0 && posY< 0) {
						resultado = Cuadrantes.CUARTO;
					} else {
						if (posX != 0) {
							resultado= Cuadrantes.EJE_HORIZONTAL;
							
						} else {
							if (posY !=0) {
								resultado = Cuadrantes.EJE_VERTICAL;
							} else {
								resultado = Cuadrantes.ORIGEN;
							}
						}
					}
					
				}
			}
		} //fin de toda la estructura condicional anidada
			
		return resultado;
		
	} //fin del método
	
	/**
	 * Función para la validación de una fecha de la que se pasan el a�o, mes y día
	 * Es solución del ejercicio 3.3. de la colección 4
	 * @param a�o Valor del a�o, que debe estar comprendido entre 1 y 9999
	 * @param mes entero con el valor del mes, que debe estar comprendido entre 1 y 12
	 * @param dia entero con el valor del día, entre 1 y el último día del mes
	 * @return true si la fecha existe y es váida, false en otro caso
	 * @see Utilidades.esA�oBisiesto
	 */
	public static boolean validarFecha (int a�o, int mes, int dia) {
		
		boolean esValida = false;
		int diaMaximo;
		
		if (a�o >0 && a�o <= 9999) {        //valido el a�o
			//si el a�o es válido, comprobamos el mes 
			if (mes>=1 && mes <=12) {  //valido el mes
				//si el a�o y mes son válidos, determinamos el último día del mes 
					diaMaximo = switch (mes) {
								case 4, 6, 9, 11 -> 
									{ yield 30; }
									
								case 2 -> {
									//tratamiento específico para el mes de febrero
									if (Utilidades.esA�oBisiesto(a�o)) {
										{yield 29;}
										
									} else {
										{yield 28;}
									}
								}
								
								default ->
									{yield 31;}
								
					};  //fin del switch
				if (dia>=1 && dia <= diaMaximo) {
					//si llego hasta aquí, la fecha es válida
					esValida = true;
				}
			}
		}
		// en cualquier otro caso, la fecha no es válida
		
		return esValida;
	}
	
	
	/**
	 * Función que calcula el factorial de un número entero
	 * Corresponde a la solución del Ejercicio 3.4 de la colección 4
	 * @param num entero del que queremos calcular el factorial, suponemos que no negativo
	 * @return entero largo con el valor del factorial del número
	 */
	public static long calcularFactorial (int num) {
		
		long producto = 1L; //acumulador para el producto de los números sucesivos
		
		if (num >0) {
			for (int i=1; i<=num; i++) {
				producto *= i;
			}
		} //en otro caso, devolverá 1
		
		return producto;
	}
	
	
	
	/**
	 * Método para detectar el número más peque�o de una lista
	 * @param lista  lista de tama�o variable con números decimales
	 * @return valor del número más peque�o de la lista
	 * Si la lista está vacía, devolvérá el valor Double.NaN, que trataremos como error
	 */
	public static double   calcularMenor ( double ... lista) {
		
		double masPeque�o;
		
		//compruebo al principio si la lista está vacía
		if (lista.length ==0) {
			masPeque�o = Double.NaN;
		} else {
				//la lista tiene algún elemento
				masPeque�o= Double.MAX_VALUE;
				//el número decimal mayor posible que almacena JAva
				
				for ( double elemento : lista) {  //recorro la lista
					 if (masPeque�o > elemento) {
			                masPeque�o = elemento;
			            }
					
				}
		}
		
		return masPeque�o;
		
	} //fin del método
	
	

	/**
	 * Método para detectar el número más grande de una lista
	 * @param lista  lista de tama�o variable con números decimales
	 * @return valor del número más grande de la lista
	 * Si la lista está vacía, devolvérá el valor Double.NaA, que trataremos como error
	 */
	public static double   calcularMayor ( double ... lista) {
		
		double masGrande;
		
		//compruebo al principio si la lista está vacía
				if (lista.length ==0) {
					masGrande = Double.NaN;
				} else {
						//la lista tiene algún elemento
						masGrande= Double.MIN_VALUE;
						//el número decimal más peque�o posible que almacena JAva
						
						for ( double elemento : lista) {  //recorro la lista
							 if (masGrande <  elemento) {
					                masGrande = elemento;
					            }
							
						}
				}
		
		return masGrande;
		
	} //fin del método
	
	
	
//	public static double   calcularMenor ( String ... lista) {
//			
//			double masPeque�o;
//			double numero;
//			
//			//compruebo al principio si la lista está vacía
//			if (lista.length ==0) {
//				masPeque�o = Double.NaN;
//			} else {
//					//la lista tiene algún elemento
//					masPeque�o= Double.MAX_VALUE;
//					//el número decimal mayor posible que almacena JAva
//					
//					for ( String elemento : lista) {  //recorro la lista
//						//transformo el elmento en decimal
//						numero = Double.parseDouble(elemento);
//						 if (masPeque�o > numero) {
//				                masPeque�o = numero;
//				            }
//						
//					}
//			}
//			
//			return masPeque�o;
//			
//		} //fin del método
	
	
	/**
	 * Método para calcular la media aritmética de una lista de números
	 * @param lista  lista de tama�o variable con números decimales
	 * @return valor de la media aritmética de los valores de la lista
	 * Si la lista está vacía, devolvérá el valor Double.NaA, que trataremos como error
	 */
	public static double calcularMedia (double... lista) {
        //si la lista está vacía , lenght será 0 y Java devuelve NaN
		
		double suma = 0;
		
        for (double elemento : lista) {
            suma += elemento;
        }
    
        return (suma/lista.length);
    }
	

	/**
	 * Función que dibuja un rectángulo en consola  a base de un carácter especial , por defecto el asterisco
	 * Corresponde al ejercicio 3.8 de la colección 4
	 * @param num1 entero con la 1º dimensión del rectángulo, debe ser >0
	 * @param num2 entero con la 2ª dimensión del rectángulo, debe ser >0
	 * La función dibuja el rectángulo pedido, o muestra error si las dimensiones no son correctas
	 */
	public static void dibujaRectangulo (int num1, int num2) {
		
		int base, altura;
		char forma='*';      //caracter base para dibujar el rectángulo
		
		if (num1>0 && num2>0 ) {
			//ordenamos la base y la altura, para que la primera sea mayor
			if (num1 >=num2) {
				base = num1;
				altura= num2;
			} else {
				base = num2;
				altura= num1;
			}
			
			for (int i=0; i<altura; i++) {
				System.out.println();    //imprimimos un salto de línea entre filas
				for (int j=0; j<=base; j++) {
					//se dibuja el caracter seguido de un espacio
					System.out.format("%s ", forma);   
				}		
			} //fin del bucle exterior
			
			
		} else {
			//si las dimensiones introducidas no son correctas, mostramos un mensaje de error
			System.out.println(" No se puede dibujar el rectángulo");
		}
	} //fin del método
	

	/**
	 * Función que dibuja un triángulo en consola  a base de un carácter especial , por defecto el asterisco
	 * Corresponde al ejercicio 3.9, parte 1 de la Colección 4
	 * El triángulo consta del número de filas pasado; cada fila tiene un asterisco menos que la superior
	 * @param num1 entero con el número de filas del triángulo, debe estar comprendido entre 2 y 19
	 * La función dibuja el triángulo pedido, o muestra error si las dimensiones no son correctas
	 */
public static void dibujaTriangulo (int num) {
		
	
		char forma='*';   //caracter base para dibujar el rectángulo
		
		if (num >1 && num<20) {
			//cada fila consta de un asterisco menos, empezando por el valor de "num"
			for (int i=num; i>0; i--) {
				System.out.println();   //salto de línea entre fila y fila
				for (int j=1; j<=i; j++) {
					System.out.format("%s ", forma);  //se dibuja el caracter seguido de un espacio
				}			
			}
					
		} else {
			//el número introducido no cumple las condiciones de validación
			System.out.println(" No se puede dibujar el triángulo");
		}
	}//fin del método


/**
 * Función que dibuja un triángulo en consola  a base de un carácter especial , por defecto el asterisco
 * Corresponde al ejercicio 3.9, parte 2 de la Colección 4
 * En este triángulo, cada fila lleva 2 elementos menos que la anterior, de forma que queden centrados
 * @param num1 entero con el número de elementos de la fila inicial o superior , debe estar comprendido entre 2 y 49, y ser impar
 * La función dibuja el triángulo pedido, o muestra error si las dimensiones no son correctas
 */
public static void dibujaTriangulo2 (int num) {
	
	
		char forma='*'; //caracter base para dibujar el rectángulo
		int huecos;
		
		if (num >1 && num<50 && num%2 != 0) {
			
			for (int i=num; i>0; i-=2) {  
				//cada fila lleva 2 asteriscos menos que la anterior,empezando por el valor de num
				System.out.println(); //salto de línea inicial
				//número de huecos que debemos dejar al principio o al final de cada fila de asteriscos
				huecos = (num-i)/2;    
				
				for (int j=1; j<=num; j++) {
					if (j<= huecos || j> i+huecos) {
						System.out.print("  "); //dibujamos un hueco seguido de un espacio
					} else {
						System.out.format("%s ", forma); //dibujamos un carácter seguido de un espacio
					}				
				}				
			} //fin del bucle externo
					
		} else {
			//el valor de entrada no cumple las condiciones de validación
			System.out.println(" No se puede dibujar el triángulo");
		}
	}

	
}
	
	


