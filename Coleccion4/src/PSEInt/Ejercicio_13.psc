Algoritmo DameNumeroMayor
	
	//definici�n de variables
	Definir num1, num2, num3, mayor Como Numero
	
	//Entrada de valores
	Escribir "Primer n�mero >>>"
	Leer num1
	Escribir "Segundo n�mero >>>"
	Leer num2
	Escribir "Tercer n�mero >>>"
	Leer num3
	
	//procesamiento
	Si num1>=num2 Entonces
		Si num1>=num3 Entonces
			mayor <-num1
		SiNo
			mayor <-num3
		FinSi
	SiNo
		Si num2>=num3 Entonces
			mayor <-num2
		SiNo
			mayor <-num3
		FinSi
	FinSi
	
	//resultado
	Escribir "El n�mero mayor es  ", mayor
FinAlgoritmo
