Algoritmo Saludar
	
	
	//Este algoritmo lee de teclado el nombre de una persona y la hora del día
	//presenta un saludo de acuerdo con dicha hora
	
	//Declaración de variables
	Definir hora Como Entero
	Definir nombre, Saludo  Como Caracter
	//Captura de entrada
	Escribir "Escribe tu nombre : >>"
	Leer nombre
	Escribir "¿Qué hora es? (0-23)>>"
	Leer hora
	
	//Procesamiento
	Si (hora>=6 Y hora<12)  Entonces
		Saludo <- "Buenos días"
	SiNo
		Si (hora >=12 Y hora <20) Entonces
			Saludo <- "Buenas tardes"
		SiNo
			//si llegamos hasta aquí, significa que la hora está entre las 20 y las 6
		
			Saludo <- "Buenas noches"
		FinSi
	FinSi
	
	//Presentación de resultados
	Escribir Saludo, " ", nombre
	
FinAlgoritmo
