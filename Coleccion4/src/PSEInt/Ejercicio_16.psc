Algoritmo ContarAprobados
	
	Definir aprobados , contador como Entero
	Definir nota Como Real
	
	aprobados<-0 
	contador <- 1
	
	Mientras contador<=10 Hacer
		Escribir "Dime la nota del alumno número ",contador
		Leer nota
		Si nota>=5 Entonces
			aprobados <- aprobados+1
		FinSi
		contador <- contador +1
	FinMientras
	
	Escribir "Han aprobado  ",aprobados, " alumnos"
	
FinAlgoritmo
