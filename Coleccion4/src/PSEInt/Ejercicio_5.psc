Algoritmo CalcularPrecioFinal
	//Este algoritmo aplica a un precio un porcentaje de IVA y calcula el precio final
	
	//Declaraci�n de Variables
	Definir precio, iva, preciofinal Como Numero
	
	// captura de datos de entrada
	Escribir "Dime el precio sin IVA "
	Leer precio
	Escribir "�Qu� porcentaje de IVa tengo que aplicar?"
	Leer iva
	
	//procesamiento 
	preciofinal <- precio* (1 +iva/100)
	
	//presentaci�n de resultados
	Escribir "El precio con IVa es de  " , preciofinal
	
	
FinAlgoritmo
