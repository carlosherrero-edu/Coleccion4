Algoritmo SumarNumeros
	
	//algoritmo para sumar todos los n�meros pares de 0 a 100
	
	Definir sumador, contador Como Entero
	
	//inicializaci�n de valores
	sumador <-0   //variable donde guardo la suma de todos los n�meros
	contador <- 2
	
	//procesamiento
	Mientras contador<=100 Hacer
		sumador <- sumador + contador
		contador <- contador +2
	FinMientras
	
	//salida
	Escribir "La suma es: ", sumador
	
FinAlgoritmo
