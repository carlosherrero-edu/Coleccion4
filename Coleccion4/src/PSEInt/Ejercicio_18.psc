Algoritmo ContarAprobados3
	
	//declaración de variables
	Definir aprobados , contador como Entero
	Definir nota Como Real
	
	
	//procesamiento + entrada de datos
	aprobados<-0 
	contador <- 0
	
	//leemos la primera nota. Esto podemos evitarlo con un bucle Repetir
	Escribir "Dime la nota del alumno número 1"
	Leer nota
	
	//procesaimiento de resultados
	Mientras nota >=0 Hacer
		
		Si nota>=5 Entonces
			aprobados <- aprobados+1
		FinSi
		contador <- contador +1
		
		Escribir "Dime la nota del alumno número ",(contador+1)
		Leer nota
	FinMientras
	
	//salida de resultados
	Escribir 'Calificaciones introducidas : ' ,contador
	Escribir 'Alumnos aprobados: ' ,aprobados
	Escribir 'Porcentaje de  aprobados: ' ,100*(aprobados/contador), '%'
	
FinAlgoritmo
