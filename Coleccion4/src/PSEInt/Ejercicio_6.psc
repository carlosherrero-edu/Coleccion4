Algoritmo ParOImpar
	
	//ESte algoritmo determina si un n�mero entero le�do por teclado es par o impar
	
	//Declaraci�n de variables
	Definir numero, resto Como Entera
	Definir resultado Como Caracter
	
	//Leer el n�mero
	Escribir "Escribe un n�mero entero"
	Leer numero
	
	//procesamiento

	resto <- numero MOD 2
	
	Si resto=0 Entonces
		resultado <- "PAR"
	SiNo
		resultado <-"IMPAR"
	FinSi
	
	//Presentaci�n de resultados
		Escribir numero, " es ", resultado
	
FinAlgoritmo

