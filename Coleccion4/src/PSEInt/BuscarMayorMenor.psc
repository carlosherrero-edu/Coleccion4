
	Algoritmo BuscarMayorYMenor
		Definir cuantos Como Entero
		Definir mayor, menor, numero Como Numerica
		cuantos <-0
		Repetir
			Escribir "Escribe un n�mero (0 para salir) :"
			Leer numero
			//cuando el n�mero sea cero, dejamos de introducir n�meros
			Si (numero <> 0) Entonces
				//inicializaci�n: Si es el primer n�mero que introducimos, 
				//inicializamos mayor, menor
				Si (cuantos=0) Entonces
					mayor <- numero
					menor <- numero
				SiNo
					Si (numero > mayor) Entonces
						mayor <- numero
					Fin Si
					Si (numero < menor) Entonces
						menor <- numero
					Fin Si
				Fin Si
				cuantos<- cuantos +1
			FinSi
		Hasta Que (numero=0)
		Escribir "N�meros que componen la lista: ", cuantos
		Escribir "N�mero m�s grande: ", mayor
		Escribir "N�mero m�s peque�o: ", menor
FinAlgoritmo



