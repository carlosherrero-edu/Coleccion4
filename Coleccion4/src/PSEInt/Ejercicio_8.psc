Proceso CalcularPrecioBillete
	
	Definir distancia, precio Como Real
	
	//entrada
	Escribir "Dime la distancia en kil�metros>>"
	Leer distancia
	
	//proceso
	Si distancia<1000 Entonces
		precio <- 300
	SiNo
		precio <- distancia*0.3
	FinSi
	
	//salida
	Escribir "El precio dei billete asciende a  ",precio, " euros"
	
FinProceso
