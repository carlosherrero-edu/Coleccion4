Algoritmo Saludar
	
	
	//Este algoritmo lee de teclado el nombre de una persona y la hora del d�a
	//presenta un saludo de acuerdo con dicha hora
	
	//Declaraci�n de variables
	Definir hora Como Entero
	Definir nombre, Saludo  Como Caracter
	//Captura de entrada
	Escribir "Escribe tu nombre : >>"
	Leer nombre
	Escribir "�Qu� hora es? (0-23)>>"
	Leer hora
	
	//Procesamiento
	Si (hora>=6 Y hora<12)  Entonces
		Saludo <- "Buenos d�as"
	SiNo
		Si (hora >=12 Y hora <20) Entonces
			Saludo <- "Buenas tardes"
		SiNo
			//si llegamos hasta aqu�, significa que la hora est� entre las 20 y las 6
		
			Saludo <- "Buenas noches"
		FinSi
	FinSi
	
	//Presentaci�n de resultados
	Escribir Saludo, " ", nombre
	
FinAlgoritmo
