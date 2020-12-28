Algoritmo ContarVocales
	//Este algoritmo lee de teclado una frase en ingl�s y cuenta cu�ntas vocales tiene
	//usa las funciones de manipulaci�n de cadenas que ofrece PSInt
	
	
	//Declaraci�n de variables
	Definir num_vocales, i como Entero
	Definir frase, letra como Cadena
	
	//inicializaci�n de variables
	num_vocales<-0
	
	//entrada de valores
	Escribir "Introduce la frase en ingl�s  >>:"
	Leer frase
	
	//procesamiento. 
	
	//paso 1: Ponemos la frase en may�sculas:
	frase <- Mayusculas(frase)
	
	//paso 2: recorremos la frase car�cter a car�cter. Usaos la funci�n Longitud (cadena)
	//se puede configurar PSInt para que la primera posici�n de la cadena comience en 0 o en 1
	Para i<-0 Hasta Longitud(frase)-1 Con Paso 1 Hacer
		
		//la funci�n Subcadena toma un trozo de la cadena entre las posiciones indicadas
		letra <- SubCadena(frase,i,i)
		//comprobamos si la letra es vocal
		Escribir letra
		
		Si (letra='A' O letra='E' O letra='I' O letra='O' O letra='U') Entonces
		
			num_vocales <- num_vocales +1
		
		FinSi
	FinPara
	
	
	
	//impresi�n del resultado
	Escribir "La frase  ",frase, " tiene un total de  ", num_vocales, " vocales"
	
FinAlgoritmo
