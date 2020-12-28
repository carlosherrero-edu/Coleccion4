Algoritmo MultiplicarLista
	Definir cuantos Como Entero
	Definir numero , producto Como Numerica
	cuantos <-0
	producto <-1
	Repetir
		Escribir "Escribe un número (0 para salir) :"
		Leer numero
		//cuando el número sea cero, dejamos de introducir números
		Si (numero <> 0) Entonces
			producto <- producto * numero
			cuantos<- cuantos +1
		FinSi
	Hasta Que (numero=0)
	Escribir "Números que componen la lista: ", cuantos
	Escribir "Valor del producto: ", producto
FinAlgoritmo
