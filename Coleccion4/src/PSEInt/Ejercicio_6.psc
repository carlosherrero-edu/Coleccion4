Algoritmo ParOImpar
	
	//ESte algoritmo determina si un número entero leído por teclado es par o impar
	
	//Declaración de variables
	Definir numero, resto Como Entera
	Definir resultado Como Caracter
	
	//Leer el número
	Escribir "Escribe un número entero"
	Leer numero
	
	//procesamiento

	resto <- numero MOD 2
	
	Si resto=0 Entonces
		resultado <- "PAR"
	SiNo
		resultado <-"IMPAR"
	FinSi
	
	//Presentación de resultados
		Escribir numero, " es ", resultado
	
FinAlgoritmo

