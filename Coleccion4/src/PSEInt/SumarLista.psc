Algoritmo SumarLista
	Definir cuantos Como Entero
	Definir numero , suma Como Numerica
	cuantos <-0
	suma <-0 
	Repetir
		Escribir "Escribe un n�mero (0 para salir) :"
		Leer numero
		//cuando el n�mero sea cero, dejamos de introducir n�meros
		Si (numero <> 0) Entonces
			suma <- suma + numero
			cuantos<- cuantos +1
		FinSi
	Hasta Que (numero=0)
	Escribir "N�meros que componen la lista: ", cuantos
	Escribir "Valor de la suma: ", suma
FinAlgoritmo
