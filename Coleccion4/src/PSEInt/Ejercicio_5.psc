Algoritmo CalcularPrecioFinal
	//Este algoritmo aplica a un precio un porcentaje de IVA y calcula el precio final
	
	//Declaración de Variables
	Definir precio, iva, preciofinal Como Numero
	
	// captura de datos de entrada
	Escribir "Dime el precio sin IVA "
	Leer precio
	Escribir "¿Qué porcentaje de IVa tengo que aplicar?"
	Leer iva
	
	//procesamiento 
	preciofinal <- precio* (1 +iva/100)
	
	//presentación de resultados
	Escribir "El precio con IVa es de  " , preciofinal
	
	
FinAlgoritmo
