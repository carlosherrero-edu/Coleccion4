Algoritmo SumarNumeros
	
	//algoritmo para sumar todos los números del 1 al 100
	
	Definir sumador, contador Como Entero
	
	//inicialización de valores
	sumador <-0    //variable que guarda la suma de todos los números
	contador <- 1
	
	//procesamiento
	Mientras contador<=100 Hacer
		Escribir "Número ", contador
		sumador <- sumador + contador
		contador <- contador +1
	FinMientras
	
	
	
	//salida
	Escribir "La suma es: ", sumador
	
FinAlgoritmo
