Algoritmo A�oBisiesto
	
	//definici�n de variables que se utilizar�n
	Definir a�o Como Entero
	Definir esValido Como Logico
	Definir esBisiesto como  Cadena
	
	//entrada de datos
	Escribir "Introduce el a�o a comprobar"
	Leer a�o
	
	//inicializaci�n de valores
	esValido <- Verdadero
	
	//procesamiento
	Si a�o>1582 Entonces
		Si a�o MOD 400 =0 Entonces
			esBisiesto <- 'S�'
		SiNo
			Si (a�o MOD 4 =0 Y a�o MOD 100  <> 0)Entonces
				esBisiesto <- 'S�'
			SiNo
				esBisiesto <- 'No'
			FinSi
		FinSi
	SiNo
		esValido <- Falso
	FinSi
	
	//salida de resultados
	Si esValido Entonces
		Escribir 'El a�o ', a�o, ' ',esBisiesto, ' es bisiesto'
	SiNo
		Escribir 'El a�o ', a�o, ' no forma parte del calendario gregoriano'
	FinSi
	
FinAlgoritmo
