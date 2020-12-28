
	Algoritmo BuscarMayorYMenor
		Definir cuantos Como Entero
		Definir mayor, menor, numero Como Numerica
		cuantos <-0
		Repetir
			Escribir "Escribe un número (0 para salir) :"
			Leer numero
			//cuando el número sea cero, dejamos de introducir números
			Si (numero <> 0) Entonces
				//inicialización: Si es el primer número que introducimos, 
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
		Escribir "Números que componen la lista: ", cuantos
		Escribir "Número más grande: ", mayor
		Escribir "Número más pequeño: ", menor
FinAlgoritmo



