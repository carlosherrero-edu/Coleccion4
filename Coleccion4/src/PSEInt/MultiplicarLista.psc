Algoritmo MultiplicarLista
	Definir cuantos Como Entero
	Definir numero , producto Como Numerica
	cuantos <-0
	producto <-1
	Repetir
		Escribir "Escribe un n�mero (0 para salir) :"
		Leer numero
		//cuando el n�mero sea cero, dejamos de introducir n�meros
		Si (numero <> 0) Entonces
			producto <- producto * numero
			cuantos<- cuantos +1
		FinSi
	Hasta Que (numero=0)
	Escribir "N�meros que componen la lista: ", cuantos
	Escribir "Valor del producto: ", producto
FinAlgoritmo
