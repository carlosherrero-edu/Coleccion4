Algoritmo SumarNumeros
	
	//algoritmo para sumar todos los n�meros del 1 al 100
	
	Definir sumador, contador Como Entero
	
	//inicializaci�n de valores
	sumador <-0    //variable que guarda la suma de todos los n�meros
	contador <- 1
	
	//procesamiento
	Mientras contador<=100 Hacer
		Escribir "N�mero ", contador
		sumador <- sumador + contador
		contador <- contador +1
	FinMientras
	
	
	
	//salida
	Escribir "La suma es: ", sumador
	
FinAlgoritmo
