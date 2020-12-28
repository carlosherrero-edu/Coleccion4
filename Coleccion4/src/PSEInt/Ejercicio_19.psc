Algoritmo ContarVocales
	//Este algoritmo lee de teclado una frase en inglés y cuenta cuántas vocales tiene
	//usa las funciones de manipulación de cadenas que ofrece PSInt
	
	
	//Declaración de variables
	Definir num_vocales, i como Entero
	Definir frase, letra como Cadena
	
	//inicialización de variables
	num_vocales<-0
	
	//entrada de valores
	Escribir "Introduce la frase en inglés  >>:"
	Leer frase
	
	//procesamiento. 
	
	//paso 1: Ponemos la frase en mayúsculas:
	frase <- Mayusculas(frase)
	
	//paso 2: recorremos la frase carácter a carácter. Usaos la función Longitud (cadena)
	//se puede configurar PSInt para que la primera posición de la cadena comience en 0 o en 1
	Para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		
		//la función Subcadena toma un trozo de la cadena entre las posiciones indicadas
		letra <- SubCadena(frase,i,i)
		//comprobamos si la letra es vocal
		Escribir letra
		
		Si (letra='A' O letra='E' O letra='I' O letra='O' O letra='U') Entonces
		
			num_vocales <- num_vocales +1
		
		FinSi
	FinPara
	
	
	
	//impresión del resultado
	Escribir "La frase  ",frase, " tiene un total de  ", num_vocales, " vocales"
	
FinAlgoritmo
