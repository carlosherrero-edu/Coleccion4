Algoritmo DimensionesRotonda
	
	//ESte algoritmo lee de teclado el radio de una rotonda y calcula su perímetro y área
	// El valor de PI se toma de las constantes definidas del entorno
	
	//Declaración de variables
	
	Definir radio Como Numerica
	Definir peri Como Numerica
	Definir area Como Numerica
	
	//Captura de entradas
	
	Escribir "Introduce el radio de la rotonda, en metros >>"
	Leer radio
	
	//Procesamiento
	peri <- 2* PI*radio
	area <- PI* radio*radio
	
	//Presentación de resultados
	Escribir "El perímetro de la rotonda es de ", REDON(peri)," metros"
	Escribir "La superficie de la rotonda es de ", REDON(area)," metros cuadrados"
	
	
FinAlgoritmo
