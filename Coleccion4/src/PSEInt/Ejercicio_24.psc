Algoritmo DivisoresNumero
	
	//declaración de variables que se utilizan
	DEfinir numero, limite, i Como Entero

	
	//entrada de valores con validación. Si es inferior a 1, volverá a pedirlo
	Repetir
		Escribir 'Introduce el número >>>'
		Leer numero
		Si numero<=0 Entonces
			Escribir 'El número debe ser mayor de 0. Vuelve a introducirlo'
		FinSi
	Hasta Que numero>0
	
	//inicialización de valores
	limite <- trunc(numero/2)
	
	//procesamiento y salida de resultados. Usamos un bucle for
	Para i<-1 Hasta limite Con Paso 1 Hacer
		Si numero MOD i =0  Entonces
			Escribir i , ' es divisor de ', numero
		FinSi
	FinPara
	
	//escribura del último resutlado posible
	Escribir numero , ' es divisor de ', numero
	
FinAlgoritmo
