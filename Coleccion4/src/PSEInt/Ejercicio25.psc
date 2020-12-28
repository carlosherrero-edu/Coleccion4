Proceso CalcularSiglo
	
	Definir anio  , siglo Como Entero
	Definir centena, resto Como Entero
	
	//Entrada de datos
	Escribir 'Dime el año'
	Leer anio
	
	//proceso
	centena <- trunc(anio/100)
	resto <- anio mod 100
	
	//se puede mejorar...
	Si anio>0 Entonces
		Si resto <>0 Entonces
			siglo <- centena+1
		SiNo
			siglo <- centena
		FinSi
	SiNo
		Si resto <>0 Entonces
			siglo <- centena-1
		SiNo
			siglo <- centena
		FinSi
	FinSi
	
	Escribir siglo
FinProceso
