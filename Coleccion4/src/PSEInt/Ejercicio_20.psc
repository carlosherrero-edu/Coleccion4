Algoritmo AñoBisiesto
	
	//definición de variables que se utilizarán
	Definir año Como Entero
	Definir esValido Como Logico
	Definir esBisiesto como  Cadena
	
	//entrada de datos
	Escribir "Introduce el año a comprobar"
	Leer año
	
	//inicialización de valores
	esValido <- Verdadero
	
	//procesamiento
	Si año>1582 Entonces
		Si año MOD 400 =0 Entonces
			esBisiesto <- 'Sí'
		SiNo
			Si (año MOD 4 =0 Y año MOD 100  <> 0)Entonces
				esBisiesto <- 'Sí'
			SiNo
				esBisiesto <- 'No'
			FinSi
		FinSi
	SiNo
		esValido <- Falso
	FinSi
	
	//salida de resultados
	Si esValido Entonces
		Escribir 'El año ', año, ' ',esBisiesto, ' es bisiesto'
	SiNo
		Escribir 'El año ', año, ' no forma parte del calendario gregoriano'
	FinSi
	
FinAlgoritmo
