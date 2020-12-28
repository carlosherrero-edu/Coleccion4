Algoritmo ContarAprobados2
	
	//declaración de variables
	Definir aprobados , contador, estudiantes como Entero
	Definir nota Como Real
	
	//Entrada del número de estudiantes
	Escribir "¿Cuántos estudiantes tenemos? >>>"
	Leer estudiantes
	//procesamiento + entrada de datos
	aprobados<-0 
	contador <- 1
	
	Mientras contador <= estudiantes Hacer
		Escribir "Dime la nota del alumno número ",contador
		Leer nota
		Si nota>=5 Entonces
			aprobados <- aprobados+1
		FinSi
		contador <- contador +1
	FinMientras
	
	//salida de resultados
	Escribir "Han aprobado  ",aprobados, " alumnos"
	
FinAlgoritmo
