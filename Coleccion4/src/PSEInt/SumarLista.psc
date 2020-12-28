Algoritmo SumarLista
	Definir cuantos Como Entero
	Definir numero , suma Como Numerica
	cuantos <-0
	suma <-0 
	Repetir
		Escribir "Escribe un número (0 para salir) :"
		Leer numero
		//cuando el número sea cero, dejamos de introducir números
		Si (numero <> 0) Entonces
			suma <- suma + numero
			cuantos<- cuantos +1
		FinSi
	Hasta Que (numero=0)
	Escribir "Números que componen la lista: ", cuantos
	Escribir "Valor de la suma: ", suma
FinAlgoritmo
