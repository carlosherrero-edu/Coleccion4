Algoritmo ConversorFarentheim3
	//este algoritmo convierte a escala Faretheim una temperatura en grados Celsuis leída por teclado
	//pregunta inicialmente la unidad y, si no es correcta, devuelve un mensaje de error
	
	//Declaración de variables
	Definir tempIni, tempFin Como Real
	Definir unidad Como Caracter
	Definir esCorrecta Como Logico
	Definir escalaIni, escalaFin Como Caracter
	
	
	//Captura de entradas
	Escribir 'Introduce la temperatura'
	Leer tempIni
	Escribir 'Introduce la unidad (C/F)'
	Leer unidad
	
	
	//Procesamiento
	esCorrecta <- Verdadero
	Si unidad='C' Entonces
		tempFin <- 32+9.0*tempIni/5.0
		escalaIni <- 'Celsius'
		escalaFin <- 'Faretheim'
		
	SiNo
		Si unidad='F' Entonces
			tempFin <- 5.0*(tempIni-32)/9.0
			escalaFin <- 'Celsius'
			escalaIni <- 'Faretheim'
		SiNo
			esCorrecta <- Falso
		FinSi
		
	FinSi
	
	
	//Presentación de resultados
	Si esCorrecta Entonces
		Escribir  tempIni, ' grados ',escalaIni,' equivalen a ', tempFin, ' grados ', escalaFin
	SiNo
		Escribir 'Has escrito una unidad de temperatura que no conozco'
	FinSi
	
FinAlgoritmo

