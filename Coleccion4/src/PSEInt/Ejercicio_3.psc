Algoritmo DimensionesRotonda
	
	//ESte algoritmo lee de teclado el radio de una rotonda y calcula su per�metro y �rea
	// El valor de PI se toma de las constantes definidas del entorno
	
	//Declaraci�n de variables
	
	Definir radio Como Numerica
	Definir peri Como Numerica
	Definir area Como Numerica
	
	//Captura de entradas
	
	Escribir "Introduce el radio de la rotonda, en metros >>"
	Leer radio
	
	//Procesamiento
	peri <- 2* PI*radio
	area <- PI* radio*radio
	
	//Presentaci�n de resultados
	Escribir "El per�metro de la rotonda es de ", REDON(peri)," metros"
	Escribir "La superficie de la rotonda es de ", REDON(area)," metros cuadrados"
	
	
FinAlgoritmo
