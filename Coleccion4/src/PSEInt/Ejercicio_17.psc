Algoritmo ContarAprobados2
	
	//declaraci�n de variables
	Definir aprobados , contador, estudiantes como Entero
	Definir nota Como Real
	
	//Entrada del n�mero de estudiantes
	Escribir "�Cu�ntos estudiantes tenemos? >>>"
	Leer estudiantes
	//procesamiento + entrada de datos
	aprobados<-0 
	contador <- 1
	
	Mientras contador <= estudiantes Hacer
		Escribir "Dime la nota del alumno n�mero ",contador
		Leer nota
		Si nota>=5 Entonces
			aprobados <- aprobados+1
		FinSi
		contador <- contador +1
	FinMientras
	
	//salida de resultados
	Escribir "Han aprobado  ",aprobados, " alumnos"
	
FinAlgoritmo
