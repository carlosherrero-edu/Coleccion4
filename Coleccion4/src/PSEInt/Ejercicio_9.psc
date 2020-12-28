Algoritmo ConversorFarentheim2
	//este algoritmo convierte a escala Faretheim una temperatura en grados Celsuis leída por teclado
	
	//Declaración de variables
	Definir tempIni, tempFin Como Real
	Definir unidad Como Caracter
	Definir escalaIni, escalaFin Como Caracter
	
	
	//Captura de entradas
	Escribir 'Introduce la temperatura'
	Leer tempIni
	Escribir 'Introduce la unidad (C/F)'
	Leer unidad
	
	
	//Procesamiento
	
	Si unidad='C' Entonces
		tempFin <- 32+9.0*tempIni/5.0
		escalaIni <- 'Celsius'
		escalaFin <- 'Faretheim'
		
	SiNo
		tempFin <- 5.0*(tempIni-32)/9.0
		escalaFin <- 'Celsius'
		escalaIni <- 'Faretheim'
	FinSi
	
	
	//Presentación de resultados
	Escribir  tempIni, ' grados ',escalaIni,' equivalen a ', tempFin, ' grados ', escalaFin
FinAlgoritmo

